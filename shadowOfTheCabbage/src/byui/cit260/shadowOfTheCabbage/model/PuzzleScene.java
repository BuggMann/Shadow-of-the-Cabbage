/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.model;

import byui.cit260.shadowOfTheCabbage.view.View;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Scott
 */
public class PuzzleScene extends RegularScene {

    private boolean door;
    private String puzzle;
    

    public PuzzleScene() {
        super();
    }

    public boolean isDoor() {
        return door;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public String getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(String puzzle) {
        this.puzzle = puzzle;
    }

    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.door ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.puzzle);
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
        final PuzzleScene other = (PuzzleScene) obj;
        if (this.door != other.door) {
            return false;
        }
        if (!Objects.equals(this.puzzle, other.puzzle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PuzzleScene{" + "door=" + door + ", puzzle=" + puzzle + '}';
    }

}
