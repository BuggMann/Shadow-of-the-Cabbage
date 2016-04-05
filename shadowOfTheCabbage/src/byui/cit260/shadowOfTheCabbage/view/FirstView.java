/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.MoveControl;
import byui.cit260.shadowOfTheCabbage.exceptions.MoveControlException;
import byui.cit260.shadowOfTheCabbage.model.Location;

/**
 *
 * @author Scott
 */
public class FirstView extends View {

    public FirstView() {
        super("\n"
                + "\nYou find yourself outside of a large"
                + "\narching gateway with a large cabbage"
                + "\nemblazoned on its keystone."
                + "\nIt is the only obvious way foreward,"
                + "\nand the gateway is NORTH."
                + "\n enter move to travel");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "MOVE": //display action menu
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
