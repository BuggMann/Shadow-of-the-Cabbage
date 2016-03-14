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
    Sword("weapon", "Jezebel", "As dangerous as a contentious and angry woman"),
    Axe("weapon", "Axcalibur", "Some say it was pulled from a stone.. or was it a log"),
    Spear("weapon", "The Point", "Get to the point!"),
    Mace("weapon", "Windu", "created in a galaxy far far away. Not sure how it got into your inventory"),
    Bommerang("weapon", "Glorp", "One boomerang to rule them all. Forged in the firey depths of Mount Boom"),
    Cabbage("food", "The Cabbage", "A leafy green");
    
    private String itemType;
    private String itemName;
    private String description;
    
    private Game game;

    Item(String itemType, String itemName, String description) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.description = description;
    }
    
    public String getItemType() {
        return itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemType=" + itemType + ", itemName=" + itemName + ", description=" + description + '}';
    }
}
