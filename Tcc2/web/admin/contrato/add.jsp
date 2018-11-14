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
        <div class="panel-heading"> Album </div>
        <div class="panel-body">
            <div class="alert <%=classe%>">
               <c:out value="${msg}"/>
            </div>
            <form action="ContratoCtl?acao=add" method="post">                
                <div class="col-lg-6">
                   
                    
                    <div>
                        <label>Descrição</label>
                        <input class="form-control" type="text"  required name="descricao"/>
                        
                    </div>
                    <div>
                        <label>Data Inicial</label>
                        <input class="form-control" type="date"  required name="dataInicial"/>
                        
                    </div>
                    <div>
                        <label>Data Final</label>
                        <input class="form-control" type="date"  required name="dataFinal"/>
                        
                    </div>
                    <div>
                        <label>Empregados</label>
                        <select class="form-control"  name="empregado">
                            <option > - Selecion um Empregador-</option>
                            <c:forEach items="${empregados}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select>
                        
                    </div>
                    <div>
                        <label>Empregadores</label>
                        <select class="form-control"  name="empregador">
                            <option > - Selecion um Empregadores-</option>
                            <c:forEach items="${empregadores}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select>
                        
                    </div>
                    <div>
                        <label>Valor Disponivel</label>
                        <input class="form-control" type="number"  required name="valorDisponivel"/>
                        
                    </div>
                   
                    
                    <button class="btn btn-primary btn-sm" type="submit">Salvar</button>                
            </form>
        </div>
    </div>
</div>
<%@include file="../rodape.jsp" %>