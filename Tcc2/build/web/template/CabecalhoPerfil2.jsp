<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <meta charset="UTF-8">
  
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Perfil TCC</title>
    <meta name="description" content="Creative CV is a HTML resume template for professionals. Built with Bootstrap 4, Now UI Kit and FontAwesome, this modern and responsive design template is perfect to showcase your portfolio, skils and experience."/>
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
  
    <link href="Perfil2/css/aos.css" rel="stylesheet">
   <link href="Perfil2/css/bootstrap.min.css" rel="stylesheet">
   
    <link href="Perfil2/styles/main.css" rel="stylesheet">
  </head>
  <body id="top">
      <div class="profile-page sidebar-collapse">
        <nav class="navbar navbar-expand-lg fixed-top navbar-transparent bg-primary" color-on-scroll="400">
          <div class="container">
            <div class="navbar-translate"><a class="navbar-brand" href="#" rel="tooltip">Creative CV</a>
              <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-bar bar1"></span><span class="navbar-toggler-bar bar2"></span><span class="navbar-toggler-bar bar3"></span></button>
            </div>
            <div class="collapse navbar-collapse justify-content-end" id="navigation">
              <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link smooth-scroll" href="SiteCtl?acao=listarServicosEmpregador">Serviços</a></li>
                <li class="nav-item"><a class="nav-link smooth-scroll" href="SiteCtl?acao=perfilEmpregador&id=${empregador.id}">Perfil</a></li>
               
                <li class="nav-item"><a class="nav-link smooth-scroll" href="#experience">Alterar Perfil</a></li>
                 <li class="nav-item"><a class="nav-link smooth-scroll" href="SiteCtl?acao=sair&id=${empregador.id}">Sair</a></li>
              
              </ul>
            </div>
          </div>
        </nav>
      </div>