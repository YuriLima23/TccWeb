/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Tarefa;

/**
 *
 * @author eliane
 */
public class TarefaDao extends GenericDAO<Tarefa, Integer>{    
    public TarefaDao(){
        super(Tarefa.class);
    }
}