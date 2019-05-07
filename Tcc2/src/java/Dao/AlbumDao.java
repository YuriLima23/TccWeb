
package Dao;

import Modelo.Album;

/**
 *
 * @author yuri
 */
public class AlbumDao extends GenericDAO<Album, Integer>{    
    public AlbumDao(){
        super(Album.class);
    }
}
