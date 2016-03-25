/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.PuzzleControl;
import byui.cit260.shadowOfTheCabbage.exceptions.PuzzleControlException;
import java.util.Scanner;

/**
 *
 * @author heapc_000
 */
public class ThrowPuzzleView extends View {

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
        double dHeight = 0;
        try {
            dHeight = Double.parseDouble(height);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),"\n You must enter a valid number. Try again.");
            return false;
        }
        //set promptMessage equal to "enter the distance"
        this.displayMessage = "enter distance";
        //call getInput to get the distance entered
        String distance = this.getInput();
        //convert distance to a double
        double dDistance = 0;
        try {
            dDistance = Double.parseDouble(distance);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),"\n You must enter a valid number. Try again.");
            return false;
        }
        //call control function to perform task
        try {
            double angle = PuzzleControl.calcAngle(dHeight, dDistance);
        } catch (PuzzleControlException me) {
            ErrorView.display(this.getClass().getName(),me.getMessage());
            return false;
        }
        this.console.println("Your throw was straight! The beast is dead!");
        return true;

    }

}
