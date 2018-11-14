<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
    <head>
        <meta charset="utf-8" />
        <title>TCC</title>
        <!--<link href="../Cabecalho/css/layout.css" rel="stylesheet" type="text/css" />-->
         <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
        <link href="Cabecalho/css/menu.css" rel="stylesheet" type="text/css" />
    </head>
    <body>  
        <nav>
         
         
                <ul class="ulC">
                    <li><a href="SiteCtl?acao=listarServicos">Serviços</a></li>
                    <li>
                        <a href="SiteCtl?acao=perfilEmpregado&id=${empregado.id}">Perfil</a>
                    </li>
                    <li><a href="../admin/categoria/">ADMINISTRADOR</a></li>
                    <li><a href="SiteCtl?acao=sair&id=${empregado.id}">Sair</a></li>
                </ul>
          
        </nav>
