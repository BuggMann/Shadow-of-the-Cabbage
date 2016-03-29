/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.exceptions;

/**
 *
 * @author Scott
 */
public class MaxStrengthControlException extends Exception {

    public MaxStrengthControlException() {
    }

    public MaxStrengthControlException(String string) {
        super(string);
    }

    public MaxStrengthControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MaxStrengthControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MaxStrengthControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
