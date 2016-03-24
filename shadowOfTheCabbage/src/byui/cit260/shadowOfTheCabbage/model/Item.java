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
public enum Item implements Serializable {
    Sword("sword", "Jezebel", "As dangerous as a contentious and angry woman"),
    Axe("axe", "Axcalibur", "Some say it was pulled from a stone.. or was it a log"),
    Spear("spear", "The Point", "A spear, thats the point!"),
    Mace("mace", "Windu", "Created in a galaxy far far away. Not sure how it got into your inventory"),
    Bommerang("boomerang", "Glorp", "One boomerang to rule them all. Forged in the firey depths of Mount Boom"),
    Cabbage("food", "Cabbage", "A leafy green");
    
    private String itemType;
    private String name;
    private String description;
    
    private Game game;

    Item(String itemType, String itemName, String description) {
        this.itemType = itemType;
        this.name = itemName;
        this.description = description;
    }
    
    public String getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public String toString() {
        return  name + " - " + itemType + ", description: " + description;
    }
    
    
}

