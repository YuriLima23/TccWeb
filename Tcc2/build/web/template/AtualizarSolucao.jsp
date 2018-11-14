
      <div class="collapse" id="TE${solucao.id}">
                                <ul class="media-list">
                                    <li class="media media-replied">
                                        <form action="SiteCtl?acao=updProposta&id=${solucao.id}" method="post" class="form-horizontal" role="form">
                                            <div class="form-group">
                                                <label class="col-sm-2 control-label">Atualizar Proposta</label>
                                                <div class="col-sm-10">
                                                    <textarea class="form-control" name="descricao"  rows="5">${solucao.descricao}</textarea>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label  class="col-sm-2 control-label">Valor Minimo</label>
                                                <div class="col-sm-10">
                                                    <div class="input-group">

                                                        <input type="number" class="form-control" value="${solucao.valorminimo}" name="valorMinimo" >
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button class="btn btn-success btn-circle text-uppercase"  type="submit" ><span class="glyphicon glyphicon-send"></span>Enviar</button>
                                                </div>
                                            </div>
                                        </form>
                                    </li>
                                </ul>
                            </div>
  