<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html >
    <head>
        <meta charset="utf-8">
        <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
        <title>Listagem de Empregados</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="styleListagemServicosEmpregados.css" rel="stylesheet">
        <meta http-equiv="content-type" content="text/html;charset=utf-8" />

    </head>
    <style>
        .tab-content{
            border:none;
            margin-top: -56px;
        }

        #divBusca{
            background-color:#2F4F4F;
            border:solid 1px;
            border-radius:15px;
            width:90%;
            height: 37px;
            
        }

        #txtBusca{
            float:middle;
            background-color:transparent;
            padding-left:5px;
            font-style:italic;
            font-size:18px;
            border:none;
            height:32px;
            width:90%;
        }
        #btnBusca{
            float:right;
            background-color:transparent;
            
            border-radius: 15px; 
            font-size:18px;
            
            height:30px;
            width:10%;
        }
        #btnBusca .btn{
            padding: 6px 28px;
            borde-radius:28px;
        }
      

    </style>
    <body class="fundo" style="background-color: #333">
        <%@include file="Cabecalho2.jsp" %>

        <div class="container">
            <div class="row">

                <div class="tab-content">

                    <h3 class="section-subheading " style="color:red" id="teste2">Faça Sua Solicitação</h3>
                    <!-- Search form -->
                    <form action="SiteCtl?acao=buscar" method="get" id="formulario" style="max-width:none; padding: initial; background: #333">  
                    <div id="divBusca">
                        <input type="text" id="txtBusca" placeholder="Buscar..."/>
                        <div id="btnBusca">
                            
                            <button  class="btn" > Buscar</button>
                            
                        </div>
                    </div>
                  </form>
                    <hr style="color:#333">
                    <ul class="media-list">
                        <c:forEach items="${listaEmpregados}" var="empregado">
                            <li class="media media-replied" >
                                <a class="pull-left" href="#">
                                    <img class="media-object img-circle" src="../imagem/${empregado.foto}" height="120" width="120" alt="profile">
                                </a>
                                <div class="media-body">
                                    <div class="well well-lg">
                                        <h4 class="media-heading text-uppercase reviews"><span class="glyphicon glyphicon-share-alt"></span>${empregado.nome}</h4></h4>
                                        <ul class="media-date  reviews list-inline">
                                            <li class="dd" id="estrelas"></li>



                                        </ul>
                                        <p class="media-comment">
                                            ${empregado.descricao}
                                        </p>
                                        <c:if test="${empregador.perfil==true}">
                                            <a class="btn btn-info btn-circle text-uppercase" href="SiteCtl?acao=perfilCandidato&id=${empregado.id}" id="reply"><span class="glyphicon glyphicon-user"></span> Ver Perfil  
                                                <a class="btn btn-success btn-circle text-uppercase" data-toggle="modal" data-target="#exampleModalCenter${empregado.id}"><span class="glyphicon glyphicon-ok-sign"></span> Contratar</a>


                                            </c:if>

                                    </div>

                                </div>
                            </li>
                            <%@include file="criarContrato.jsp" %>
                            <script>

                                <c:if test="${empregado.avaliacao == 5}" >
                                for (var i = 0; i <= 4; i++) {
                                    var i1 = document.createElement('i');
                                    i1.className = "fa fa fa-star";
                                    document.getElementById("estrelas").appendChild(i1);


                                }
                                </c:if>

                                <c:if test="${empregado.avaliacao  > 2.5 and empregado.avaliacao < 3.5 }" >

                                for (var i = 0; i < 2; i++) {
                                    var i1 = document.createElement('i');
                                    i1.className = "fa fa fa-star";
                                    document.getElementById("estrelas").appendChild(i1);


                                }


                                </c:if>
                                <c:if test="${empregado.avaliacao  < 2.5 and empregado.avaliacao > 1.5 }" >

                                for (var i = 0; i < 1; i++) {
                                    var i1 = document.createElement('i');
                                    i1.className = "fa fa fa-star";
                                    document.getElementById("estrelas").appendChild(i1);


                                }


                                </c:if>
                                <c:if test="${empregado.avaliacao  < 1.5 and empregado.avaliacao  > 0.5 }" >

                                for (var i = 0; i < 1; i++) {
                                    var i1 = document.createElement('i');
                                    i1.className = "fa fa fa-star-half";
                                    document.getElementById("estrelas").appendChild(i1);


                                }


                                </c:if>


                            </script>
                        </c:forEach>

                    </ul>
                </div>
                </li>
                </ul>
            </div>



        </div>
    </div>






</body>

</html>
