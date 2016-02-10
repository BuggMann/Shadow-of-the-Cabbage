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
 * @author heapc_000
 */
public class PuzzleControlTest {
    
    public PuzzleControlTest() {
    }

    /**
     * Test of calcCylinder method, of class PuzzleControl.
     */
    @Test
    public void testCalcCylinder() {
        System.out.println("calcCylinder");
        System.out.println ("test case 1");
        double height = 23.0;
        double radius = 14.0;
        double expResult = 14162.29968;
        double result = PuzzleControl.calcCylinder(height, radius);
        assertEquals(expResult, result, 0.4);
       
        System.out.println ("test case 2");
        height = 10.0;
        radius = 0.0;
        expResult = 0.-1;
        result = PuzzleControl.calcCylinder(height, radius);
        assertEquals(expResult, result, 0.4);
        
        System.out.println ("test case 3");
        height = 0.0;
        radius = 10.0;
        expResult = 0.-1;
        result = PuzzleControl.calcCylinder(height, radius);
        assertEquals(expResult, result, 0.4);
        
        System.out.println ("test case 4");
        height = 5.0;
        radius = 38.0;
        expResult = 0.-1;
        result = PuzzleControl.calcCylinder(height, radius);
        assertEquals(expResult, result, 0.4);
        
        System.out.println ("test case 5");
        height = 38.0;
        radius = 5.0;
        expResult = 0.-1;
        result = PuzzleControl.calcCylinder(height, radius);
        assertEquals(expResult, result, 0.4);
        
        System.out.println ("test case 6");
        height = 1.0;
        radius = 1.0;
        expResult = 3.1415;
        result = PuzzleControl.calcCylinder(height, radius);
        assertEquals(expResult, result, 0.4);
        
        System.out.println ("test case 7");
        height = 37.0;
        radius = 37.0;
        expResult = 159131.093;
        result = PuzzleControl.calcCylinder(height, radius);
        assertEquals(expResult, result, 0.4);
    }

    /**
     * Test of calcAngle method, of class PuzzleControl.
     */
    @Test
    public void testCalcAngle() {
        System.out.println("calcAngle");
        System.out.println("test case 1");
        double height = 40.0;
        double distance = 64.0;
        double expResult = 75.47184;
        double result = PuzzleControl.calcAngle(height, distance);
        assertEquals(expResult, result, 0.4);
        
        System.out.println("test case 2");
        height = 0.0;
        distance = 10.0;
        expResult = 0.-1;
        result = PuzzleControl.calcAngle(height, distance);
        assertEquals(expResult, result, 0.4);
        
         System.out.println("test case 3");
        height = 10.0;
        distance = 0.0;
        expResult = 0.-2;
        result = PuzzleControl.calcAngle(height, distance);
        assertEquals(expResult, result, 0.4);
        
         System.out.println("test case 4");
        height = 5.0;
        distance = 76.0;
        expResult = 0.-2;
        result = PuzzleControl.calcAngle(height, distance);
        assertEquals(expResult, result, 0.4);
        
         System.out.println("test case 5");
        height = 76.0;
        distance = 5.0;
        expResult = 0.-1;
        result = PuzzleControl.calcAngle(height, distance);
        assertEquals(expResult, result, 0.4);
        
         System.out.println("test case 6");
        height = 1.0;
        distance = 1.0;
        expResult = 1.41421356;
        result = PuzzleControl.calcAngle(height, distance);
        assertEquals(expResult, result, 0.4);
        
         System.out.println("test case 7");
        height = 75.0;
        distance = 75.0;
        expResult = 106.066017;
        result = PuzzleControl.calcAngle(height, distance);
        assertEquals(expResult, result, 0.4);
    }
    
}
