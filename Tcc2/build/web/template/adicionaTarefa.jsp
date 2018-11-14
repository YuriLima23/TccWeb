<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign Up Form</title>
        <link rel="stylesheet" href="css/normalize.css">
        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="styleAdicionaTarefa.css">
    </head>
    <body>

        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <form action="SiteCtl?acao=addTarefa&idEmpregador=${empregador.id}" method="post">

                            <h1>Crie Sua Tarefa</h1>

                            <fieldset>

                                <label for="name">Titulo : </label>
                                <input type="text"  name="titulo">

                                <label for="mail">Data de Inicio :</label>
                                <input type="date"  name="dataInicial">

                                <label for="password">Data De Termino:</label>
                                <input type="date"  name="dataFinal">
                                <label for="password">Valor Disponivel:</label>
                                <input type="number"  name="valorDisponivel">

                                <label for="bio">Descrição:</label>
                                <textarea id="bio" name="descricao"></textarea>
                            </fieldset>

                            <button type="submit" >Cadastrar</button>
                        </form>
                    </div>
                    <div class="modal-body">
                        ...
                    </div>

                </div>
            </div>
        </div>
<!--        <div class="modal fade" id="exampleModalCenter2" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <form action="SiteCtl?acao=updTarefa&id=${obj.id}" method="post">

                            <h1>Atualize Sua Tarefa</h1>

                            <fieldset>

                                <label for="name">Titulo : </label>
                                <input type="text" value="${obj.titulo}"  name="titulo">

                                <label for="mail">Data de Inicio :</label>
                                <input type="date" value="<fmt:formatDate pattern = "yyyy-MM-dd" 
                                                value = "${obj.datainicial}" />"  name="dataInicial">

                                <label for="password">Data De Termino:</label>
                                <input type="date" value="<fmt:formatDate pattern = "yyyy-MM-dd" 
                                                value = "${obj.datafinal}" />" name="dataFinal">
                                <label for="password">Valor Disponivel:</label>
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
        </div>-->
        <div class="modal fade" id="exampleModalCenter3" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <form action="SiteCtl?acao=addContrato&idEmpregador=${obj.empregador.id}&idEmpregado=${solucao.empregado.id}" method="post">

                            <h1>Solicitação de Contrato</h1>
                            <label class="titulo">Tarefa:</label>
                            <p id="desc">${obj.descricao}</p>

                            <label  class="titulo" >Solucao:</label>
                            <p id="desc">${solucao.descricao}</p>

                            <fieldset>
                                <label cals>Data de Inicio :</label>
                                <input type="date" value="${StormData.formata(obj.datainicial)}"  name="dataInicial">

                                <label for="password">Data De Termino:</label>
                                <input type="date" value ="${StormData.formata(obj.datafinal)}" name="dataFinal">
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



    </body>
</html>