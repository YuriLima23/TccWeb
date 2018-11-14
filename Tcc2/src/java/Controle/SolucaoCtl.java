/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.EmpregadoDao;
import Dao.SolucaoDao;
import Dao.TarefaDao;
import Modelo.Empregado;
import Modelo.Solucao;
import Modelo.Tarefa;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
@WebServlet(name = "SolucaoCtl", urlPatterns = {"/admin/solucao/SolucaoCtl"})
public class SolucaoCtl extends HttpServlet {

    private SolucaoDao dao;
    private String pagina;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Solucao> lista;
        String acao;
        String id;
        acao = request.getParameter("acao");
        if (acao == null) {
            acao = " ";
        }
        switch (acao) {
            case "del":
                id = request.getParameter("id");
                dao = new SolucaoDao();
                Boolean deucerto = dao.excluir(dao.buscarPorChavePrimaria(Integer.parseInt(id)));

                request.setAttribute("lista", this.listaSolucoes());
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
                dao = new SolucaoDao();
                Solucao obj = dao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("obj", obj);
                pagina = "upd.jsp";
                dao.fecharEmf();
                break;
            case "1":
                request.setAttribute("empregados", listaEmpregados());
                request.setAttribute("tarefas", listarTarefas());
                pagina = "add.jsp";
                break;

            default:
                request.setAttribute("lista", listaSolucoes());
                pagina = "index.jsp";
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    public List<Solucao> listaSolucoes() {
        dao = new SolucaoDao();
        List<Solucao> solucoes = dao.listar();
        return solucoes;
    }

    public List<Empregado> listaEmpregados() {
        EmpregadoDao daoE = new EmpregadoDao();
        List<Empregado> empregados = daoE.listar();
        return empregados;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "nd foi colocado como msg";
        String acao = request.getParameter("acao");

        switch (acao) {
            case "add":
                Solucao obj = new Solucao();
                EmpregadoDao empregadoDao = new EmpregadoDao();
                TarefaDao tdao = new TarefaDao();
                dao = new SolucaoDao();
                Boolean deucerto;
                //Testa se é alterar (com ID) ou cadastrar(sem ID)
                if (request.getParameter("id") != null) {
                    //Se for alterar primeiro temos que buscar o objeto na
                    //base de dados, pois precisamos da imagem "original"

                    String meuid = request.getParameter("id");
                    obj = dao.buscarPorChavePrimaria(Integer.parseInt(meuid));

                    obj.setDescricao(request.getParameter("descricao"));
                    obj.setValorminimo(request.getParameter("valorMinimo"));
                    tdao = new TarefaDao();
                    obj.setEmpregado(empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("empregados"))));
                    obj.setTarefa(tdao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("tarefas"))));
                    Calendar calendar = new GregorianCalendar();
                    Date date = new Date();
                    calendar.setTime(date);
                    obj.setData(calendar.getTime());
                    pagina = "listagemDeServicos.jsp";
                    deucerto = dao.alterar(obj);
                } else {
                    //atribuo os campos do formulário
                    tdao = new TarefaDao();
                    SimpleDateFormat data = new SimpleDateFormat("dd-mm-yyyy");
                    obj.setDescricao(request.getParameter("descricao"));
                    obj.setValorminimo(request.getParameter("valorMinimo"));

                    obj.setEmpregado(empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("empregados"))));
                    obj.setTarefa(tdao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("tarefas"))));
                    Calendar calendar = new GregorianCalendar();
                    Date date = new Date();
                    calendar.setTime(date);
                    obj.setData(calendar.getTime());

                    deucerto = dao.incluir(obj);
                    request.setAttribute("lista", this.listaSolucoes());
                    pagina = "index.jsp";
                }

                dao.fecharEmf();
                if (deucerto) {
                    msg = "Cadastro Ok";
                } else {
                    msg = "Cadastro com problema";
                }
                break;

        }
        request.setAttribute("msg", msg);
        RequestDispatcher destino;
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);

    }

    public List<Tarefa> listarTarefas() {
        TarefaDao tdao1 = new TarefaDao();
        List<Tarefa> tarefas = tdao1.listar();
        return tarefas;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
