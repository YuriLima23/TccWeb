<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Shift &mdash; Free Website Template, Free HTML5 Template by FreeHTML5.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="FreeHTML5.co" />

	<!-- <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet"> -->
	
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
	<body>
           <nav class="fh5co-nav" role="navigation">
		<div class="container">
			<div class="fh5co-top-logo">
				<div class="portfolio-navigation">
						<div class="col-xs-4 text-right">
							<a  href="SiteCtl?acao=perfilEmpregado&id=${empregado.id}" class="btn btn-primary btn-outline"><i class="icon-chevron-left"></i> Voltar </a>
						</div>
						
					</div>
			</div>
			
			
		</div>
	</nav>
	
		
	<div class="fh5co-loader"></div>
	
	<div id="page">
	
	<div id="fh5co-work">
		<div class="container">
                  
			<div class="row">
                              <c:forEach items="${fotos}" var="obj">
				<div class="col-md-4 text-center animate-box">
					<a class="work" href="SiteCtl?acao=verDetalheFotoEmpregado&idFoto=${obj.id}&idEmpregado=${empregado.id}">
						<div class="work-grid" style="background-image:url(../imagem/${obj.fotos});">
                                                                                                                                                                                                                                                                                          
							<div class="inner">
								<div class="desc">
								<h3>${obj.titulo}</h3>
								<span class="cat">${obj.empregado.nome}</span>
							</div>
							</div>
						</div>
					</a>
				</div>
                            </c:forEach>
				<div class="col-md-4 text-center animate-box">
					<a class="work" href="SiteCtl?acao=adicionaFoto&idEmpregado=${empregado.id}">
						<div class="work-grid" style="background-image:url(images/project-2.jpg);">
							<div class="inner">
								<div class="desc">
									<h3>ADICIONAR IMAGEM</h3>
									
								</div>
							</div>
						</div>
					</a>
				</div>
		
			</div>
		</div>
	</div>
	
	
	

	<footer id="fh5co-footer" role="contentinfo">
		<div class="container">
			<div class="row copyright">
				<div class="col-md-12 text-center">
					<p>
						<small class="block">&copy; 2016 Free HTML5. All Rights Reserved.</small> 
						<small class="block">Designed by <a href="http://freehtml5.co/" target="_blank">FreeHTML5.co</a> Demo Images: <a href="http://unsplash.co/" target="_blank">Unsplash</a> &amp; <a href="http://blog.gessato.com/" target="_blank">Gessato</a></small>
					</p>
					
					<ul class="fh5co-social-icons">
						<li><a href="#"><i class="icon-twitter"></i></a></li>
						<li><a href="#"><i class="icon-facebook"></i></a></li>
						<li><a href="#"><i class="icon-linkedin"></i></a></li>
						<li><a href="#"><i class="icon-dribbble"></i></a></li>
					</ul>
					
				</div>
			</div>

		</div>
	</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="Portfolio/shift/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="Portfolio/shift/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="Portfolio/shift/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="Portfolio/shift/js/jquery.waypoints.min.js"></script>
	<!-- Main -->
	<script src="Portfolio/shift/js/main.js"></script>

	</body>
</html>

