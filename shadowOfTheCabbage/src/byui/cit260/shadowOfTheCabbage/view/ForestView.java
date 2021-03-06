/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.MoveControl;
import byui.cit260.shadowOfTheCabbage.exceptions.MoveControlException;

/**
 *
 * @author heapc_000
 */
public class ForestView extends View {

    public ForestView() {
        super("You are in a large forest with very tall ancient trees. "
                + "\n You can hear a strange noise in the distance."
                + "\n "
                + "\n enter move to continue traveling");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();

        switch (value) {
            case "MOVE": 
                this.displayMoveView();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
         private void displayMoveView() {
            MoveView move = new MoveView();
            move.display();
        }
}