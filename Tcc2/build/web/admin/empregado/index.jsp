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
                <a href="EmpregadoCtl?acao=list">listagem</a>
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
            <a  href="EmpregadoCtl?acao=1" class="btn  btn-primary btn-sm fa fa-plus-square-o" >Novo</a>            
        </div>
    </div>
</div>
<div class="row">
    <div class="panel panel-default">
        <form action="EmpregadoCtl" method="get">
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
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Senha</th>
                        <th>Descricao</th>
                        <th>Cidade</th>
                        <th>Telefone</th>
                        <th>Foto</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${lista}" var="obj">
                    <tr>
                            <td><c:out value="${obj.nome}"/></td>
                            <td><c:out value="${obj.email}"/></td>
                            <td><c:out value="${obj.senha}"/></td>
                            <td><c:out value="${obj.descricao}"/></td>
                            <td><c:out value="${obj.cidade}"/></td>
                            <td><c:out value="${obj.telefone}"/></td>
                            <td><c:out value="${obj.foto}"/></td>
                            <td><a href="EmpregadoCtl?acao=upd&id=<c:out value="${obj.id}"/>" class="btn  btn-primary btn-sm">Alterar</a>
                            <a href="EmpregadoCtl?acao=del&id=<c:out value="${obj.id}"/>" class="btn  btn-primary btn-sm">Excluir</a>  
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