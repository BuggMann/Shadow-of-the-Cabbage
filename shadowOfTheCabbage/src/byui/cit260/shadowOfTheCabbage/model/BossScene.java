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
 * @author Scott
 */
public class BossScene extends RegularScene{
    
    private String enemy;
    private boolean finished;

    public BossScene() {
        super();
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.enemy);
        hash = 41 * hash + (this.finished ? 1 : 0);
        return hash;
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
        final BossScene other = (BossScene) obj;
        if (this.finished != other.finished) {
            return false;
        }
        if (!Objects.equals(this.enemy, other.enemy)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BossScene{" + "enemy=" + enemy + ", finished=" + finished + '}';
    }
    
    
           
}
