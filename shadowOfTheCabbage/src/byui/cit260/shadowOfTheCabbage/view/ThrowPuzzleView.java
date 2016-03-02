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
public class ThrowPuzzleView extends View{

    public ThrowPuzzleView() {
        super("\n"
              + "\n-------------------------------------"
              + "\n|            Boss Battle            |"
              + "\n-------------------------------------"
              + "\n You are on a ledge above"
              + "\n a large room. You look"
              + "\n down and see an ugly beast."
              + "\n You dont like the look of"
              + "\n him and decide to throw a rock"
              + "\n"
              + "\n Judge the cliff height"
              + "\n and distance to target"
              + "\n to get the perfect throw." 
              + "\n"
              + "\nB - Back"
              + "\n"
              + "\n  Please enter the cliff Height");
    }
    @Override
    public boolean doAction(String height) { 
        //convert height to double
        double dHeight = Double.parseDouble(height);
        //set promptMessage equal to "enter the distance"
        this.displayMessage = "enter distance";
        //call getInput to get the distance entered
        String distance = this.getInput();
        //convert distance to a double
        double dDistance = Double.parseDouble(distance);
        //call control function to perform task
        double angle = PuzzleControl.calcAngle(dHeight, dDistance);
         if (angle == -1) {
            System.out.println("invalid value, must be greater than 0 and less than 76");
             return false;
        }
        else if (dDistance == -2) {
            System.out.println("invalid value, must be greater than 0 and less than 76");
             return false;
        }
        else if (angle < 0){
            System.out.println("you missed your mark, you threw  " + -angle + "  Try again");
            return true;
        }
        else {
            System.out.println("Your throw was straight! The beast is dead!");
            return true;
        }
         
    }

   
}

