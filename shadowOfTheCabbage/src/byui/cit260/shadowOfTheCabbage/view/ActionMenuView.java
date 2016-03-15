/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.MapControl;
import java.util.Scanner;

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
              + "\nInventory - List items currently held (abbreviated to 'I')"
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
            case "MAP": 
                this.displayMap();
                break;
            case "LOOK": 
                this.look();
                break;
            case "OPEN": 
                this.open();
                break;
            case "TAKE": 
                this.take();
                break;
            case "DROP": 
                this.drop();
                break;
            case "USE": 
                this.use();
                break;
            case "ATTACK": 
                this.attack();
                break;
            case "SAVE": 
                this.save();
                break;
            case "INVENTORY": 
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
        MapControl map = new MapControl.scenes[];
    }

    private void look() {
        System.out.println("\n*** look() function called*** ");
    }

    private void open() {
        System.out.println("\n*** open() function called*** ");
    }

    private void take() {
        System.out.println("\n*** take() function called*** ");
    }

    private void drop() {
        System.out.println("\n*** drop() function called*** ");
    }

    private void use() {
        System.out.println("\n*** use() function called*** ");
    }

    private void attack() {
        System.out.println("\n*** attack() function called*** ");
    }

    private void save() {
        System.out.println("\n*** save() function called*** ");
    }

    private void displayInventory() {
        System.out.println("\n*** displayInventory() function called*** ");
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
