/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.exceptions.MoveControlException;

/**
 *
 * @author heapc_000
 */
public class MoveControl {

    public static boolean moveDirection(String value) throws MoveControlException {
        if (value.equalsIgnoreCase("North") || value.equalsIgnoreCase("South") || value.equalsIgnoreCase("East") || value.equalsIgnoreCase("West")) {
            return true;
        } 
        throw new MoveControlException("\nNot a valid direction. Try again.");
    }
}
