<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<%
String msg ="testando";
String classe = "alert-danger";
%>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Sistema
            <small>Admin</small>
        </h1>
        <ol class="breadcrumb">
            <li>
                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Área Administrativa</a>
            </li>
            <li class="active">
                <i class="fa fa-file"></i> Aqui vai o conteúdo de apresentação
            </li>
        </ol>
    </div>
</div>
<div class="row">
    <div class="panel panel-default">
        <div class="panel-heading">
            Usuário
        </div>
        <div class="panel-body">
            <div class="alert <%=classe%>">
                <%=msg%>
            </div>
            <form action="EmpregadorCtl?acao=add" method="post" enctype="multipart/form-data">                
                <div class="col-lg-6">    
                    <div class="form-group">
                        <label>ID</label>
                        <input class="form-control" type="text" readonly value="<c:out value="${obj.id}"/>" name="id"/>
                    </div>
                    <div class="form-group">
                        <label>Nome</label>
                        <input class="form-control" type="text" required value="<c:out value="${obj.nome}"/>" name="nome"/>
                    </div>
                    <div>
                        <label>Email</label>
                        <input class="form-control" type="text" required value="<c:out value="${obj.email}"/>" name="email"/>
                    </div>
                    <div>
                        <label>Senha</label>
                        <input class="form-control" type="text" required value="<c:out value="${obj.senha}"/>" name="senha"/>
                    </div>
                   
                    <div>
                        <label>Cidade</label>
                        <input class="form-control" type="text" required value="<c:out value="${obj.cidade}"/>" name="cidade"/>
                    </div>
                  
                    <div>
                        <label>Fone</label>
                        <input class="form-control" type="text" required value="<c:out value="${obj.telefone}"/>" name="telefone"/>
                    </div>
                    <div>
                        <label>Fone</label>
                        <input class="form-control" type="file" required value="<c:out value="${obj.foto}"/>" name="imagem" accept="image/*"/>
                    </div>
                <button class="btn btn-primary btn-sm" type="submit">Salvar</button>                
            </form>
        </div>
    </div>
</div>
<%@include file="../rodape.jsp" %>