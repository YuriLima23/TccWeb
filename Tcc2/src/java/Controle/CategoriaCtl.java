/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.CategoriaDao;
import Util.Upload;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CategoriaCtl", urlPatterns = {"/admin/categoria/CategoriaCtl"})
public class CategoriaCtl extends HttpServlet {

    private CategoriaDao dao;
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
                dao = new CategoriaDao();
                Modelo.Categoria categoria = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                dao.excluir(categoria);
                request.setAttribute("lista", dao.listar());
                pagina = "index.jsp";
                dao.fecharEmf();
                break;
            case "upd":
                id = request.getParameter("id");
                dao = new CategoriaDao();
                Modelo.Categoria obj = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("obj", obj);
                pagina = "upd.jsp";
                dao.fecharEmf();
                break;

            default:
                request.setAttribute("lista", listarCategorias());
                pagina = "index.jsp";
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    public List<Modelo.Categoria> listarCategorias() {
        dao = new CategoriaDao();
        List<Modelo.Categoria> categorias = dao.listar();
        return categorias;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg;

        //definir local de destino dos arquivos
        //Processar o formulário
        pagina = "add.jsp";

        Modelo.Categoria obj = new Modelo.Categoria();
        dao = new CategoriaDao();
        Upload up = new Upload();
        //definir local de destino dos arquivos
        up.setFolderUpload("imagem");
        Boolean deucerto;
        if (up.formProcess(getServletContext(), request)) {

            //Testa se é alterar (com ID) ou cadastrar(sem ID)
            if (up.getForm().get("id") != null) {

                String meuid = up.getForm().get("id").toString();
                obj = dao.buscarPorChavePrimaria(Integer.parseInt(meuid));
                obj.setNome(up.getForm().get("nome").toString());
                obj.setIcon(up.getForm().get("icone").toString());
                obj.setDescricao(up.getForm().get("descricao").toString());

                if (!up.getFiles().isEmpty()) {
                    obj.setImagem(up.getFiles().get(0));

                }
                pagina = "upd.jsp";
                deucerto = dao.alterar(obj);
            } else {
                //atribuo os campos do formulário

                obj.setNome(up.getForm().get("nome").toString());
                obj.setIcon(up.getForm().get("icone").toString());
                obj.setDescricao(up.getForm().get("descricao").toString());

                if (!up.getFiles().isEmpty()) {
                    obj.setImagem(up.getFiles().get(0));
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
