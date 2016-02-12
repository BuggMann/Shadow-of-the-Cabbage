/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class HintControlTest {
    
    public HintControlTest() {
    }

    /**
     * Test of calcDelay method, of class HintControl.
     */
    @Test
    public void testCalcDelay() {
        System.out.println("calcDelay");
        
        System.out.println("Test Case #1");
        double delay = 7;
        double numberOfHints = 2;
        HintControl instance = new HintControl();
        double expResult = 11;
        double result = instance.calcDelay(delay, numberOfHints);
        assertEquals(expResult, result, 0.4);
        
        System.out.println("Test Case #2");
        delay = -1;
        numberOfHints = 0;
        expResult = -1;
        result = instance.calcDelay(delay, numberOfHints);
        assertEquals(expResult, result, 0.4);
        
        System.out.println("Test Case #3");
        delay = 0;
        numberOfHints = -1;
        expResult = -2;
        result = instance.calcDelay(delay, numberOfHints);
        assertEquals(expResult, result, 0.4);
        
        System.out.println("Test Case #4");
        delay = 17;
        numberOfHints = 4;
        expResult = -1;
        result = instance.calcDelay(delay, numberOfHints);
        assertEquals(expResult, result, 0.4);
        
        System.out.println("Test Case #5");
        delay = 25;
        numberOfHints = 5;
        expResult = -1;
        result = instance.calcDelay(delay, numberOfHints);
        assertEquals(expResult, result, 0.4);
        
        System.out.println("Test Case #6");
        delay = 0;
        numberOfHints = 0;
        expResult = 0;
        result = instance.calcDelay(delay, numberOfHints);
        assertEquals(expResult, result, 0.4);
        
        System.out.println("Test Case #7");
        delay = 17;
        numberOfHints = 4;
        expResult = -1;
        result = instance.calcDelay(delay, numberOfHints);
        assertEquals(expResult, result, 0.4);
    }
    
}
