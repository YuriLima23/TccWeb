<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="styleLogin.css" rel="stylesheet" id="bootstrap-css">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="loginJavascript.js"></script>

    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-login">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-6">
                                    <a href="#" class="active" id="login-form-link">Login Empregado</a>
                                </div>
                                <div class="col-xs-6">
                                    <a href="#" id="register-form-link">Login Empregador</a>
                                </div>
                            </div>
                            <hr>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form id="login-form" action="SiteCtl?acao=loginEmpregado" method="post" role="form" style="display: block;">
                                        <c:if test="${inexistente == "nao"}">
                                            <h4 style="color:#ff0000">Usuario Inexistente</h4>
                                        </c:if>

                                        <div class="form-group">
                                            <input type="text" name="email" id="username" tabindex="1" class="form-control" placeholder="Email" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="senha" id="password" tabindex="2" class="form-control" placeholder="Senha">
                                        </div>

                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Entrar">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="text-center">
                                                        <a href="SiteCtl" tabindex="5" class="forgot-password">Registrar se?</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                    <form id="register-form" action="SiteCtl?acao=loginEmpregador" method="post"  style="display: none;">
                                        <c:if test="${inexistente2 == "sim"}">
                                            <h4 style="color:#ff0000">Usuario Inexistente</h4>
                                        </c:if>
                                        <div class="form-group">
                                            <input type="text" name="email" id="username" tabindex="1" class="form-control" placeholder="Email" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="senha" id="password" tabindex="2" class="form-control" placeholder="Senha">
                                        </div>

                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Entrar">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="text-center">
                                                        <a href="SiteCtl" tabindex="5" class="forgot-password">Registrar se?</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
