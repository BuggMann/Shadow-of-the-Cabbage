/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowofthecabbage;


import byui.cit260.shadowOfTheCabbage.model.BossScene;
import byui.cit260.shadowOfTheCabbage.model.Game;

import byui.cit260.shadowOfTheCabbage.model.Location;

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
       Player playerOne = new Player();
       
       playerOne.setName("Mighty Cannon");
       playerOne.setBossesKilled(4);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       

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
       
       RegularScene regForest = new RegularScene();
       
       regForest.setDescription("This is a regular forest");
       regForest.setHint("This is a hint");
       regForest.setSymbol("??");
       
       String regScene = regForest.toString();
       System.out.println(regScene);
       
       BossScene firstBoss = new BossScene();
       
       firstBoss.setEnemy("Big Boss");
       firstBoss.setFinished(true);
       
       String firstBossInfo = firstBoss.toString();
       System.out.println(firstBossInfo);
       
       PuzzleScene puzzleOne = new PuzzleScene();
       
       puzzleOne.setDoor(true);
       puzzleOne.setPuzzle("This is the puzzle.");
       
       String puzzleInfo = puzzleOne.toString();
       System.out.println(puzzleInfo);
       
    }
    
}
