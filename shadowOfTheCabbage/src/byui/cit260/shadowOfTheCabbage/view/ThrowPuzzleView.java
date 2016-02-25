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
 * @author heapc_000
 */
public class ThrowPuzzleView {
    private String promptMessage;

    public ThrowPuzzleView() {
    this.promptMessage = "\n"
              + "\n--------------------------"
              + "\n|      Boss Battle       |"
              + "\n--------------------------"
              + "\n You are on a ledge above "
              + "\n a large room. You look   "
              + "\n down and see a ugly beast."
              + "\n You dont like the look of "
              + "\n him and decide to throw a "
              + "\n rock. Decide your height  "
              + "\n and distance to target to "
              + "\n get the perfect throw.    "
              + "\n                           "
              + "\nB - Back"
              + "\n  Please enter the Height  ";
    }
     public void displayThrowPuzzleView() {
        
        boolean done = false;
        do {
            
            String input = this.getInput();
            if (input.toUpperCase().equals("B"))
                return;
            
            done = this.doAction(input);
            
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
        //set promptMessage equal to "enter the distance"
        this.promptMessage = "enter distance";
        //call getInput to get the distance entered
        this.getInput();
        //convert distance to a double
        double dDistance = Double.parseDouble(input);
        //call control function to perform task
        PuzzleControl angle = new PuzzleControl();
        angle.calcAngle(dHeight, dDistance);
        //if control function is not succesful then display error message and return
        if (angle != 75.4718){
            System.out.println("\n missed your target try again ");
        }
        else if (angle == 75.4718){
            System.out.println("\n The rock pierced the skull of the monster and he died.");
        }
       return false; //if control function is succesful display "boss killed"   
    }

   
}

