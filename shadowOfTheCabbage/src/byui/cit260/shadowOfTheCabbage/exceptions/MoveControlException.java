/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.exceptions;

/**
 *
 * @author heapc_000
 */
public class MoveControlException extends Exception{

    public MoveControlException() {
    }

    public MoveControlException(String string) {
        super(string);
    }

    public MoveControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MoveControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MoveControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
