/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowofthecabbage;

import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.Player;

/**
 *
 * @author Scott
 */
public class ShadowOfTheCabbage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Mighty Cannon");
       playerOne.setBossesKilled(4);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       Location locationOne = new Location();
       
       locationOne.setRow(4);
       locationOne.setColumn(3);
       locationOne.setVisited(true);
       
       String locationInfo = locationOne.toString();
       System.out.println(locationInfo);
    }
    
}