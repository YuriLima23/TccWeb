/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Categoria;
import Modelo.Empregado;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author eliane
 */
public class EmpregadoDao extends GenericDAO<Empregado, Integer> {

    public EmpregadoDao() {
        super(Empregado.class);
    }

    public Query checkLogin(String email, String senha) {

        Query q = em.createNamedQuery("Empregado.login");
        q.setParameter("email", email);
        q.setParameter("senha", senha);
        return q;

    }
    
     public List<Empregado> listar(Categoria c) {
        List<Empregado> empregados =  em.createNamedQuery("Empregado.findCategoria").setParameter("categoria","%" +  c.getNome() + "%").getResultList();
        return empregados;
    }
}
