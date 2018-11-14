package Modelo;

import Modelo.Empregado;
import Modelo.Tarefa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-24T08:35:22")
@StaticMetamodel(Solucao.class)
public class Solucao_ { 

    public static volatile SingularAttribute<Solucao, Empregado> empregado;
    public static volatile SingularAttribute<Solucao, Date> data;
    public static volatile SingularAttribute<Solucao, Tarefa> tarefa;
    public static volatile SingularAttribute<Solucao, Integer> id;
    public static volatile SingularAttribute<Solucao, String> valorminimo;
    public static volatile SingularAttribute<Solucao, String> descricao;

}