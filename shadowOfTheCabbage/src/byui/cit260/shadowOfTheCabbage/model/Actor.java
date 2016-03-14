/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author heapc_000
 */
public enum Actor implements Serializable {
   Eponine("She is your lovely lady friend."),
   HoboJoe("He is a very old and wise guy");
    private final String description;
    private final Point location;

    Actor(String description) {
        this.description = description;
        location = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getLocation() {
        return location;
    }
    
    

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", location=" + location + '}';
    }

   
    
}
