/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.MapControl;
import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Item;
import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.Map;
import java.util.Scanner;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author Scott
 */
public class ActionMenuView extends View{
    
    public ActionMenuView() {
        super("\n"
              + "\n-------------------------------------"
              + "\n|           Action Menu              |"
              + "\n-------------------------------------"
              + "\nMap - Displays map (abbreviated to 'M')"
              + "\nLook - Get a description of the current environment"
              + "\nOpen - Opens items that are not locked"
              + "\nTake - Take items that are availible for taking"
              + "\nDrop - Drops item"
              + "\nUse - Use item already in inventory"
              + "\nAttack - Attempt attack on enemies"
              + "\nSave - Save game at current location"
              + "\nInventory - display inventory"
              + "\nNorth - Moves North"
              + "\nEast - Moves East"
              + "\nSouth - Moves South"
              + "\nWest - Moves North"
              + "\nQ - Go Back (Help Menu)");
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "M": 
                this.displayMap();
                break;
            case "LOOK": 
                this.look();
                break;
            case "OPEN": 
                this.open();
                break;
            case "USE": 
                this.use();
                break;
            case "SAVE": 
                this.save();
                break;
            case "I": 
                this.displayInventory();
                break;
            case "NORTH": 
                this.moveNorth();
                break;
            case "EAST": 
                this.moveEast();
                break;
            case "SOUTH": 
                this.moveSouth();
                break;
            case "WEST": 
                this.moveWest();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void displayMap() {
        Location[][] locations = ShadowOfTheCabbage.getCurrentGame().getMap().getLocations();
        for (int i = 0; i < locations.length; i++) {
            System.out.println("\n------------------------------");
            for (int j = 0; j < locations[0].length; j++) {
                String symbol = locations[i][j].getScene().getMapSymbol();
            System.out.print("| " + symbol + " |");
            }
        }
        System.out.println("\n------------------------------");
        }

    private void look() {
        System.out.println("\n*** look() function called*** ");
    }
    
    private void open() {
        System.out.println("\n*** open() function called*** ");
    }

    private void use() {
        System.out.println("\n*** use() function called*** ");
    }

    private void save() {
        System.out.println("\n*** save() function called*** ");
    }

    private void displayInventory() {
        Item[] items = Item.values();
        
        for (Item item: items){
            System.out.println(item.getItemName() + " - " + item.getDescription());
        }
    }

    private void moveNorth() {
        System.out.println("\n*** moveNorth() function called*** ");
    }

    private void moveEast() {
        System.out.println("\n*** moveEast() function called*** ");
    }

    private void moveSouth() {
        System.out.println("\n*** moveSouth() function called*** ");
    }

    private void moveWest() {
        System.out.println("\n*** moveWest() function called*** ");
    }
      
}
