package Modelo;

import Modelo.Contrato;
import Modelo.Tarefa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-24T08:35:22")
@StaticMetamodel(Empregador.class)
public class Empregador_ { 

    public static volatile SingularAttribute<Empregador, String> senha;
    public static volatile SingularAttribute<Empregador, String> telefone;
    public static volatile SingularAttribute<Empregador, String> cidade;
    public static volatile ListAttribute<Empregador, Tarefa> tarefaList;
    public static volatile SingularAttribute<Empregador, String> foto;
    public static volatile ListAttribute<Empregador, Contrato> contratoList;
    public static volatile SingularAttribute<Empregador, String> nome;
    public static volatile SingularAttribute<Empregador, Integer> id;
    public static volatile SingularAttribute<Empregador, Integer> avaliacao;
    public static volatile SingularAttribute<Empregador, String> email;
    public static volatile SingularAttribute<Empregador, Boolean> perfil;

}