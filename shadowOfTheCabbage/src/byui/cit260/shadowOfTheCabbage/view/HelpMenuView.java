/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.GameControl;
import java.util.Scanner;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author Scott
 */
public class HelpMenuView {
    private String menu;

    public HelpMenuView() {
    this.menu = "\n"
              + "\n------------------------"
              + "\n| Help Menu            |"
              + "\n------------------------"
              + "\nA - Action Menu"
              + "\nC - Displays A Cabbage"
              + "\nI - Displays Inventory"
              + "\nQ - Quit";
    }
    public void displayHelpMenuView() {
        
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
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
            case "A":
                this.displayActionMenu();
                break;
            case "C":
                this.displayCabbage();
                break;
            case "I":
                this.displayInventory();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void displayActionMenu() {
       System.out.println("*** displayActionMenu function Called ***");
    }

    private void displayCabbage() {
        System.out.println("*** displayCabbage function Called ***");
    }

    private void displayInventory() {
        System.out.println("*** displayInventory function Called ***");
    }
       
}

