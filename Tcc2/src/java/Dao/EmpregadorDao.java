
package Dao;

import Controle.TarefaCtl;
import Modelo.Contrato;
import Modelo.Empregador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;

/**
 *
 * @author yuri
 */
public class EmpregadorDao extends GenericDAO<Empregador, Integer>{    
    public EmpregadorDao(){
        super(Empregador.class);
    }
    
     public Query checkLogin(String email, String senha) {

        Query q = em.createNamedQuery("Empregador.login");
        q.setParameter("email", email);
        q.setParameter("senha", senha);
         
        return q;
     
    }
     
      
}
