<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Form</title>
    <link rel="stylesheet" href="css/normalize.css">
    <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
     <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="styleAdicionaTarefa.css">
</head>  

<div class="modal fade" id="exampleModalCenter${empregado.id}" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <form action="SiteCtl?acao=criarContrato&idEmpregador=${empregador.id}&idEmpregado=${empregado.id}" method="post">
                    <h1>Solicitação de Contrato</h1>
                    <label class="titulo">Descricao Empregado</label>
                    <p id="desc">${empregado.descricao}</p>
                    <hr>
                    <fieldset>
                        <label cals>Data da primeira visita:</label>
                        <input type="date"  name="dataInicial">
                        <label for="bio">Complemento:</label>
                        <textarea placeholder="Escreva aqui tudo que achares necessario como algumas regras ou horarios que preferencialmente devem ser compridos alguns requisitos que vc Deseja ETC." rows="10" id="bio" name="descricao"></textarea>
                    </fieldset>
                    <button type="submit" >Enviar Contrato</button>
                </form>
            </div>
            <div class="modal-body">
                ...
            </div>

        </div>
    </div>
</div>
