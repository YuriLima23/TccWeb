<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Gerenciamento de Usu�rios
        </h1>
        <ol class="breadcrumb">
            <li>
                <i class="fa fa-dashboard"></i>  
                <a href="ContratoCtl?acao=list">listagem</a>
            </li>
            <li class="active">
                <i class="fa fa-file"></i> listagem de registros
            </li>
        </ol>
    </div>
</div>
<div class="row">
    <div class="panel panel-default">
        <div class="panel-body">
            <a  href="ContratoCtl?acao=list" class="btn  btn-primary btn-sm fa fa-plus-square-o" >Novo</a>            
        </div>
    </div>
</div>
<div class="row">
    <div class="panel panel-default">
        <form action="TarefaCtl" method="get">
            <input type="hidden" name="acao" value="list"/>
                <div class="form-group input-group">
                    <input type="text" name="filtro" class="form-control" placeholder="digite...">
                        <span class="input-group-btn"><button class="btn btn-default" type="submit"><i class="fa fa-search"></i>
                    </button></span>
        </div>
        </form>
        <div class="panel-body">
        <div class="table-responsive">
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        
                      
                        <th>Descri��o</th>
                        <th>Data Inicial</th>
                        <th>Data Final</th>
                        <th>Empregador</th>
                        <th>Empregado</th>
                        <th>Status da tarefa</th>
                        <th>Valor Disponivel </th>
                       
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${lista}" var="obj">
                    <tr>
                            
                            <td><c:out value="${obj.descricao}"/></td>
                            <td><c:out value="${obj.datadeinicio}"/></td>
                            <td><c:out value="${obj.datafinal}"/></td>
                            <td><c:out value="${obj.empregador.nome}"/></td>
                            <td><c:out value="${obj.empregado.nome}"/></td>
                             <td><c:out value="${obj.status}"/></td>
                             <td><c:out value="${obj.feedback}"/></td>
                            
                            <td><a href="ContratoCtl?acao=upd&id=<c:out value="${obj.id}"/>" class="btn  btn-primary btn-sm">Alterar</a>
                            <a href="ContratoCtl?acao=del&id=<c:out value="${obj.id}"/>" class="btn  btn-primary btn-sm">Excluir</a>  
                        </td>
                    </tr>   
                </c:forEach>
                </tbody>
            </table>
            </div>
        </div>
    </div>
    </div>
    <%@include file="../rodape.jsp" %>