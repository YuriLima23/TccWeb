/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.EmpregadorDao;
import Modelo.Empregador;
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
@WebServlet(name = "EmpregadorCtl", urlPatterns = {"/admin/empregador/EmpregadorCtl"})
public class EmpregadorCtl extends HttpServlet {
 private EmpregadorDao dao;
    private String pagina;
    HttpSession session;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Empregador empregador;
        String acao;
        String id = " ";

        acao = request.getParameter("acao");
        dao = new EmpregadorDao();
        if (acao == null) {
            acao = " ";
        }
        switch (acao) {
            case "del":
                id = request.getParameter("id");
                Boolean deucerto = dao.excluir(Integer.parseInt(id));
                request.setAttribute("lista", dao.listar());
                pagina = "index.jsp";
                if (deucerto) {
                    request.setAttribute("msg", "Exclusão OK");
                } else {
                    request.setAttribute("msg", "Erro ao excluir");
                }
                dao.fecharEmf();
                break;

            case "upd":
                id = request.getParameter("id");
                dao = new EmpregadorDao();
                Empregador obj = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("obj", obj);
                pagina = "upd.jsp";
                dao.fecharEmf();
                break;

            default:
                request.setAttribute("lista", listaEmpregadores());
                pagina = "index.jsp";
                break;
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    public List<Empregador> listaEmpregadores() {
        dao = new EmpregadorDao();
        List<Empregador> empregadores = dao.listar();
        return empregadores;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "";
        HttpSession session = request.getSession();
        Upload up = new Upload();
        String opcao = request.getParameter("acao");
        //definir local de destino dos arquivos
        up.setFolderUpload("imagem");
        //Processar o formulário
        
        switch (opcao) {
            case "add":
                if (up.formProcess(getServletContext(), request)) {

                    Empregador obj = new Empregador();
                    dao = new EmpregadorDao();
                    Boolean deucerto;
                    
                    if (up.getForm().get("id") != null) {
                      
                        String meuid = up.getForm().get("id").toString();
                        obj = dao.buscarPorChavePrimaria(Integer.parseInt(meuid));
                        obj.setNome(up.getForm().get("nome").toString());
                        obj.setEmail(up.getForm().get("email").toString());
                        obj.setSenha(up.getForm().get("senha").toString());
                        obj.setCidade(up.getForm().get("cidade").toString());
                        obj.setTelefone(up.getForm().get("telefone").toString());
                        obj.setPerfil(true);
                      
                        if (!up.getFiles().isEmpty()) {
                            obj.setFoto(up.getFiles().get(0));

                        }
                        pagina = "upd.jsp";
                        deucerto = dao.alterar(obj);
                    } else {
                       

                        obj.setNome(up.getForm().get("nome").toString());
                        obj.setEmail(up.getForm().get("email").toString());
                        obj.setSenha(up.getForm().get("senha").toString());
                        obj.setCidade(up.getForm().get("cidade").toString());
                        obj.setTelefone(up.getForm().get("telefone").toString());
                        obj.setPerfil(true);

                        
                        if (!up.getFiles().isEmpty()) {
                            obj.setFoto(up.getFiles().get(0));

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

                break;
            case "login":
                String email = request.getParameter("email");
                String senha = request.getParameter("senha");

                dao = new EmpregadorDao();

                Query query = dao.checkLogin(email, senha);
                if (query.getResultList().size() > 0) {
                    Empregador empregador = (Empregador) query.getResultList().get(0);
                    empregador.setPerfil(true);
                    dao.alterar(empregador);
                    session.setAttribute("empregador", empregador);
                    session.setMaxInactiveInterval(0);
                    pagina = "Perfil/perfilEmpregador.jsp";
                } else {

                    msg = "não deu pra logar";
                    pagina = "LoginEmpregador.jsp";
                }
                break;

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
