package Modelo;

import Modelo.Empregado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-24T08:35:22")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, String> icon;
    public static volatile SingularAttribute<Categoria, String> imagem;
    public static volatile SingularAttribute<Categoria, String> nome;
    public static volatile SingularAttribute<Categoria, Integer> id;
    public static volatile ListAttribute<Categoria, Empregado> empregadoList;

}