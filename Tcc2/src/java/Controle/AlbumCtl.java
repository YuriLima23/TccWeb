/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.AlbumDao;
import Modelo.Album;
import Util.Upload;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eliane
 */
@WebServlet(name = "AlbumCtl", urlPatterns = {"/admin/album/AlbumCtl"})
public class AlbumCtl extends HttpServlet {

    private AlbumDao dao;
    private String pagina;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao;
        String id = " ";
        acao = request.getParameter("acao");
        if (acao == null) {
            acao = " ";
        }
        switch (acao) {
            case "del":
                id = request.getParameter("id");
                dao = new AlbumDao();
                Album categoria = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                dao.excluir(categoria);
                request.setAttribute("lista", dao.listar());
                pagina = "index.jsp";
                dao.fecharEmf();
                break;
            case "upd":
                id = request.getParameter("id");
                dao = new AlbumDao();
                Album obj = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("obj", obj);
                pagina = "upd.jsp";
                dao.fecharEmf();
                break;

            default:
                request.setAttribute("lista", listarAlbums());
                pagina = "index.jsp";
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    public List<Modelo.Album> listarAlbums() {
        dao = new AlbumDao();
        List<Modelo.Album> categorias = dao.listar();
        return categorias;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg;

        //definir local de destino dos arquivos
        //Processar o formulário
        pagina = "add.jsp";

        Album obj = new Album();
        dao = new AlbumDao();
        Upload up = new Upload();
        //definir local de destino dos arquivos
        up.setFolderUpload("imagem");
        Boolean deucerto;
        if (up.formProcess(getServletContext(), request)) {

            //Testa se é alterar (com ID) ou cadastrar(sem ID)
            if (up.getForm().get("id") != null) {

                String meuid = up.getForm().get("id").toString();
                obj = dao.buscarPorChavePrimaria(Integer.parseInt(meuid));
                obj.setDescricao(up.getForm().get("descricao").toString());

                if (!up.getFiles().isEmpty()) {
                    obj.setFotos(up.getFiles().get(0));

                }
                pagina = "upd.jsp";
                
                deucerto = dao.alterar(obj);
            } else {
                //atribuo os campos do formulário
                obj.setDescricao(up.getForm().get("descricao").toString());

                if (!up.getFiles().isEmpty()) {
                    obj.setFotos(up.getFiles().get(0));

                }
                deucerto = dao.incluir(obj);

                pagina = "index.jsp";
            }

            dao.fecharEmf();
            if (deucerto) {
                msg = "Cadastro Ok";
            } else {
                msg = "Cadastro com problema";

            }

        } else {
            msg = "Não foi possível fazer o upload.";
        }
        request.setAttribute("msg", msg);
        RequestDispatcher destino;
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
