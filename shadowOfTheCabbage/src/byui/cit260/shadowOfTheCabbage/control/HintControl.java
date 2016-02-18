/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

/**
 *
 * @author Scott
 */
public class HintControl {
    
    public double calcDelay(double delay, double numberOfHints) {
       
        if (delay < 0 || delay > 11) {
            
            return -1;
        }
        
        if (numberOfHints < 0) {
            
            return -2;
        }
        
        double newDelay = delay + (numberOfHints * 2);
        
        if (newDelay > 17) {
            
            return -3;
        }
        
        return newDelay;
        }
}
