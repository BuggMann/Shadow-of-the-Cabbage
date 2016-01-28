/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.model;

import java.io.Serializable;

/**
 *
 * @author heapc_000
 */
public class Game implements Serializable {
    
    private double getTime;

    public Game() {
    } 
  
    public double getGetTime() {
        return getTime;
    }

    public void setGetTime(double getTime) {
        this.getTime = getTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.getTime) ^ (Double.doubleToLongBits(this.getTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "getTime=" + getTime + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.getTime) != Double.doubleToLongBits(other.getTime)) {
            return false;
        }
        return true;
    }
    
    
}
