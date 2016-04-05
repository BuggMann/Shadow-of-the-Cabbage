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
public class RegularScene implements Serializable {

    private String description;
    private String hint;
    private String mapSymbol;
    private boolean blocked;
     private View view;

    public RegularScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String symbol) {
        this.mapSymbol = symbol;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.description);
        hash = 73 * hash + Objects.hashCode(this.hint);
        hash = 73 * hash + Objects.hashCode(this.mapSymbol);
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
        final RegularScene other = (RegularScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.hint, other.hint)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + ", hint=" + hint + ", symbol=" + mapSymbol + '}';
    }

}
