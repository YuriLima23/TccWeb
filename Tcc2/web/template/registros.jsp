<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="styleRegistro.css" rel="stylesheet" id="bootstrap-css">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-2.2.4.min.js"></script>
        <script src="registroJavascript.js"></script>

    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-login">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-6">
                                    <a href="#" class="active" id="login-form-link">Registro Empregado</a>
                                </div>
                                <div class="col-xs-6">
                                    <a href="#" id="register-form-link">Registro Empregador</a>
                                </div>
                            </div>
                            <hr>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form id="login-form" action="SiteCtl?acao=addEmpregado" method="post"  enctype="multipart/form-data" role="form" style="display: block;">
                                        <div class="form-group">
                                            <input type="text" name="nome" id="username" class="form-control" placeholder="Nome" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="email" name="email" id="email" class="form-control" placeholder="Email" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="senha" id="password"  class="form-control" placeholder="Senha" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="telefone"  class="form-control" placeholder="Telefone" required>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" id="estados">
                                                <option>- Selecione seu estado - </option>

                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" name="cidade" id="cidades">
                                                <option>- Selecione sua cidade - </option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <textArea type="text" name="descricao"  class="form-control" placeholder="Descreva você mesmo como trabalhador" required></textarea>
                                        </div>
                                        <div class="form-group">
                                            <select  name="categoria"  class="form-control" placeholder="Cidade" required>
                                                <option >- Selecione uma Categoria -</option>
                                                <c:forEach items="${categorias}" var ="obj">
                                                
                                                <option value="${obj.id}" >${obj.nome}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <input type="file" name="arquivo" tabindex="2" class="form-control" placeholder="Foto" accept="image/*" required>
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit"  id="register-submit"  class="form-control btn btn-register" value="Registrar-se">
                                                </div>
                                            </div>
                                             <h5 style="text-align: center"><a href="login.jsp" >Fazer Login</a></h5>
                                        </div>
                                    </form>
                                    
                                    <!--FORMULARIO EMPREGADOR _------------------------------------------------------------------------>
                                    
                                    <form id="register-form" action="SiteCtl?acao=addEmpregador" method="post" enctype="multipart/form-data" role="form" style="display: none;">
                                        <div class="form-group">
                                            <input type="text" name="nome" id="username" class="form-control" placeholder="Nome" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="email" name="email" id="email" class="form-control" placeholder="Email" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="senha" id="password"  class="form-control" placeholder="Senha" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="telefone"  class="form-control" placeholder="Telefone" required>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" id="estadoss">
                                          

                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" name="cidade" id="cidadess">
                                           
                                            </select>
                                        </div>
                                         <div class="form-group">
                                            <input type="file" name="arquivo" tabindex="2" class="form-control" placeholder="Foto" required>
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Registrar-se">
                                                </div>
                                            </div>
                                             <h5 style="text-align: center"><a href="login.jsp" >Fazer Login</a></h5>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
          <script>
              $(document).ready(function () {

                  $.getJSON('estados_cidades.json', function (data) {
                      var items = [];
                      var options = '<option value="">escolha um estado</option>';
                      $.each(data, function (key, val) {
                          options += '<option value="' + val.nome + '">' + val.nome + '</option>';
                      });
                      $("#estados").html(options);

                      $("#estados").change(function () {

                          var options_cidades = '';
                          var str = "";

                          $("#estados option:selected").each(function () {
                              str += $(this).text();
                          });

                          $.each(data, function (key, val) {
                              if (val.nome == str) {
                                  $.each(val.cidades, function (key_city, val_city) {
                                      options_cidades += '<option value="' + val_city + '">' + val_city + '</option>';
                                  });
                              }
                          });
                          $("#cidades").html(options_cidades);

                      }).change();

                  });

              });
              $(document).ready(function () {

                  $.getJSON('estados_cidades.json', function (data) {
                      var items = [];
                      var options = '<option value="">escolha um estado</option>';
                      $.each(data, function (key, val) {
                          options += '<option value="' + val.nome + '">' + val.nome + '</option>';
                      });
                      $("#estadoss").html(options);

                      $("#estadoss").change(function () {

                          var options_cidades = '';
                          var str = "";

                          $("#estadoss option:selected").each(function () {
                              str += $(this).text();
                          });

                          $.each(data, function (key, val) {
                              if (val.nome == str) {
                                  $.each(val.cidades, function (key_city, val_city) {
                                      options_cidades += '<option value="' + val_city + '">' + val_city + '</option>';
                                  });
                              }
                          });
                          $("#cidadess").html(options_cidades);

                      }).change();

                  });

              });

</script>

    </body>
</html>
