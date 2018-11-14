package Modelo;

import Modelo.Album;
import Modelo.Categoria;
import Modelo.Contrato;
import Modelo.Solucao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-24T08:35:22")
@StaticMetamodel(Empregado.class)
public class Empregado_ { 

    public static volatile SingularAttribute<Empregado, String> telefone;
    public static volatile SingularAttribute<Empregado, String> cidade;
    public static volatile ListAttribute<Empregado, Solucao> solucaoList;
    public static volatile SingularAttribute<Empregado, Categoria> categoria;
    public static volatile SingularAttribute<Empregado, String> nome;
    public static volatile SingularAttribute<Empregado, String> descricao;
    public static volatile SingularAttribute<Empregado, Boolean> perfil;
    public static volatile SingularAttribute<Empregado, String> senha;
    public static volatile SingularAttribute<Empregado, String> foto;
    public static volatile ListAttribute<Empregado, Album> albumList;
    public static volatile ListAttribute<Empregado, Contrato> contratoList;
    public static volatile SingularAttribute<Empregado, Integer> id;
    public static volatile SingularAttribute<Empregado, String> email;

}