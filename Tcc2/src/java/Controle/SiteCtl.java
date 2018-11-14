/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.AlbumDao;
import Dao.AvaliacaoDao;
import Dao.CategoriaDao;
import Dao.ContratoDao;
import Dao.EmpregadoDao;
import Dao.EmpregadorDao;
import Dao.SolucaoDao;
import Dao.TarefaDao;
import Modelo.Album;
import Modelo.Avaliacao;
import Modelo.Categoria;
import Modelo.Contrato;
import Modelo.Empregado;
import Modelo.Empregador;
import Modelo.Solucao;
import Modelo.Tarefa;
import Util.StormData;
import Util.Upload;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
@WebServlet(name = "SiteCtl", urlPatterns = {"/template/SiteCtl"})
public class SiteCtl extends HttpServlet {

    String pagina = " ";
    HttpSession session;
    CategoriaDao categoriaDao = new CategoriaDao();
    TarefaDao tarefaDao = new TarefaDao();
    SolucaoDao solucaoDao = new SolucaoDao();
    EmpregadoDao empregadoDao = new EmpregadoDao();
    EmpregadorDao empregadorDao = new EmpregadorDao();
    ContratoDao contratoDao = new ContratoDao();
    AlbumDao fotoDao = new AlbumDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = " ";
        String acao = request.getParameter("acao");
        session = request.getSession();

        if (acao == null) {
            acao = " ";
        }
        switch (acao) {

            case "delTarefa":
                id = request.getParameter("id");
                tarefaDao = new TarefaDao();
                //tem um erro aaqui tem q fazer 1 del pra cada pagina 
                Tarefa tar = tarefaDao.buscarPorChavePrimaria(Integer.parseInt(id));
                if (tar != null) {
                    tarefaDao.excluir(tar);
                    request.setAttribute("tarefas", listarTarefas());
                    pagina = "ListagemServicosEmpregador.jsp";
                }

                break;
            case "delFoto":
                id = request.getParameter("idFoto");
                String id12 = request.getParameter("idEmp");

                fotoDao = new AlbumDao();
                empregadoDao = new EmpregadoDao();
                Album f1 = fotoDao.buscarPorChavePrimaria(Integer.parseInt(id));
                Empregado emp23 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(id12));
                fotoDao.excluir(f1);
                fotoDao.fecharEmf();
                empregadoDao.fecharEmf();
                request.setAttribute("fotos", emp23.getAlbumList());
                pagina = "portfolio.jsp";

                break;
            case "updEmpregado":
                id = request.getParameter("idt");
                empregadoDao = new EmpregadoDao();
                //tem um erro aaqui tem q fazer 1 del pra cada pagina 
                Empregado empregado = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(id));

                request.setAttribute("empregado", empregado);
                request.setAttribute("categorias", listarCategorias());

                pagina = "AlterarEmpregado.jsp";

                break;
            case "updEmpregador":
                id = request.getParameter("id");
                empregadorDao = new EmpregadorDao();
                //tem um erro aaqui tem q fazer 1 del pra cada pagina 
                Empregador empregador1 = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(id));

                request.setAttribute("empregador", empregador1);

                pagina = "AlterarEmpregador.jsp";

                break;
            case "updFoto":
                id = request.getParameter("idFoto");
                String id5 = request.getParameter("empregado");
                empregadoDao = new EmpregadoDao();
                fotoDao = new AlbumDao();
                //tem um erro aaqui tem q fazer 1 del pra cada pagina 
                Empregado empregado10 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(id5));
                Album f = fotoDao.buscarPorChavePrimaria(Integer.parseInt(id5));

                request.setAttribute("empregado", empregado10);
                request.setAttribute("foto", f);

                pagina = "AlterarFoto.jsp";

                break;
            case "delSolucao":
                id = request.getParameter("id");
                solucaoDao = new SolucaoDao();

                Solucao sol = solucaoDao.buscarPorChavePrimaria(Integer.parseInt(id));
                if (sol != null) {
                    solucaoDao.excluir(sol);
                    request.setAttribute("tarefas", listarTarefas());

                    pagina = "ListagemServicos.jsp";
                }

                break;
            case "perfilEmpregado":
                id = request.getParameter("id");
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();
                Empregado empregado1 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("listaContratos", empregado1.getContratoList());
                if (empregado1 != null) {
                    session.setAttribute("empregado", empregado1);
                    pagina = "perfil.jsp";
                }

                break;
            case "aceitaContrato":
                id = request.getParameter("id");
                String id3 = request.getParameter("idContrato");
                empregadoDao = new EmpregadoDao();
                contratoDao = new ContratoDao();
                Contrato contrato = contratoDao.buscarPorChavePrimaria(Integer.parseInt(id3));
                contrato.setStatus(true);
                contratoDao.alterar(contrato);

                Empregado empregado5 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("listaContratos", empregado5.getContratoList());
                contratoDao.fecharEmf();
                pagina = "perfil.jsp";
                break;
            case "recusaContrato":
                id = request.getParameter("id");
                String id4 = request.getParameter("idContrato");
                empregadoDao = new EmpregadoDao();
                contratoDao = new ContratoDao();
                Contrato contrato2 = contratoDao.buscarPorChavePrimaria(Integer.parseInt(id4));

                Empregado empregado7 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("listaContratos", empregado7.getContratoList());
                contratoDao.excluir(contrato2);
                contratoDao.fecharEmf();
                pagina = "perfil.jsp";
                break;
            case "perfilEmpregador":
                id = request.getParameter("id");
                contratoDao = new ContratoDao();
                empregadorDao = new EmpregadorDao();
                Empregador empregador2 = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("listaContratos", empregador2.getContratoList());
                if (empregador2 != null) {

                    session.setAttribute("empregador", empregador2);

                    pagina = "Perfil_2.jsp";
                }

                break;
            case "sair":
                id = request.getParameter("id");
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();
                Empregado empregado2 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(id));
                session = request.getSession();
                if (empregado2 != null) {
                    empregado2.setPerfil(false);
                    empregadoDao.alterar(empregado2);

                    session.setAttribute("empregado", null);

                }
                Empregador empregador = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(id));
                if (empregador != null) {
                    empregador.setPerfil(false);
                    empregadorDao.alterar(empregador);

                    session.setAttribute("empregador", null);

                }

                pagina = "login.jsp";
                break;

            case "perfilCandidato":
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();
                Empregado emp = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));

                request.setAttribute("empregado", emp);
                pagina = "perfilAmostra.jsp";

                break;

            case "perfilCandidato2":
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();
                Empregado emp2 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));
                Empregador emp6 = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregador")));
                request.setAttribute("empregado", emp2);
                request.setAttribute("empregador", emp6);
                pagina = "perfilAmostra.jsp";

                break;
            case "port":
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();
                Empregado emp7 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));

                request.setAttribute("empregado", emp7);
                request.setAttribute("fotos", emp7.getAlbumList());

                pagina = "portfolio.jsp";

                break;

            case "listaEmpregados":
                categoriaDao = new CategoriaDao();
                empregadoDao = new EmpregadoDao();
                Categoria categoria = categoriaDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));

                request.setAttribute("listaEmpregados", categoria.getEmpregadoList());
                pagina = "ListagemEmpregadosServico.jsp";
                break;
            case "verCategorias":
                id = request.getParameter("id");
                categoriaDao = new CategoriaDao();
                empregadorDao = new EmpregadorDao();
                Empregador p = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(id));
                request.setAttribute("categorias", categoriaDao.listar());
                request.setAttribute("empregador", p);
                pagina = "CategoriasServicos.jsp";
                break;

            case "listarServicos":

                request.setAttribute("tarefas", listarTarefas());

                pagina = "ListagemServicos.jsp";
                break;
            case "adicionaFoto":
                empregadoDao = new EmpregadoDao();
                Empregado em2 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregado")));
                request.setAttribute("empregado", em2);

                pagina = "portDetalhe.jsp";
                break;
            case "verFoto":

                empregadoDao = new EmpregadoDao();
                fotoDao = new AlbumDao();
                Album foto2 = fotoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idFoto")));
                Empregado em3 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregado")));
                request.setAttribute("empregado", em3);
                request.setAttribute("foto", foto2);
                pagina = "MostraAlbum.jsp";
                break;
            case "verFotoEmpregador":

                empregadoDao = new EmpregadoDao();
                fotoDao = new AlbumDao();
                Album foto3 = fotoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idFoto")));
                Empregado em4 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregado")));
                request.setAttribute("empregado", em4);
                request.setAttribute("foto", foto3);
                pagina = "VerDetFoto.jsp";
                break;
            case "verDetalheFotoEmpregado":

                empregadoDao = new EmpregadoDao();
                fotoDao = new AlbumDao();
                Album foto6 = fotoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idFoto")));
                Empregado em7 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregado")));
                request.setAttribute("empregado", em7);
                request.setAttribute("foto", foto6);
                pagina = "detalheFoto.jsp";
                break;

            case "listarServicosEmpregador":

                request.setAttribute("tarefas", listarTarefas());

                pagina = "ListagemServicosEmpregador.jsp";
                break;
            case "listarFotos":
                empregadoDao = new EmpregadoDao();
                Empregado em = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));
                request.setAttribute("fotos", em.getAlbumList());
                request.setAttribute("empregado", em);
                pagina = "portfolio.jsp";
                break;
            case "listarFotosEmpregador":
                empregadoDao = new EmpregadoDao();
                Empregado em9 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));
                request.setAttribute("fotos", em9.getAlbumList());
                request.setAttribute("empregado", em9);

                pagina = "MostraPort.jsp";
                break;

            default:
                request.setAttribute("categorias", listarCategorias());
                pagina = "registros.jsp";

                break;

        }

        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);

    }

    public List<Solucao> listarSolucoes() {
        solucaoDao = new SolucaoDao();
        List<Solucao> solucoes = solucaoDao.listar();
        return solucoes;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        pagina = " ";
        String msg = " ";
        session = request.getSession();
        //session = request.getSession();
        Upload up = new Upload();
        //definir local de destino dos arquivos
        up.setFolderUpload("imagem");
        if (acao == null) {
            acao = " ";
        }
        switch (acao) {
            case "addEmpregado":
                if (up.formProcess(getServletContext(), request)) {

                    empregadoDao = new EmpregadoDao();
                    categoriaDao = new CategoriaDao();
                    Boolean deucerto;
                    //Testa se é alterar (com ID) ou cadastrar(sem ID)
                    if (up.getForm().get("id") != null) {
                        //Se for alterar primeiro temos que buscar o objeto na
                        //base de dados, pois precisamos da imagem "original"
                        session = request.getSession();
                        String meuid = up.getForm().get("id").toString();
                        Empregado empregado = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(meuid));
                        empregado.setNome(up.getForm().get("nome").toString());
                        empregado.setEmail(up.getForm().get("email").toString());
                        empregado.setSenha(up.getForm().get("senha").toString());
                        empregado.setCidade(up.getForm().get("cidade").toString());
                        empregado.setTelefone(up.getForm().get("telefone").toString());
                        empregado.setCategoria(categoriaDao.buscarPorChavePrimaria(Integer.parseInt(up.getForm().get("categoria").toString())));

                        if (!up.getFiles().isEmpty()) {
                            empregado.setFoto(up.getFiles().get(0));

                        }

                        empregadoDao.alterar(empregado);
                        session.setAttribute("empregado", empregado);
                        pagina = "perfil.jsp";
                    } else {
                        //atribuo os campos do formulário
                        Empregado empregado = new Empregado();

                        empregado.setNome(up.getForm().get("nome").toString());
                        empregado.setEmail(up.getForm().get("email").toString());
                        empregado.setSenha(up.getForm().get("senha").toString());
                        empregado.setCidade(up.getForm().get("cidade").toString());
                        empregado.setTelefone(up.getForm().get("telefone").toString());
                        empregado.setDescricao(up.getForm().get("descricao").toString());
                        empregado.setPerfil(true);

                        empregado.setCategoria(categoriaDao.buscarPorChavePrimaria(Integer.parseInt(up.getForm().get("categoria").toString())));
                        if (!up.getFiles().isEmpty()) {
                            empregado.setFoto(up.getFiles().get(0));

                        }
                        deucerto = empregadoDao.incluir(empregado);
                        session.setAttribute("empregado", empregado);
                        pagina = "perfil.jsp";

                    }

                }
                break;
            case "addEmpregador":
                if (up.formProcess(getServletContext(), request)) {
                    session = request.getSession();
                    empregadorDao = new EmpregadorDao();

                    Boolean deucerto;
                    //Testa se é alterar (com ID) ou cadastrar(sem ID)
                    if (up.getForm().get("id") != null) {
                        //Se for alterar primeiro temos que buscar o objeto na
                        //base de dados, pois precisamos da imagem "original"
                        String meuid = up.getForm().get("id").toString();
                        Empregador empregador = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(meuid));
                        empregador.setNome(up.getForm().get("nome").toString());
                        empregador.setEmail(up.getForm().get("email").toString());
                        empregador.setSenha(up.getForm().get("senha").toString());
                        empregador.setCidade(up.getForm().get("cidade").toString());
                        empregador.setTelefone(up.getForm().get("telefone").toString());

                        if (!up.getFiles().isEmpty()) {
                            empregador.setFoto(up.getFiles().get(0));

                        }
                        empregadorDao.alterar(empregador);
                        session.setAttribute("empregador", empregador);
                        pagina = "Perfil_2.jsp";

                    } else {
                        //atribuo os campos do formulário
                        Empregador empregador = new Empregador();
                        empregador.setNome(up.getForm().get("nome").toString());
                        empregador.setEmail(up.getForm().get("email").toString());
                        empregador.setSenha(up.getForm().get("senha").toString());
                        empregador.setCidade(up.getForm().get("cidade").toString());
                        empregador.setTelefone(up.getForm().get("telefone").toString());
                        empregador.setPerfil(true);

                        if (!up.getFiles().isEmpty()) {
                            empregador.setFoto(up.getFiles().get(0));

                        }
                        deucerto = empregadorDao.incluir(empregador);
                        session.setAttribute("empregador", empregador);
                        pagina = "Perfil_2.jsp";

                    }

                }
                break;
            case "loginEmpregado":

                String email = request.getParameter("email");
                String senha = request.getParameter("senha");

                empregadoDao = new EmpregadoDao();

                Query query = empregadoDao.checkLogin(email, senha);
                if (query.getResultList().size() > 0) {
                    Empregado empregado = (Empregado) query.getResultList().get(0);
                    empregado.setPerfil(true);
                    empregadoDao.alterar(empregado);
                    session.setMaxInactiveInterval(0);
                    request.setAttribute("listaContratos", empregado.getContratoList());
                    session.setAttribute("empregado", empregado);

                    session.setMaxInactiveInterval(0);
                    pagina = "perfil.jsp";
                } else {

                    request.setAttribute("inexistente", "nao");
                    pagina = "login.jsp";
                }
                break;
            case "loginEmpregador":

                String email2 = request.getParameter("email");
                String senha2 = request.getParameter("senha");

                empregadorDao = new EmpregadorDao();
                contratoDao = new ContratoDao();
                Query query2 = empregadorDao.checkLogin(email2, senha2);
                if (query2.getResultList().size() > 0) {
                    Empregador empregador = (Empregador) query2.getResultList().get(0);
                    empregador.setPerfil(true);
                    empregadorDao.alterar(empregador);
                    session.setMaxInactiveInterval(0);
                    session.setAttribute("empregador", empregador);
                    request.setAttribute("listaContratos", empregador.getContratoList());

                    pagina = "Perfil_2.jsp";
                } else {

                    msg = "não deu pra logar";
                    request.setAttribute("inexistente2", "sim");
                    pagina = "login.jsp";
                }
                break;

            case "addFoto":
                if (up.formProcess(getServletContext(), request)) {
                    empregadoDao = new EmpregadoDao();
                    Empregado empregado = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));
                    Album foto = new Album();
                    AlbumDao fotoDao = new AlbumDao();
                    foto.setEmpregado(empregado);
                    foto.setDescricao(up.getForm().get("descricao").toString());
                    foto.setTitulo(up.getForm().get("titulo").toString());
                    if (!up.getFiles().isEmpty()) {
                        foto.setFotos(up.getFiles().get(0));

                    }
                    fotoDao.incluir(foto);
                    fotoDao.fecharEmf();
                    empregadoDao.fecharEmf();
                    request.setAttribute("fotos", empregado.getAlbumList());
                    pagina = "portfolio.jsp";
                }
                break;
            case "AlterarFoto":
                if (up.formProcess(getServletContext(), request)) {
                    empregadoDao = new EmpregadoDao();
                    fotoDao = new AlbumDao();
                    Empregado empregado = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmp")));
                    Album foto = fotoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idFoto")));

                    foto.setEmpregado(empregado);
                    foto.setDescricao(up.getForm().get("descricao").toString());
                    foto.setTitulo(up.getForm().get("titulo").toString());
                    if (!up.getFiles().isEmpty()) {
                        foto.setFotos(up.getFiles().get(0));

                    }
                    fotoDao.alterar(foto);
                    fotoDao.fecharEmf();
                    request.setAttribute("fotos", empregado.getAlbumList());
                    pagina = "portfolio.jsp";
                }
                break;
            case "fazerProposta":
                String idTarefa = request.getParameter("idTarefa");
                String idEmpregado = request.getParameter("idEmpregado");
                session = request.getSession();
                empregadoDao = new EmpregadoDao();
                tarefaDao = new TarefaDao();
                Empregado empregado = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(idEmpregado));
                Tarefa tarefa = tarefaDao.buscarPorChavePrimaria(Integer.parseInt(idTarefa));
                Solucao solucao = new Solucao();
                solucaoDao = new SolucaoDao();
                solucao.setDescricao(request.getParameter("descricao"));
                solucao.setValorminimo(request.getParameter("valorMinimo"));
                solucao.setEmpregado(empregado);
                solucao.setTarefa(tarefa);
                Calendar calendar = new GregorianCalendar();

                solucao.setData(calendar.getTime());

                solucaoDao.incluir(solucao);

                request.setAttribute("tarefas", this.listarTarefas());

                pagina = "ListagemServicos.jsp";

                break;
            case "updProposta":

                solucaoDao = new SolucaoDao();

                Solucao sol = solucaoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));
                solucaoDao = new SolucaoDao();
                sol.setDescricao(request.getParameter("descricao"));
                sol.setValorminimo(request.getParameter("valorMinimo"));

                Calendar calendar1 = new GregorianCalendar();

                sol.setData(calendar1.getTime());

                solucaoDao.alterar(sol);

                request.setAttribute("tarefas", this.listarTarefas());

                pagina = "ListagemServicos.jsp";

                break;
            case "addTarefa":
                tarefaDao = new TarefaDao();

                Tarefa tar = new Tarefa();
                empregadorDao = new EmpregadorDao();
                System.out.println(request.getParameter("dataInicial"));
                Empregador empregador = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregador")));
                tar.setTitulo(request.getParameter("titulo"));
                tar.setDescricao(request.getParameter("descricao"));
                tar.setDatainicial(StormData.formata(request.getParameter("dataInicial"), "yyyy-MM-dd"));
                tar.setDatafinal(StormData.formata(request.getParameter("dataFinal"), "yyyy/MM/dd"));
                tar.setValordisponivel(request.getParameter("valorDisponivel"));
                tar.setEmpregador(empregador);

                tarefaDao.incluir(tar);

                request.setAttribute("tarefas", this.listarTarefas());
                tarefaDao.fecharEmf();
                pagina = "ListagemServicosEmpregador.jsp";
                break;

            case "updTarefa":
                tarefaDao = new TarefaDao();

                Tarefa tare = tarefaDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("id")));
                tare.setTitulo(request.getParameter("titulo"));
                tare.setDescricao(request.getParameter("descricao"));
                tare.setDatainicial(StormData.formata(request.getParameter("dataInicial"), "yyyy-MM-dd"));
                tare.setDatafinal(StormData.formata(request.getParameter("dataFinal"), "yyyy/MM/dd"));
                tare.setValordisponivel(request.getParameter("valorDisponivel"));
                tarefaDao.alterar(tare);
                tarefaDao.fecharEmf();
                request.setAttribute("tarefas", listarTarefas());
                pagina = "ListagemServicosEmpregador.jsp";

                break;
            case "addContrato":
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();
                tarefaDao = new TarefaDao();
                contratoDao = new ContratoDao();

                Empregado emp = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregado")));
                Empregador empr = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregador")));
                Tarefa tar1 = tarefaDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idTarefa")));
                Contrato contrato = new Contrato();
                contrato.setDescricao(request.getParameter("descricao"));
                contrato.setDatadeinicio(StormData.formata(request.getParameter("dataInicial"), "yyyy-MM-dd"));
                contrato.setEmpregado(emp);
                contrato.setEmpregador(empr);
                contrato.setCompletado(false);
                contrato.setStatus(false);

                request.setAttribute("listaContratos", empr.getContratoList());
                contratoDao.incluir(contrato);
                contratoDao.fecharEmf();
                request.setAttribute("tare", tar1);
                pagina = "Perfil_2.jsp";
                break;
            case "criarContrato":
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();

                contratoDao = new ContratoDao();

                Empregado emp32 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregado")));
                Empregador empr32 = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregador")));

                Contrato contrato1 = new Contrato();
                contrato1.setDescricao(request.getParameter("descricao"));
                contrato1.setDatadeinicio(StormData.formata(request.getParameter("dataInicial"), "yyyy-MM-dd"));
                contrato1.setEmpregado(emp32);
                contrato1.setEmpregador(empr32);
                contrato1.setCompletado(false);
                contrato1.setStatus(false);

                request.setAttribute("listaContratos", empr32.getContratoList());
                contratoDao.incluir(contrato1);
                contratoDao.fecharEmf();

                pagina = "Perfil_2.jsp";
                break;
            case "FinalizarContrato":
                empregadoDao = new EmpregadoDao();
                empregadorDao = new EmpregadorDao();
                tarefaDao = new TarefaDao();
                contratoDao = new ContratoDao();
                AvaliacaoDao avaliacaoDao = new AvaliacaoDao();
                Avaliacao a = new Avaliacao();
                double valor1 = 0.0;

                Empregado emp1 = empregadoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregado")));
                Empregador empr2 = empregadorDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idEmpregador")));
                Contrato contrato4 = contratoDao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("idContrato")));
                contrato4.setCompletado(true);
                contrato4.setFeedback(request.getParameter("feedback"));
                Calendar calendar3 = new GregorianCalendar();
                contrato4.setDatafinal(calendar3.getTime());
                contratoDao.alterar(contrato4);

                a.setEmpregado(emp1);
                a.setValor(Double.parseDouble(request.getParameter("avaliacao")));
                avaliacaoDao.incluir(a);

                for (Avaliacao a1 : emp1.getAvaliacaoList()) {

                    valor1 = valor1 + a1.getValor();
                    System.out.println("esse é o valor do for " + valor1);
                }
               
                emp1.setAvaliacao(valor1 / emp1.getContratoList().size());
                empregadoDao.alterar(emp1);
                request.setAttribute("listaContratos", empr2.getContratoList());

                contratoDao.fecharEmf();

                pagina = "Perfil_2.jsp";
                break;

        }
        request.setAttribute("msg", msg);
        RequestDispatcher destino;
        destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);

    }

    public List<Modelo.Categoria> listarCategorias() {
        categoriaDao = new CategoriaDao();
        List<Modelo.Categoria> categorias = categoriaDao.listar();
        return categorias;
    }

    public List<Tarefa> listarTarefas() {
        tarefaDao = new TarefaDao();
        List<Tarefa> tarefas = tarefaDao.listar();
        tarefaDao.fecharEmf();
        return tarefas;
    }

    public List<Contrato> listarContratos() {
        contratoDao = new ContratoDao();
        List<Contrato> contratos = contratoDao.listar();
        contratoDao.fecharEmf();
        return contratos;
    }

    public List<Album> listarFotos() {
        fotoDao = new AlbumDao();
        List<Album> fotos = fotoDao.listar();
        contratoDao.fecharEmf();
        return fotos;
    }

    public Boolean testeListaVazia() {
        Boolean teste;
        contratoDao = new ContratoDao();
        if (contratoDao.listar().isEmpty()) {
            teste = true;
        } else {
            teste = false;
        }
        return teste;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
