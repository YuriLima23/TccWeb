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
        <div class="panel-heading"> Usuário </div>
        <div class="panel-body">
            <div class="alert <%=classe%>">
               <c:out value="${msg}"/>
            </div>
            <form action="EmpregadoCtl?acao=add" method="post" enctype="multipart/form-data">                
                <div class="col-lg-6">
                    <div class="form-group">
                        <label>Nome</label>
                        <input class="form-control" type="text" name="nome" required/>
                    </div>
                    <div>
                        <label>Email</label>
                        <input class="form-control" type="text" name="email" required/>
                    </div>
                    <div>
                        <label>Senha</label>
                        <input class="form-control" type="text" name="senha" required/>
                    </div>
                    
                    <div>
                        <label>Cidade</label>
                        <input class="form-control" type="text" name="cidade" required/>
                    </div>
                    <div>
                        <label>Telefone</label>
                        <input class="form-control" type="text" name="telefone" required/>
                    </div>
                    <div>
                        <label>Descrição</label>
                        <input class="form-control" type="text" name="descricao" required/>
                    </div>
                    <div>
                        <label>Categoria</label>
                        <select class="form-control"  name="categorias">
                            <option > - Selecion uma Categoria -</option>
                            <c:forEach items="${categorias}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select>
                    </div>
     
                    <div>
                        <label>Foto</label>
                        <input class="form-control" type="file" name="arquivo" required accept="image/*" />
                    </div>
                    
                    <button class="btn btn-primary btn-sm" type="submit">Salvar</button>                
            </form>
        </div>
    </div>
</div>
<%@include file="../rodape.jsp" %>