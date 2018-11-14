<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="CabecalhoPerfil2.jsp" %>
<style>

    .progress {
        height: 20px;
        margin-bottom: 20px;
        overflow: hidden;
        background-color: #f5f5f5;
        border-radius: 4px;
        -webkit-box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);
        box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);
    }
    .progress-bar {
        float: left;
        width: 0;
        height: 100%;
        font-size: 12px;
        line-height: 20px;
        color: #fff;
        text-align: center;
        background-color: #337ab7;
        -webkit-box-shadow: inset 0 -1px 0 rgba(0, 0, 0, .15);
        box-shadow: inset 0 -1px 0 rgba(0, 0, 0, .15);
        -webkit-transition: width .10s ease;
        -o-transition: width .10s ease;
        transition: width .10s ease;
    }
    .progress-striped .progress-bar,
    .progress-bar-striped {
        background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        -webkit-background-size: 40px 40px;
        background-size: 40px 40px;
    }
    .progress.active .progress-bar,
    .progress-bar.active {
        -webkit-animation: progress-bar-stripes 5s linear infinite;
        -o-animation: progress-bar-stripes 5s linear infinite;
        animation: progress-bar-stripes 5s linear infinite;
    }
    .progress-bar-success {
        background-color: #5cb85c;
    }
    .progress-striped .progress-bar-success {
        background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
    }
    .progress-bar-info {
        background-color: #5bc0de;
    }
    .progress-striped .progress-bar-info {
        background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
    }
    .progress-bar-warning {
        background-color: #f0ad4e;
    }
    .progress-striped .progress-bar-warning {
        background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
    }
    .progress-bar-danger {
        background-color: #d9534f;
    }
    .progress-striped .progress-bar-danger {
        background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:      -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
        background-image:         linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);
    }



</style>


<div class="page-content">
    <div>
        <div class="profile-page">
            <div class="wrapper">
                <div class="page-header page-header-small" filter-color="green">
                    <div class="page-header-image" data-parallax="true" ></div>
                    <div class="container">
                        <div class="content-center">
                            <div class="cc-profile-image"><a href="#"><img src="../imagem/${empregador.foto}" alt="Image"/></a></div>
                            <div class="h2 title">${empregador.nome}</div>
                            <p class="category text-white"></p></div>
                    </div>
                    <div class="section">
                        <div class="container">
                            <div class="button-container"><a class="btn btn-default btn-round btn-lg btn-icon" href="#" rel="tooltip" title="Follow me on Facebook"><i class="fa fa-facebook"></i></a><a class="btn btn-default btn-round btn-lg btn-icon" href="#" rel="tooltip" title="Follow me on Twitter"><i class="fa fa-twitter"></i></a><a class="btn btn-default btn-round btn-lg btn-icon" href="#" rel="tooltip" title="Follow me on Google+"><i class="fa fa-google-plus"></i></a><a class="btn btn-default btn-round btn-lg btn-icon" href="#" rel="tooltip" title="Follow me on Instagram"><i class="fa fa-instagram"></i></a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="section" id="about">
            <div class="container">
                <div class="card" data-aos="fade-up" data-aos-offset="10">
                    <div class="row">

                        <div class="col-lg-6 col-md-12">
                            <div class="card-body">
                                <div class="h4 mt-0 title">Basic Information</div>

                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Email:</strong></div>
                                    <div class="col-sm-8">${empregador.email}</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Telefone:</strong></div>
                                    <div class="col-sm-8">${empregador.telefone}</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Cidade:</strong></div>
                                    <div class="col-sm-8">${empregador.cidade}</div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="section" id="experience">
            <div class="container cc-experience">
                <div class="h4 text-center mb-4 title">Contratos Pendentes</div>
                <c:forEach items="${listaContratos}" var="obj">
                    <c:if test="${obj.status == false}">
                        <div class="card" data-aos="zoom-in">
                            <div class="row">
                                <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                                    <div class="card-body" ><img src="../imagem/${obj.empregado.foto}" height="auto" width="auto"  alt="Image"/>

                                    </div>  
                                </div>

                                <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                                    <div class="card-body">

                                        <h3 class="h5 pt-2" >${obj.empregado.nome} (Empregado)</h3>
                                        <p>${obj.descricao}}</div>
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width:100%">
                                            Em Andamento 
                                        </div>
                                    </div> 
                                </div>

                            </div>
                        </div>
                    </c:if>
                    <c:if test="${obj.status == true}">
                        <c:if test="${obj.completado == false}">
                            <div class="card" data-aos="zoom-in">

                                <a title="Finalizar contrato"  class="btn btn-primary smooth-scroll mr-2" style="float: right;"  data-toggle="modal" data-target="#exampleModalCenter${obj.id}"  >
                                    <i class="fa fa-check" style="font-size:20px;"></i></a>
                                <div class="row">
                                    <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                                        <div class="card-body" ><img src="../imagem/${obj.empregado.foto}" height="auto" width="auto"  alt="Image"/>

                                        </div>  
                                    </div>

                                    <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                                        <div class="card-body">

                                            <h3 class="h5 pt-2" >${obj.empregado.nome} (Empregado)</h3>
                                            <p>${obj.descricao}}</div>
                                        <div class="progress">
                                            <div class="progress-bar-success progress-bar-striped active" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width:100%">
                                                Contrato Aceito
                                            </div>

                                        </div>

                                    </div>

                                </div>

                            </div>
                        </c:if>
                        <%@include file="FinalizarContrato.jsp"%>
                    </c:if>
                </c:forEach>
            </div>


        </div>
    </div>

    <!--    <div class="section" id="reference">
            <div class="container cc-reference">
                <div class="h4 mb-4 text-center title">References</div>
                <div class="card" data-aos="zoom-in">
                    <div class="carousel slide" id="cc-Indicators" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li class="active" data-target="#cc-Indicators" data-slide-to="0"></li>
                            <li data-target="#cc-Indicators" data-slide-to="1"></li>
                            <li data-target="#cc-Indicators" data-slide-to="3"></li>
    
                        </ol>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <div class="row">
                                    <div class="col-lg-2 col-md-3 cc-reference-header">
                                        <img src="Perfil2/images/reference-image-1.jpg" alt="Image"/>
                                        <div class="h5 pt-2">Aiyana</div>
                                        <p class="category">CEO / WEBM</p>
                                    </div>
                                    <div class="col-lg-10 col-md-9">
                                        <p> Habitasse venenatis commodo tempor eleifend arcu sociis sollicitudin ante pulvinar ad, est porta cras erat ullamcorper volutpat metus duis platea convallis, tortor primis ac quisque etiam luctus nisl nullam fames. Ligula purus suscipit tempus nascetur curabitur donec nam ullamcorper, laoreet nullam mauris dui aptent facilisis neque elementum ac, risus semper felis parturient fringilla rhoncus eleifend.</p>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>-->

</div>
</div></div>
</div>
<footer class="footer">
    <div class="container text-center"><a class="cc-facebook btn btn-link" href="#"><i class="fa fa-facebook fa-2x " aria-hidden="true"></i></a><a class="cc-twitter btn btn-link " href="#"><i class="fa fa-twitter fa-2x " aria-hidden="true"></i></a><a class="cc-google-plus btn btn-link" href="#"><i class="fa fa-google-plus fa-2x" aria-hidden="true"></i></a><a class="cc-instagram btn btn-link" href="#"><i class="fa fa-instagram fa-2x " aria-hidden="true"></i></a></div>
    <div class="h4 title text-center">Anthony Barnett</div>
    <div class="text-center text-muted">
        <p>&copy; Creative CV. All rights reserved.<br>Design - <a class="credit" href="https://templateflip.com" target="_blank">TemplateFlip</a></p>
    </div>
</footer>
<script src="Perfil2/js/core/jquery.3.2.1.min.js"></script>
<script src="Perfil2/js/core/popper.min.js"></script>
<script src="Perfil2/js/core/bootstrap.min.js"></script>
<script src="Perfil2/js/now-ui-kit.js?v=1.1.0"></script>
<script src="Perfil2/js/aos.js"></script>
<script src="Perfil2/scripts/main.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>