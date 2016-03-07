/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.MoveControl;

/**
 *
 * @author heapc_000
 */
public class ForestView extends View {

    public ForestView() {
        super("You are in a large forest with very tall ancient trees. "
                + "\n You can hear a strange noise in the distance."
                + "\n "
                + "\n enter a direction, North, South, East, or West.");
    }

    @Override
    public boolean doAction(String value) {
        boolean move = MoveControl.moveDirection(value);
        
        if (move == true) {
            System.out.println("\n*** move function called ***");
            return true;
        } else {
            System.out.println("\n*** invalid direction, please try again ***");
        }
        return false;
    }

}
