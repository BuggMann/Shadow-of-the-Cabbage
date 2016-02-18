/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

/**
 *
 * @author heapc_000
 */
public class PuzzleControl {
    
    public static double calcCylinder(double height, double radius) {
        
        if (height < 1 || height > 37) {
        
            return -1;
        }
       
        if (radius < 1 || radius > 37) {
        
            return -1;
        }        
       
        double volume = (Math.PI * Math.pow(radius, 2) * height);
        
        return volume;
    }
    
    public static double calcAngle(double height, double distance) { 
	if (height < 1 || height > 75) {
	
            return - 1;
        }
        
        if (distance < 1 || distance > 75) {
		
            return - 2;
        }   
	
        double angle = Math.sqrt(Math.pow(height,2)+ Math.pow(distance,2));
		
        return angle;
    }

}