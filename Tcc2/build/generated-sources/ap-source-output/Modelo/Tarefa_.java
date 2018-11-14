package Modelo;

import Modelo.Empregador;
import Modelo.Solucao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-24T08:35:22")
@StaticMetamodel(Tarefa.class)
public class Tarefa_ { 

    public static volatile SingularAttribute<Tarefa, String> valordisponivel;
    public static volatile ListAttribute<Tarefa, Solucao> solucaoList;
    public static volatile SingularAttribute<Tarefa, String> titulo;
    public static volatile SingularAttribute<Tarefa, Date> datafinal;
    public static volatile SingularAttribute<Tarefa, Integer> id;
    public static volatile SingularAttribute<Tarefa, Empregador> empregador;
    public static volatile SingularAttribute<Tarefa, Date> datainicial;
    public static volatile SingularAttribute<Tarefa, Boolean> completado;
    public static volatile SingularAttribute<Tarefa, String> descricao;

}