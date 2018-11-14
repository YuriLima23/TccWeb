package Modelo;

import Modelo.Empregado;
import Modelo.Empregador;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-24T08:35:22")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, Empregado> empregado;
    public static volatile SingularAttribute<Contrato, Date> datadeinicio;
    public static volatile SingularAttribute<Contrato, Date> datafinal;
    public static volatile SingularAttribute<Contrato, Integer> id;
    public static volatile SingularAttribute<Contrato, Empregador> empregador;
    public static volatile SingularAttribute<Contrato, String> descricao;

}