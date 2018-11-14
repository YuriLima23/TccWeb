/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.CategoriaDao;
import Dao.EmpregadoDao;
import Modelo.Empregado;
import Util.Upload;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author eliane
 */
@WebServlet(name = "EmpregadoCtl", urlPatterns = {"/admin/empregado/EmpregadoCtl"})
public class EmpregadoCtl extends HttpServlet {
private EmpregadoDao dao;
    private String pagina;

    HttpSession session;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao;
        pagina = " ";
        String id = " ";

        acao = request.getParameter("acao");

        if (acao == null) {
            acao = " ";
        }
        switch (acao) {
            case "del":
                dao = new EmpregadoDao();
                id = request.getParameter("id");

                Boolean deucerto = dao.excluir(dao.buscarPorChavePrimaria(Integer.parseInt(id)));
                request.setAttribute("lista", dao.listar());
                pagina = "index.jsp";
                if (deucerto) {
                    request.setAttribute("msg", "Exclusão OK");
                } else {
                    request.setAttribute("msg", "Erro ao excluir");
                }
              
                break;

            case "upd":
                id = request.getParameter("id");
                dao = new EmpregadoDao();
                Empregado obj = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("obj", obj);
                pagina = "upd.jsp";
                dao.fecharEmf();
                break;
            case "1":
                request.setAttribute("categorias", listaCategorias());
                pagina = "add.jsp";
                break;

            default:
                request.setAttribute("lista", listaEmpregados());
                pagina = "index.jsp";
                break;
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);

    }

    public List<Empregado> listaEmpregados() {
        dao = new EmpregadoDao();
        List<Empregado> empregados = dao.listar();
        return empregados;
    }

    public List<Modelo.Categoria> listaCategorias() {
        CategoriaDao daoC = new CategoriaDao();
        List<Modelo.Categoria> categorias = daoC.listar();
        return categorias;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcaoA = request.getParameter("acao");
        String msg = " ";
        session = request.getSession();
        Upload up = new Upload();
        //definir local de destino dos arquivos
        up.setFolderUpload("imagem");
        switch (opcaoA) {
            case "add":

                if (up.formProcess(getServletContext(), request)) {

                    Empregado obj = new Empregado();
                    dao = new EmpregadoDao();
                    CategoriaDao catDao = new CategoriaDao();
                    Boolean deucerto;
                    //Testa se é alterar (com ID) ou cadastrar(sem ID)
                    if (up.getForm().get("id") != null) {

                        String meuid = up.getForm().get("id").toString();
                        obj = dao.buscarPorChavePrimaria(Integer.parseInt(meuid));
                        obj.setNome(up.getForm().get("nome").toString());
                        obj.setEmail(up.getForm().get("email").toString());
                        obj.setSenha(up.getForm().get("senha").toString());
                        obj.setCidade(up.getForm().get("cidade").toString());
                        obj.setTelefone(up.getForm().get("telefone").toString());
                        obj.setCategoria(catDao.buscarPorChavePrimaria(Integer.parseInt(up.getForm().get("categorias").toString())));

                        if (!up.getFiles().isEmpty()) {
                            obj.setFoto(up.getFiles().get(0));

                        }
                        pagina = "upd.jsp";
                        deucerto = dao.alterar(obj);
                    } else {
                        //atribuo os campos do formulário

                        obj.setNome(up.getForm().get("nome").toString());
                        obj.setEmail(up.getForm().get("email").toString());
                        obj.setSenha(up.getForm().get("senha").toString());
                        obj.setCidade(up.getForm().get("cidade").toString());
                        obj.setTelefone(up.getForm().get("telefone").toString());
                        obj.setDescricao(up.getForm().get("descricao").toString());
                        obj.setPerfil(true);

                        obj.setCategoria(catDao.buscarPorChavePrimaria(Integer.parseInt(up.getForm().get("categorias").toString())));
                        if (!up.getFiles().isEmpty()) {
                            obj.setFoto(up.getFiles().get(0));
                        }
                        deucerto = dao.incluir(obj);
                        session.setAttribute("empregado", obj);
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
                break;
            case "login":
                String email = request.getParameter("email");
                String senha = request.getParameter("senha");

                dao = new EmpregadoDao();

                Query query = dao.checkLogin(email, senha);
                if (query.getResultList().size() > 0) {
                    Empregado empregado = (Empregado) query.getResultList().get(0);
                    empregado.setPerfil(true);
                    dao.alterar(empregado);
                    session.setAttribute("empregado", empregado);
                    session.setMaxInactiveInterval(0);
                    pagina = "Perfil/perfilEmpregado.jsp";
                } else {

                    msg = "não deu pra logar";
                    pagina = "LoginEmpregado.jsp";
                }
                break;
            case "addFotos":

                break;

        }
        RequestDispatcher destino;
        request.setAttribute("msg", msg);
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
