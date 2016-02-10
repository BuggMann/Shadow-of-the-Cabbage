/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowofthecabbage;


import byui.cit260.shadowOfTheCabbage.model.Actor;
import byui.cit260.shadowOfTheCabbage.model.BossScene;
import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Inventory;

import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.Map;

import byui.cit260.shadowOfTheCabbage.model.Player;
import byui.cit260.shadowOfTheCabbage.model.PuzzleScene;
import byui.cit260.shadowOfTheCabbage.model.RegularScene;

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
       
       Player playerOne = new Player();
       
       playerOne.setName("Mighty Cannon");
       playerOne.setBossesKilled(4);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       PuzzleScene puzzleOne = new PuzzleScene();
       
       puzzleOne.setDoor(true);
       puzzleOne.setPuzzle("This is the Puzzle.");
       
       String puzzleInfo = puzzleOne.toString();
       System.out.println(puzzleInfo);
       
       RegularScene sceneOne = new RegularScene();
       
       sceneOne.setDescription("This is a forest");
       sceneOne.setHint("This is the hint");
       sceneOne.setSymbol("??");
       
       String sceneInfo = sceneOne.toString();
       System.out.println(sceneInfo);
       
       BossScene bossOne = new BossScene();
       
       bossOne.setEnemy("This is a big boss");
       bossOne.setFinished(true);
       
       String bossInfo = bossOne.toString();
       System.out.println(bossInfo);

    }
    
}
