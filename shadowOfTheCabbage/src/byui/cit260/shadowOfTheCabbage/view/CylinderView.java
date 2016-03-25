/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.PuzzleControl;
import byui.cit260.shadowOfTheCabbage.exceptions.PuzzleControlException;

/**
 *
 * @author Scott
 */
public class CylinderView extends View{
   
    public CylinderView() {
        super("\n"
              + "\nYou see an incredibly large door"
              + "\ncovered in giant skulls and other"
              + "\nbones (which is super creepy). There"
              + "\nis an inscription on the door which"
              + "\nreads 'Only with the correct amount"
              + "\nof water will this door open'"
              + "\nThe cryptic message wants you to"
              + "\ncalculate the right cylinder size to"
              + "\npour into the door's slot"
              + "\n"
              + "\nInput the height of your cylinder"
              + "\n"
              +"\nB - Back");
    }
    @Override
    public boolean doAction(String height) {
        
        //convert height to double
        double dHeight = 0;
        try {
        dHeight = Double.parseDouble(height);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),"\n You must enter a valid number. Try again.");
        }
        //set promptMessage = "Enter Distance"
        this.displayMessage = "input radius";
        //call getInput to get the distance entered
        String radius = this.getInput();
        //convert the distance to a double
        double dRadius = 0;
        try {
        dRadius = Double.parseDouble(radius);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),"\n You must enter a valid number. Try again.");
        }
        //call PuzzleControl.calcCylinder
        try {
        double volume = PuzzleControl.calcCylinder(dHeight, dRadius);
        } catch (PuzzleControlException me) {
            ErrorView.display(this.getClass().getName(),me.getMessage());
            return false;
        }
        //if calcCylinder is not successful then display error and return
        
            this.console.println("Good job, You opened the door!");
            return true;
        
    }
}
