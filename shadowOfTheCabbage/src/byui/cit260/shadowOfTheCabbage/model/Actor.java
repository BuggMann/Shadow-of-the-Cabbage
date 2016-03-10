/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author heapc_000
 */
public class Actor implements Serializable {
    
    private String actorName;
    private String description;
    private double location;
    
    private Player player;
    private Game game;

    public Actor() {
    }
    
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.actorName);
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.location) ^ (Double.doubleToLongBits(this.location) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + actorName + ", description=" + description + ", location=" + location + '}';
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
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.location) != Double.doubleToLongBits(other.location)) {
            return false;
        }
        if (!Objects.equals(this.actorName, other.actorName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
}
