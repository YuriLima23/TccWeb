
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Form</title>
    <link rel="stylesheet" href="css/normalize.css">
    <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    <link rel="stylesheet" href="styleAdicionaTarefa.css">
</head>


<div class="modal fade" id="exampleModalCenter${obj.id}" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <form action="SiteCtl?acao=updTarefa&id=${obj.id}" method="post">

                    <h1>Atualize Sua Tarefa</h1>

                    <fieldset>

                        <label for="name">Titulo : </label>
                        <input type="text" value="${obj.titulo}"  name="titulo">

                        <label for="mail">Data de Inicio :</label>
                        <input type="date" name="dataInicial" value="<fmt:formatDate pattern = "yyyy-MM-dd" 
                                        value = "${obj.datainicial}" />">

                        <label for="nome">Data De Termino:</label>
                        <input type="date" name="dataFinal" value="<fmt:formatDate pattern = "yyyy-MM-dd" 
                                        value = "${obj.datafinal}" />" >
                        <label for="nome">Valor Disponivel:</label>
                        <input type="number" value="${obj.valordisponivel}" name="valorDisponivel">

                        <label for="bio">Descrição:</label>
                        <textarea id="bio" name="descricao"> ${obj.descricao}</textarea>
                    </fieldset>

                    <button type="submit" >Atualizar</button>
                </form>
            </div>
            <div class="modal-body">
                ...
            </div>

        </div>
    </div>
</div>

