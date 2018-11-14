<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="content-type" content="text/html;charset=utf-8" />
        <title>TCC</title>
        <!--<link href="../Cabecalho/css/layout.css" rel="stylesheet" type="text/css" />-->
         <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
        <link href="Cabecalho/css/menu.css" rel="stylesheet" type="text/css" />
    </head>
    <body>  
        <nav>
          
                <ul class="ulC">
                    <li><a href="SiteCtl?acao=listarServicosEmpregador">Serviços</a></li>
                      <li>
                        <a href="SiteCtl?acao=perfilEmpregador&id=${empregador.id}">Perfil</a>
                    </li>
                      <li>
                        <a href="SiteCtl?acao=verCategorias&id=${empregador.id}">Ver Categorias de Empregados</a>
                    </li>
                    <li><a href="../admin/categoria/">ADMINISTRADOR</a></li>
                    <li><a href="SiteCtl?acao=sair&id=${empregador.id}">Sair</a></li>
                </ul>
           
            
        </nav>
