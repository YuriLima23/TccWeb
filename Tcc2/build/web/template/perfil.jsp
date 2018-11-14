<%@include file="CabecalhoPerfil1.jsp" %>

<style>



</style>
<div class="page-content" >
    <div>
        <div class="profile-page">
            <div class="wrapper">
                <div class="page-header page-header-small" filter-color="green">
                    <div class="page-header-image" data-parallax="true" ></div>
                    <div class="container">
                        <div class="content-center">
                            <div class="cc-profile-image"><a href="#"><img src="../imagem/${empregado.foto}" alt="Image"/></a></div>
                            <div class="h2 title">${empregado.nome}</div>
                            <p class="category text-white">${empregado.categoria.nome}</p></div>
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
                                
                                <div class="h4 mt-0 title">Sobre</div>
                                <p>${empregado.descricao} </p>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-12">
                            <div class="card-body">
                                <div class="h4 mt-0 title">Informações Basicas</div>

                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Email:</strong></div>
                                    <div class="col-sm-8">${empregado.email}</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Telefone:</strong></div>
                                    <div class="col-sm-8">${empregado.telefone}</div>
                                </div>
                                <div class="row mt-3">
                                    <div class="col-sm-4"><strong class="text-uppercase">Cidade:</strong></div>
                                    <div class="col-sm-8">${empregado.cidade}</div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="section" id="skill">
            <div class="container">
                <div class="h4 text-center mb-4 title">Avaliação Média (${empregado.avaliacao})</div>
                <div class="card" id="card"  data-aos="fade-up" data-aos-anchor-placement="top-bottom">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="progress-container progress-primary"><span class="progress-badge"><i class="fa fa fa-star"></i></span>
                                    <div class="progress">
                                        <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 10%"></div><span class="progress-value"><i class="fa fa fa-star"></i><i class="fa fa fa-star"></i><i class="fa fa fa-star"></i><i class="fa fa fa-star"></i><i class="fa fa fa-star"></i></span>
                                    </div>
                                </div>
                            </div>
                            <!--                            <div class="col-md-6">
                                                            <div class="progress-container progress-primary"><span class="progress-badge">CSS</span>
                                                                <div class="progress">
                                                                    <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 75%;"></div><span class="progress-value">75%</span>
                                                                </div>
                                                            </div>
                                                        </div>-->
                        </div>
                        <!--                        <div class="row">
                                                    <div class="col-md-6">
                                                        <div class="progress-container progress-primary"><span class="progress-badge">JavaScript</span>
                                                            <div class="progress">
                                                                <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;"></div><span class="progress-value">60%</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <div class="progress-container progress-primary"><span class="progress-badge">SASS</span>
                                                            <div class="progress">
                                                                <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;"></div><span class="progress-value">60%</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <div class="progress-container progress-primary"><span class="progress-badge">Bootstrap</span>
                                                            <div class="progress">
                                                                <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 75%;"></div><span class="progress-value">75%</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <div class="progress-container progress-primary"><span class="progress-badge">Photoshop</span>
                                                            <div class="progress">
                                                                <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10" data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 70%;"></div><span class="progress-value">70%</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>-->
                    </div>
                </div>
            </div>
        </div>
        <div class="section" id="portfolio">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 ml-auto mr-auto">
                        <div class="h4 text-center mb-4 title">Portfolio</div>
                        <div class="nav-align-center">
                            <ul class="nav nav-pills nav-pills-primary" role="tablist">
                                <li class="nav-item"><a class="nav-link active" data-toggle="tab" href="#web-development" role="tablist"><i class="fa fa-laptop" aria-hidden="true"></i></a></li>
                                <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#graphic-design" role="tablist"><i class="fa fa-picture-o" aria-hidden="true"></i></a></li>
                                <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#Photography" role="tablist"><i class="fa fa-camera" aria-hidden="true"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="tab-content gallery mt-5">
                    <div class="tab-pane active" id="web-development">
                        <div class="ml-auto mr-auto">
                            <div class="row">

                                <div class="col-md-6">
                                    <div class="cc-porfolio-image img-raised" data-aos="fade-up" data-aos-anchor-placement="top-bottom"><a href="SiteCtl?acao=listarFotos&id=${empregado.id}">
                                            <figure class="cc-effect"><img src="Perfil2/images/project-3.jpg" alt="Image"/>
                                                <figcaption>
                                                    <div class="h4">Album Projetos</div>
                                                    <p>Visualizar</p>
                                                </figcaption>
                                            </figure></a></div>



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
                <div class="card" data-aos="zoom-in">

                    <c:forEach items="${listaContratos}" var="obj">
                        <div class="row" >
                            <c:if test="${obj.status == false}">
                                <div class="col-md-3 bg-primary"  data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                                    <div class="card-body" ><img src="../imagem/${obj.empregador.foto}" height="auto" width="auto"  alt="Image"/>

                                    </div>
                                </div>
                                <div class="col-md-9" data-aos="fade-left"  data-aos-offset="50" data-aos-duration="500">
                                
                                    <div class="card-body" >
                                        <ul style="float:right;" class="media-date  reviews list-inline">
                                            <strong>  <li class="dd">Data Primeira Visita: <fmt:formatDate pattern = "dd-MM-yyyy" value = "${obj.datadeinicio}" /></li></strong>
                                            <strong>  <li class="">Cidade do Empregador: ${obj.empregador.cidade}</li></strong>
                                           
                                        </ul>
                                        <div class="h5">${obj.empregador.nome}</div>
                                        <p>${obj.descricao} </div>

                                    <a style="float: right; margin-right: 30px; " class="btn btn-danger"  href="SiteCtl?acao=recusaContrato&id=${empregado.id}&idContrato=${obj.id}"  >
                                        <i style="font-size:20px;" class="fa fa-remove"></i></a> 
                                    <a class="btn btn-primary smooth-scroll mr-2" style="float: right;"  href="SiteCtl?acao=aceitaContrato&id=${empregado.id}&idContrato=${obj.id}"  >
                                        <i class="fa fa-check" style="font-size:20px;"></i></a>
                                </div>
                            </c:if>
                            <c:if test="${obj.status == true}">
                                <c:if test="${obj.completado == false}">
                                    <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                                        <div class="card-body" ><img src="../imagem/${obj.empregador.foto}" height="auto" width="auto"  alt="Image"/>

                                        </div>
                                    </div>
                                    <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                                        <div class="card-body">
                                            <ul style="float:right;" class="media-date  reviews list-inline">
                                            <strong>  <li class="dd">Data Primeira Visita: <fmt:formatDate pattern = "dd-MM-yyyy" value = "${obj.datadeinicio}" /></li></strong>
                                            <strong>  <li class="">Cidade do Empregador: ${obj.empregador.cidade}</li></strong>
                                           
                                        </ul>
                                            <div class="h5">${obj.empregador.nome}</div>
                                            <p>${obj.descricao} </div>

                                        <i class="fa fa-check" style="font-size:50px; color: green; float:right; margin-right: 30px;"></i>
                                    </div>
                                </c:if>
                            </c:if>
                        </div>
                    </c:forEach>


                </div>
            </div>


        </div>
    </div>

    <div class="section" id="reference">
        <div class="container cc-reference">
            <div class="h4 mb-4 text-center title">FeedBacks Outros Serviços</div>
            <div class="card" data-aos="zoom-in">
                <div class="carousel slide" id="cc-Indicators" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li class="active" data-target="#cc-Indicators" data-slide-to="0"></li>
                        <li data-target="#cc-Indicators" data-slide-to="1"></li>
                        <li data-target="#cc-Indicators" data-slide-to="3"></li>

                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <c:forEach items="${listaContratos}" var="obj">
                                <div class="row">
                                    <div class="col-lg-2 col-md-3 cc-reference-header">
                                        <img src="../imagem/${obj.empregador.foto}" alt="Image"/>
                                        <div class="h5 pt-2">${obj.empregador.nome}</div>
                                        <p class="category"></p>
                                    </div>
                                    <div class="col-lg-10 col-md-9">
                                        <p>${obj.feedback}</p>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="carousel-item">
                            <div class="row">
                                <div class="col-lg-2 col-md-3 cc-reference-header"><img src="Perfil2/images/reference-image-2.jpg" alt="Image"/>
                                    <div class="h5 pt-2">Braiden</div>
                                    <p class="category">CEO / Creativem</p>
                                </div>
                                <div class="col-lg-10 col-md-9">
                                    <p> Habitasse venenatis commodo tempor eleifend arcu sociis sollicitudin ante pulvinar ad, est porta cras erat ullamcorper volutpat metus duis platea convallis, tortor primis ac quisque etiam luctus nisl nullam fames. Ligula purus suscipit tempus nascetur curabitur donec nam ullamcorper, laoreet nullam mauris dui aptent facilisis neque elementum ac, risus semper felis parturient fringilla rhoncus eleifend.</p>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="row">
                                <div class="col-lg-2 col-md-3 cc-reference-header"><img src="Perfil2/images/reference-image-3.jpg" alt="Image"/>
                                    <div class="h5 pt-2">Alexander</div>
                                    <p class="category">CEO / Webnote</p>
                                </div>
                                <div class="col-lg-10 col-md-9">
                                    <p> Habitasse venenatis commodo tempor eleifend arcu sociis sollicitudin ante pulvinar ad, est porta cras erat ullamcorper volutpat metus duis platea convallis, tortor primis ac quisque etiam luctus nisl nullam fames. Ligula purus suscipit tempus nascetur curabitur donec nam ullamcorper, laoreet nullam mauris dui aptent facilisis neque elementum ac, risus semper felis parturient fringilla rhoncus eleifend.</p>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="row">
                                <div class="col-lg-2 col-md-3 cc-reference-header"><img src="Perfil2/images/reference-image-3.jpg" alt="Image"/>
                                    <div class="h5 pt-2">Alexander</div>
                                    <p class="category">CEO / Webnote</p>
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
    </div>

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
</body>
</html>