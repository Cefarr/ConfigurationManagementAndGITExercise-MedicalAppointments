/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.pdsw.persistence.mybatis;

import edu.eci.pdsw.samples.entities.Eps;
import java.util.List;

/**
 *
 * @author cesar
 */
public interface EPSDAOMyBATIS {
    
    public List<Eps> loadAll();
    public Eps loadByID();
    public void save();
    public void update();
    
}
