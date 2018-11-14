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
            <form action="SiteCtl?acao=FinalizarContrato&idEmpregador=${obj.empregador.id}&idEmpregado=${obj.empregado.id}&idContrato=${obj.id}" method="post">

                <div class="modal-header">
                    <div>
                        <h1>Finalização Do Contrato</h1>
                        <fieldset>
                            <label for="finalizar"><h4>Avaliação do Contratado</h4></label>
                            <select id="finalizar" name="avaliacao">
                                <option>0</option>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                
                            </select>
                            <label for="bio" ><h4>feedback do serviço</h4></label>
                            <textarea placeholder="Escreva como foi esse serviço para voce uma avaliação pessoal com tudo q vc gostou ou nao." rows="10" id="bio" name="feedback"></textarea>
                        </fieldset>
                    </div>


                </div>
                <div class="modal-body">
                    <button type="submit" >Finalizar  Contrato</button>

                </div>
            </form>
        </div>
    </div>
</div>
