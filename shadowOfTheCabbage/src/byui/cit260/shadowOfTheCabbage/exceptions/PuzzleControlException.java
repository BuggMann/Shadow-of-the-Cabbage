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
public class PuzzleControlException extends Exception {

    public PuzzleControlException() {
    }

    public PuzzleControlException(String string) {
        super(string);
    }

    public PuzzleControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PuzzleControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PuzzleControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
