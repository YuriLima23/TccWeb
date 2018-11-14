<%@page import="Modelo.Tarefa"%>
<%@page import="java.util.List"%>

<%@page import="Dao.TarefaDao"%>
<%@page import="Dao.SolucaoDao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="Cabecalho2.jsp" %>
<!DOCTYPE html>

<!--
Falar com o professor sobre :

conseguir pergar o endereço da imagina na hora de cadastrar (perfil)

O SISTEMA DAS DATAS NÂO TA CONVERTENDO

-->
<head>
    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>TCC</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
  

    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
      <link href="styleListagemServicos.css" rel="stylesheet">

</head>




<div class="container">

    <div class="row">
        

            <ul id="mais" class="nav nav-tabs" >


                <li >
                    <a id="borda"  data-toggle="modal" data-target="#exampleModalCenter" title="Adicionar Serviço">

                        <span class="round-tabs three">
                            <i class="glyphicon glyphicon-plus"></i>
                        </span> </a>
                </li>


            </ul>

        <div class="tab-content">
            <div class="tab-pane active" id="comments-logout">

                <ul class="media-list">


                    <li class="media">

                        <c:forEach items="${tarefas}" var="obj">

                            <a class="pull-left" href="#">
                                <img class="media-object img-circle" src="../imagem/${obj.empregador.foto}" height="120" width="120" alt="profile">
                                
                            </a>
                            <div class="media-body">
                                <div class="well well-lg">
                                    <h4 class="media-heading text-uppercase reviews">${obj.titulo} </h4> 
                                    <ul class="media-date  reviews list-inline">
                                        <li class="dd">Data :<fmt:formatDate pattern="dd-MM-yyyy" value ="${obj.datainicial}"/></li>
                                        <br>
                                        <li class="dd"> Valor R$: ${obj.valordisponivel}</li>
                                        <br>
                                        <li class="dd">Cidade : ${obj.empregador.cidade}</li>

                                    </ul>
                                    <p class="media-comment">
                                        ${obj.descricao}
                                    </p>
                                    <c:if test="${empregador.perfil == true && obj.empregador.id == empregador.id}">
                                        <a class="btn btn-info btn-circle text-uppercase " data-toggle="collapse" href="#resposta${obj.id}"><span class="glyphicon glyphicon-comment"></span> Ver mais</a>
                                        <a class="btn btn-danger btn-circle text-uppercase" href="SiteCtl?acao=delTarefa&id=${obj.id}" id="reply"><span class="glyphicon glyphicon-remove"></span> Excluir </a>
                                        <a class="btn btn-success btn-circle text-uppercase"  data-toggle="modal" data-target="#exampleModalCenter${obj.id}"><span class="glyphicon glyphicon-refresh" ></span> Atualizar</a>

                                    </c:if>

                                </div>
                            </div>




                            <div class="collapse" id="resposta${obj.id}">
                                <ul class="media-list">
                                    <c:forEach items="${obj.solucaoList}" var="solucao">

                                        <li class="media media-replied" >
                                            <a class="pull-left" href="#">
                                                <img class="media-object img-circle" src="../imagem/${solucao.empregado.foto}" height="120" width="120" alt="profile">
                                            </a>
                                            <div class="media-body">
                                                <div class="well well-lg">
                                                    <h4 class="media-heading text-uppercase reviews"><span class="glyphicon glyphicon-share-alt"></span>${solucao.empregado.nome}</h4></h4>
                                                    <ul class="media-date  reviews list-inline">
                                                      <li class="dd">Data : <fmt:formatDate pattern = "dd-MM-yyyy" value = "${solucao.data}" /></li>
                                                        <br>
                                                        <li class="dd">Valor Necessario :R$ ${solucao.valorminimo}</li>
                                                        <br>
                                                        <li class="dd">Cidade : ${solucao.empregado.cidade}</li>


                                                    </ul>
                                                    <p class="media-comment">
                                                        ${solucao.descricao}
                                                    </p>
                                                    <c:if test="${empregador.perfil==true}">
                                                        <a class="btn btn-info btn-circle text-uppercase" href="SiteCtl?acao=perfilCandidato&id=${solucao.empregado.id}" id="reply"><span class="glyphicon glyphicon-user"></span> Ver Perfil</a>
                                                        <a class="btn btn-success btn-circle text-uppercase" data-toggle="modal" data-target="#exampleModalCenter${solucao.id}"><span class="glyphicon glyphicon-ok-sign"></span> Contratar</a>
                                                    </c:if>
                                                       
                                                </div>

                                            </div>
                                        </li>
                                      <%@include file="FazerContrato.jsp" %>
                                    </c:forEach>
                                </ul>
                            </div>


                        </li>
                             
                        <%@include file="AtualizarTarefa.jsp" %>
                     
                    </c:forEach>

                           <%@include file="adicionaTarefa.jsp" %>

                </ul>
            </div>
        </div>

    </div>



    <script>




    </script>
</body>
</html>
