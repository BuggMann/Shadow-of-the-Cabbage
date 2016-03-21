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
 * @author Scott
 */
public class FirstView extends View {
    public FirstView(){
        super("\n"
              + "\nYou find yourself outside of a large"
              + "\narching gateway with a large cabbage"
              + "\nemblazoned on its keystone."
              + "\nIt is the only obvious way foreward,"
              + "\nand the gateway is NORTH.");
    }
    @Override
    public boolean doAction(String value) {
        try {
        boolean move = MoveControl.moveDirection(value);
        } catch (MoveControlException me) {
              System.out.println(me.getMessage()); 
              return false;
        }
            System.out.println("\n*** move function called ***");
            return true;
        
    }
}
