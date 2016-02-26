/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import java.util.Scanner;

/**
 *
 * @author Scott
 */
public class ActionMenuView {
    private String menu;

    public ActionMenuView() {
    this.menu = "\n"
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
              + "\nB - Go Back (Help Menu)";
    }
    public void displayActionMenuView() {
        
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("B"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
      String value = ""; // value to be returned
      boolean valid = false; // initialize to not value
      
      while (!valid) { // loop while an invalid value is entered
          System.out.println("\n" + this.menu);
          
          value = keyboard.nextLine(); // get next line typed on keyboard
          value = value.trim(); // trim off leading and trail blanks
          
          if (value.length() < 1) { // value is blank
              System.out.println("\nInvalid value: value can not be blank");
          }
          
          break; // end the loop
      }
      
      return value; // return the value entered
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
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
        System.out.println("\n*** displayMap() function called*** ");
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
