/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Album;

/**
 *
 * @author eliane
 */
public class AlbumDao extends GenericDAO<Album, Integer>{    
    public AlbumDao(){
        super(Album.class);
    }
}
