
package Dao;

import Modelo.Tarefa;

/**
 *
 * @author Yuri 
 */
public class TarefaDao extends GenericDAO<Tarefa, Integer>{    
    public TarefaDao(){
        super(Tarefa.class);
    }
}
