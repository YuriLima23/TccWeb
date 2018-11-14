<%@page import="Modelo.Tarefa"%>
<%@page import="java.util.List"%>

<%@page import="Dao.TarefaDao"%>
<%@page import="Dao.SolucaoDao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="Cabecalho.jsp" %>
<!DOCTYPE html>

<!--
Falar com o professor sobre :

conseguir pergar o endereço da imagina na hora de cadastrar (perfil)

-->
<head>
    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>Ui Comments - Bootsnipp.com</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="styleListagemServicos.css" rel="stylesheet">

    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</head>

<div class="container">

    <div class="row">


        <div class="tab-content">
            <div class="tab-pane active" id="comments-logout">

                <ul class="media-list">


                    <li class="media">

                        <c:forEach items="${tarefas}" var="obj">

                            <a class="pull-left" href="#">
                                <img class="media-object img-circle" title="${obj.empregador.nome}" src="../imagem/${obj.empregador.foto}" height="120" width="120" alt="profile">
                            </a>
                            <div class="media-body">
                                <div class="well well-lg">
                                    <h4 class="media-heading text-uppercase reviews">${obj.titulo} </h4> 
                                    <ul class="media-date text-uppercase reviews list-inline">
                                        <li class="dd">Data :<fmt:formatDate pattern = "dd-MM-yyyy" value = "${obj.datainicial}"/></li>
                                        <br>
                                        <li class="yyyy">Valor R$: ${obj.valordisponivel}</li>
                                        <br>
                                        <li class="yyyy">Cidade : ${obj.empregador.cidade}</li>



                                    </ul>
                                    <p class="media-comment">
                                        ${obj.descricao}
                                    </p>

                                    <c:if test="${empregado.perfil == true}">
                                        <a class="btn btn-success btn-circle text-uppercase " data-toggle="collapse" href="#resposta${obj.id}"><span class="glyphicon glyphicon-comment"></span> Ver mais</a>


                                        <a class="btn btn-primary btn-circle text-uppercase " data-toggle="collapse" href="#${obj.id}"><span class="glyphicon glyphicon-comment"></span> Fazer proposta</a>
                                    </c:if>
                                </div>
                            </div>


                            <div class="collapse" id="${obj.id}">
                                <ul class="media-list">
                                    <li class="media media-replied">
                                        <form action="SiteCtl?acao=fazerProposta&idTarefa=${obj.id}&idEmpregado=${empregado.id}&idEmpregador=${empregador.id}" method="post" class="form-horizontal" role="form">
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">Fazer Proposta</label>
                                                <div class="col-sm-10">
                                                    <textarea class="form-control" name="descricao"  rows="5"></textarea>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label  class="col-sm-2 control-label">Valor Minimo</label>
                                                <div class="col-sm-10">
                                                    <div class="input-group">

                                                        <input type="number" class="form-control" name="valorMinimo" >
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button class="btn btn-success btn-circle text-uppercase"  type="submit" ><span class="glyphicon glyphicon-send"></span>Enviar</button>
                                                </div>
                                            </div>
                                        </form>
                                    </li>
                                </ul>
                            </div>
<!--                            <div class="collapse" id="teste${obj.id}">
                                <ul class="media-list">
                                    <li class="media media-replied">
                                        <form action="SiteCtl?acao=updProposta&idTarefa=${obj.id}&idEmpregado=${empregado.id}" method="post" class="form-horizontal" role="form">
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">Atualizar Proposta</label>
                                                <div class="col-sm-10">
                                                    <textarea class="form-control" name="descricao"  rows="5"></textarea>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label  class="col-sm-2 control-label">Valor Minimo</label>
                                                <div class="col-sm-10">
                                                    <div class="input-group">

                                                        <input type="number" class="form-control" name="valorMinimo" >
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button class="btn btn-success btn-circle text-uppercase"  type="submit" ><span class="glyphicon glyphicon-send"></span>Enviar</button>
                                                </div>
                                            </div>
                                        </form>
                                    </li>
                                </ul>
                            </div>-->
                            <div class="collapse" id="resposta${obj.id}">
                                <ul class="media-list">
                                    <c:forEach items="${obj.solucaoList}" var="solucao">

                                        <li class="media media-replied" >
                                            <a class="pull-left" href="#">
                                                <img class="media-object img-circle" title="${solucao.empregado.nome}" src="../imagem/${solucao.empregado.foto}" height="120" width="120" alt="profile">
                                            </a>
                                            <div class="media-body">
                                                <div class="well well-lg">
                                                    <h4 class="media-heading text-uppercase reviews"><span class="glyphicon glyphicon-share-alt"></span>${solucao.empregado.nome}</h4></h4>
                                                    <ul class="media-date text-uppercase reviews list-inline">
                                                        <li class="dd">Data : <fmt:formatDate pattern = "dd-MM-yyyy" value = "${solucao.data}" /></li>
                                                        <br>
                                                        <li class="dd">Valor Necessario :R$ ${solucao.valorminimo}</li>
                                                        <br>
                                                        <li class="dd">Cidade : ${solucao.empregado.cidade}</li>

                                                    </ul>
                                                    <p class="media-comment">
                                                        ${solucao.descricao}
                                                    </p>

                                                    <c:if test="${empregado.perfil==true && solucao.empregado.id == empregado.id}">
                                                        <a class="btn btn-danger btn-circle text-uppercase" href="SiteCtl?acao=delSolucao&id=${solucao.id}" id="reply"><span class="glyphicon glyphicon-remove"></span> Excluir </a>
                                                        <a class="btn btn-success btn-circle text-uppercase" data-toggle="collapse" href="#TE${solucao.id}"><span class="glyphicon glyphicon-refresh"></span> Atualizar</a>
                                                    </c:if>
                                                </div>

                                            </div>
                                        </li>
                                        <%@include file="AtualizarSolucao.jsp" %>
                                    </c:forEach>
                                </ul>
                            </div>


                        </li>

                    </c:forEach>



                </ul>
            </div>
        </div>

    </div>

    <%@include file="adicionaTarefa.jsp" %>

    <script>




    </script>
</body>
</html>
