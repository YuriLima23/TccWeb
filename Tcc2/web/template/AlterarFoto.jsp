
<head><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Shift &mdash; Free Website Template, Free HTML5 Template by FreeHTML5.co</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
    <meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
    <meta name="author" content="FreeHTML5.co" />

    <!-- 
    //////////////////////////////////////////////////////

    FREE HTML5 TEMPLATE 
    DESIGNED & DEVELOPED by FreeHTML5.co
            
    Website: 		http://freehtml5.co/
    Email: 			info@freehtml5.co
    Twitter: 		http://twitter.com/fh5co
    Facebook: 		https://www.facebook.com/fh5co

    //////////////////////////////////////////////////////
    -->

    <!-- Facebook and Twitter integration -->
    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content="" />
    <meta name="twitter:image" content="" />
    <meta name="twitter:url" content="" />
    <meta name="twitter:card" content="" />

    <!-- <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet"> -->
    <!-- <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i" rel="stylesheet"> -->

    <!-- Animate.css -->
    <link rel="stylesheet" href="Portfolio/shift/css/animate.css">
    <!-- Icomoon Icon Fonts-->
    <link rel="stylesheet" href="Portfolio/shift/css/icomoon.css">
    <!-- Bootstrap  -->
    <link rel="stylesheet" href="Portfolio/shift/css/bootstrap.css">
    <!-- Theme style  -->
    <link rel="stylesheet" href="Portfolio/shift/css/style.css">

    <!-- Modernizr JS -->
    <script src="Portfolio/shift/js/modernizr-2.6.2.min.js"></script>
    <!-- FOR IE9 below -->
    <!--[if lt IE 9]>
    <script src="js/respond.min.js"></script>
    <![endif]-->

</head>
<div class="modal fade" id="exampleModalCenter11" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <div id="fh5co-contact">
                    <div class="container">

                        <div class="row">
                            <div class="col-md-9 ">

                                <div class="col-md-7 animate-box">
                                    <h3>Album</h3>
                                    <form action="SiteCtl?acao=AlterarFoto&idEmp=${empregado.id}&idFoto=${foto.id}" method="Post"  enctype="multipart/form-data">
                                        <div class="row form-group">
                                                                                      
<!--                                                <input type="hidden" id="fname" name="id" value="${foto.id}"  class="form-control">-->
                                            
                                            <div class="col-md-12">
                                                <label for="texto">Titulo Da Imagem</label>
                                                <input type="text" id="fname" name="titulo" value="${foto.titulo}"  class="form-control">
                                            </div>
                                            <div class="col-md-12">
                                                <label for="fname">Arquivo</label>
                                                <input type="file" id="fname" name="arquivo" accept="image/*" class="form-control">
                                            </div>


                                        </div>



                                        <div class="row form-group">
                                            <div class="col-md-12">
                                                <label for="message">Descriçao Da imagem</label>
                                                <textarea name="descricao" id="message" cols="30" rows="10" class="form-control">${foto.descricao}</textarea>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" value="Alterar Foto" class="btn btn-primary">
                                        </div>

                                    </form>		
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-body">
                ...
            </div>

        </div>
    </div>
</div>
