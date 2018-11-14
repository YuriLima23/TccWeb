/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Solucao;

/**
 *
 * @author eliane
 */
public class SolucaoDao extends GenericDAO<Solucao, Integer>{    
    public SolucaoDao(){
        super(Solucao.class);
    }
}