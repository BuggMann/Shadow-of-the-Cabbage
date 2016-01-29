/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowofthecabbage;


import byui.cit260.shadowOfTheCabbage.model.Actor;
import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Inventory;

import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.Map;

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
       
       Game gameOne = new Game();
       
       gameOne.setTotalTime(3);
       
       String gameInfo = gameOne.toString();
       System.out.println(gameInfo);

       Location locationOne = new Location();
       
       locationOne.setRow(4);
       locationOne.setColumn(3);
       locationOne.setVisited(true);
       
       String locationInfo = locationOne.toString();
       System.out.println(locationInfo);
       
       Actor actorOne = new Actor();
       
       actorOne.setActorName("Dennis");
       actorOne.setDescription("A tall scary man");
       actorOne.setLocation(4);
       
       String actorInfo = actorOne.toString();
       System.out.println(actorInfo);
       
       Map mapOne = new Map();
       
       mapOne.setRowCount(6);
       mapOne.setColumnCount(6);
       
       String mapInfo = mapOne.toString();
       System.out.println(mapInfo);
       
       Inventory inventoryOne = new Inventory();
       
       inventoryOne.setItemType("sword");
       inventoryOne.setItemName("jagged knife");
       inventoryOne.setDescription("A really jagged knife");
       
       String inventoryInfo = inventoryOne.toString();
       System.out.println(inventoryInfo);

    }
    
}
