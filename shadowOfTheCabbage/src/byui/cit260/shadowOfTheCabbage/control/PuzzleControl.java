/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.exceptions.PuzzleControlException;



/**
 *
 * @author heapc_000
 */
public class PuzzleControl {
    
    public static double calcCylinder(double height, double radius) throws PuzzleControlException{
        
        if (height < 1 || height > 37) {
        
            throw new PuzzleControlException("\ncannot enter a negative number"
                                            + "or a number larger than 37");
        }
       
        if (radius < 1 || radius > 37) {
        
            throw new PuzzleControlException("\ncannot enter a negative number"
                                            + "or a number larger than 37");
        }        
       
        double volume = Math.round((Math.PI * Math.pow(radius, 2) * height) * 100.00) / 100.00;
        
        if (volume == 461.81) {
            return volume;
        }
        throw new PuzzleControlException("\nThe volume of that cylinder is: " + -volume + ", which is incorrect"
                              +"\nTry Again");
    }
    
    public static double  calcAngle(double height, double distance) throws PuzzleControlException{ 
	if (height < 1 || height > 75) {
	
            throw new PuzzleControlException("\ncannot enter a negative number"
                                            + "or a number larger than 75");
        }
        
        if (distance < 1 || distance > 75) {
		
            throw new PuzzleControlException("\ncannot enter a negative number"
                                            + "or a number larger than 75");
        }   
	
        double angle = Math.round((Math.sqrt(Math.pow(height,2)+ Math.pow(distance,2))) * 100.00) / 100.00;
	
        if (angle == 75.47){
            return angle;
        }
         throw new PuzzleControlException("\nYou missed your mark. You threw " + angle + " Try again.");
    }

    

}
