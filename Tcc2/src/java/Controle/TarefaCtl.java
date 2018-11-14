/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.EmpregadorDao;
import Dao.TarefaDao;
import Modelo.Empregador;
import Modelo.Tarefa;
import Util.StormData;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
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
@WebServlet(name = "TarefaCtl", urlPatterns = {"/admin/tarefa/TarefaCtl"})
public class TarefaCtl extends HttpServlet {

    HttpSession session;
    private TarefaDao dao;
    EmpregadorDao empregadorDao;
    private String pagina;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Tarefa> lista;
        String acao;
        String id;
        acao = request.getParameter("acao");
        if (acao == null) {
            acao = " ";
        }
        switch (acao) {
            case "del":
                id = request.getParameter("id");
                dao = new TarefaDao();
                Boolean deucerto = dao.excluir(Integer.parseInt(id));
                pagina = "index.jsp";
                lista = dao.listar();
                request.setAttribute("lista", lista);
                if (deucerto) {
                    request.setAttribute("msg", "Exclusão OK");
                } else {
                    request.setAttribute("msg", "Erro ao excluir");
                }
                dao.fecharEmf();
                break;

            case "upd":
                id = request.getParameter("id");
                dao = new TarefaDao();
                Tarefa obj = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("obj", obj);
                pagina = "UpdateTarefa.jsp";
                dao.fecharEmf();
                break;

            case "1":
                request.setAttribute("empregados", listarEmpregadores());
                pagina = "add.jsp";
                break;

            default:
                request.setAttribute("lista", listarTarefas());
                pagina = "index.jsp";
                break;
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        session = request.getSession();
        String msg;
        EmpregadorDao empregadorDao = new EmpregadorDao();
        String acao = request.getParameter("acao");
        pagina = "";
        switch (acao) {
            case "add":

                dao = new TarefaDao();
                StormData date = new StormData();
                Boolean deucerto;
                //Testa se é alterar (com ID) ou cadastrar(sem ID)
                if (request.getParameter("id") != null) {
                    //Se for alterar primeiro temos que buscar o objeto na
                    //base de dados, pois precisamos da imagem "original"
                    String meuid = request.getParameter("id");
                    Tarefa obj = dao.buscarPorChavePrimaria(Integer.parseInt(meuid));

                    obj.setTitulo(request.getParameter("titulo"));
                    obj.setDescricao(request.getParameter("descricao"));
                    obj.setValordisponivel(request.getParameter("valorDisponivel"));
                    obj.setCompletado(false);
                    obj.setEmpregador(empregadorDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("empregador"))));
                    obj.setDatainicial(StormData.formata(request.getParameter("dataInicial"), "dd/MM/yyyy"));
                    obj.setDatafinal(StormData.formata(request.getParameter("dataFinal"), "dd/MM/yyyy"));

                    deucerto = dao.alterar(obj);

//                }
                    dao.fecharEmf();
                    if (deucerto) {
                        msg = "Cadastro Ok";

                    } else {
                        msg = "Cadastro com problema";

                    }

                    pagina = "index.jsp";
                    deucerto = dao.alterar(obj);
                } else {
                    //atribuo os campos do formulário
                    Tarefa obj = new Tarefa();
                   
                   
                    String dataInicial = request.getParameter("dataInicial");
                    String dataFinal = request.getParameter("dataFinal");
                   
                    obj.setTitulo(request.getParameter("titulo"));
                    obj.setDescricao(request.getParameter("descricao"));
                    obj.setValordisponivel(request.getParameter("valorDisponivel"));
                    obj.setCompletado(false);
                    obj.setEmpregador(empregadorDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("empregador"))));
                    obj.setDatainicial(StormData.formata(dataInicial,"yyyy-MM-dd"));
                    obj.setDatafinal(StormData.formata(dataFinal));

                    deucerto = dao.incluir(obj);
                    request.setAttribute("lista", this.listarTarefas());
                    pagina = "index.jsp";
//                }

                    dao.fecharEmf();
                    if (deucerto) {
                        msg = "Cadastro Ok";
                    } else {
                        msg = "Cadastro com problema";
                    }

                }
                request.setAttribute("msg", msg);
                RequestDispatcher destino;
                destino = request.getRequestDispatcher(pagina);
                destino.forward(request, response);
                break;
        }
    }

    public List<Tarefa> listarTarefas() {
        dao = new TarefaDao();
        List<Tarefa> tarefas = dao.listar();
        return tarefas;
    }

    public List<Empregador> listarEmpregadores() {
        EmpregadorDao daoE = new EmpregadorDao();
        List<Empregador> empregadores = daoE.listar();
        return empregadores;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
