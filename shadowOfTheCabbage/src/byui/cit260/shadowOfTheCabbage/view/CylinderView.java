/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.PuzzleControl;
import java.util.Scanner;

/**
 *
 * @author Scott
 */
public class CylinderView {
    private String promptMessage;

    public CylinderView() {
    this.promptMessage = "\n"
              + "\nInput the height of your cylinder!"
              + "\n"
              + "\nB - Back";
    }
    public void displayCylinderView() {
        
        boolean done = false;
        do {
            
            String height = this.getInput();
            
            if (height.toUpperCase().equals("B"))
                return;
            
            done = this.doAction(height);
            
        } while (!done);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not value
      
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
          
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trail blanks
          
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
            }
          
            break; // end the loop
      }
      
      return value; // return the value entered
    }

    private boolean doAction(String input) {
        
        //convert height to double
        double dHeight = Double.parseDouble(input);
        //set promptMessage = "Enter Distance"
        this.promptMessage = "input radius";
        //call getInput to get the distance entered
        this.getInput();
        //convert the distance to a double
        double dRadius = Double.parseDouble(input);
        //call PuzzleControl.calcCylinder
        double volume = PuzzleControl.calcCylinder(dHeight, dRadius);
        //if calcCylinder is not successful then display error and return
        if (volume == -1) {
            System.out.println("Invalid Value: Your height or radius is bigger than 37");
            return false;
        }
        else {
            System.out.println("The volume of that cylinder is: " + volume);
            PuzzleControl.openDoor();
        }
        
        return true;
    }
}
