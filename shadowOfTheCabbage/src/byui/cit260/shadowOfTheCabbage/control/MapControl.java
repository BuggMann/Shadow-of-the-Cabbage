/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.Map;
import byui.cit260.shadowOfTheCabbage.model.RegularScene;
import javafx.scene.Scene;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(5, 5);

        Scene scenes[] = createScenes();

        assignScenesToLocations(map, scenes);

        return map;
    }

    private static Scene[] createScenes() {

        Game game = ShadowOfTheCabbage.getCurrentGame();

        RegularScene[] scenes = new RegularScene[SceneType.values().length];

        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
        "\nYou find yourself at the top of a hill overlooking a very large valley"
        + "\nYou see forests, deserts a large lake a frozen tundra"
        + "\nand ominous mountains in the distance");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene cylinderScene = new Scene();
        cylinderScene.setDescription(
        "\nYou see an incredibly large door"
        
              + "\ncovered in giant skulls and other"
              + "\nbones (which is super creepy). There"
              + "\nis an inscription on the door which"
              + "\nreads 'Only with the correct amount"
              + "\nof water will this door open'"
              + "\nThe cryptic message wants you to"
              + "\ncalculate the right cylinder size to"
              + "\npour into the door's slot");
        cylinderScene.setMapSymbol(" CY ");
        cylinderScene.setBlocked(false);
        scenes[SceneType.cylinder.ordinal()] = cylinderScene;

        Scene fBossScene = new Scene();
        fBossScene.setDescription(
        "\nThe door opens into a grove, with a small field in the middle"
        + "\nIn the center of the field stands a centaur. Kill it quick!");
        
        fBossScene.setMapSymbol(" FB ");
        fBossScene.setBlocked(false);
        scenes[SceneType.fBoss.ordinal()] = fBossScene;

        Scene cBossScene = new Scene();
        cBossScene.setDescription(
        "\nYou are on a ledge above"
        
              + "\n a large room. You look"
              + "\n down and see an ugly beast."
              + "\n You dont like the look of"
              + "\n him and decide to throw a rock"
              + "\n"
              + "\n Judge the cliff height"
              + "\n and distance to target"
              + "\n to get the perfect throw.");
        cBossScene.setMapSymbol(" CB ");
        cBossScene.setBlocked(false);
        scenes[SceneType.cBoss.ordinal()] = cBossScene;

        Scene wBossScene = new Scene();
        wBossScene.setDescription(
        "\nYou stumble upon a lake and decide you want to take a swim."
	+ "\nSuddenly a serpent like beast bursts out of the water");
        wBossScene.setMapSymbol(" WB ");
        wBossScene.setBlocked(false);
        scenes[SceneType.wBoss.ordinal()] = wBossScene;
        Scene dBossScene = new Scene();
        dBossScene.setDescription(
        "\nYou find a desert and decide you want to cross it."
	+ "\nYou feel the sand rumble, and suddenly a giant sandworm pops out.");
        
        dBossScene.setMapSymbol(" DB ");
        dBossScene.setBlocked(false);
        scenes[SceneType.dBoss.ordinal()] = dBossScene;

        Scene rBossScene = new Scene();
        rBossScene.setDescription(
        "\nYou exit the cave only to find you’ve wandered into a frozen tundra."
	+ "\nYou hear a loud roar, and look to your right.A huge Wampa is running at you!");
     
        rBossScene.setMapSymbol(" RB ");
        rBossScene.setBlocked(false);
        scenes[SceneType.rBoss.ordinal()] = rBossScene;

        Scene forestScene = new Scene();
        forestScene.setDescription(
        "\nA beautiful forest");
        forestScene.setMapSymbol(" F ");
        forestScene.setBlocked(false);
        scenes[SceneType.forest.ordinal()] = forestScene;

        Scene caveScene = new Scene();
        caveScene.setDescription(
        "\nA dark and damp cave");
        caveScene.setMapSymbol(" C ");
        caveScene.setBlocked(false);
        scenes[SceneType.cave.ordinal()] = caveScene;
        Scene HoboJoeScene = new Scene();
        HoboJoeScene.setDescription(
        "\nYou find an old wise looking man sitting on a rock");
        HoboJoeScene.setMapSymbol(" HJ ");
        HoboJoeScene.setBlocked(false);
        scenes[SceneType.hoboJoe.ordinal()] = HoboJoeScene;

        Scene mountainScene = new Scene();
        mountainScene.setDescription(
        "\nYou are at the base of a large ominous mountain");
        mountainScene.setMapSymbol(" M ");
        mountainScene.setBlocked(false);
        scenes[SceneType.mountain.ordinal()] = mountainScene;

        Scene lakeSideScene = new Scene();
        lakeSideScene.setDescription(
        "\nYou are on the shore of a beautiful lake");
        lakeSideScene.setMapSymbol(" LS ");
        lakeSideScene.setBlocked(false);
        scenes[SceneType.lakeSide.ordinal()] = lakeSideScene;

        Scene meadowScene = new Scene();
        meadowScene.setDescription(
        "\nA large meadow full of grasses and flowers");
        meadowScene.setMapSymbol(" G ");
        meadowScene.setBlocked(false);
        scenes[SceneType.meadow.ordinal()] = meadowScene;

        Scene towerScene = new Scene();
        towerScene.setDescription(
        "\nYour lady loves tower of doom");
        towerScene.setMapSymbol(" T ");
        towerScene.setBlocked(false);
        scenes[SceneType.tower.ordinal()] = towerScene;

        Scene finishScene = new Scene();
        finishScene.setDescription(
        "\nCongratulations,you’ve slayed the 5 beasts and saved your lady love");
        finishScene.setMapSymbol(" E ");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        Scene desertScene = new Scene();
        desertScene.setDescription(
        "\nA hot and sandy place");
        desertScene.setMapSymbol(" D ");
        desertScene.setBlocked(false);
        scenes[SceneType.desert.ordinal()] = desertScene;

    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
       Location[][] locations = map.getLocations();
       
       locations[0][0].setScene(scenes[sceneType.start.ordinal()]);
       locations[0][1].setScene(scenes[sceneType.cylinder.ordinal()]); 
       locations[0][2].setScene(scenes[sceneType.fBoss.ordinal()]); 
       locations[0][3].setScene(scenes[sceneType.cBoss.ordinal()]); 
       locations[0][4].setScene(scenes[sceneType.wBoss.ordinal()]); 
       locations[0][5].setScene(scenes[sceneType.dBoss.ordinal()]); 
       locations[0][6].setScene(scenes[sceneType.rBoss.ordinal()]); 
       locations[0][7].setScene(scenes[sceneType.forest.ordinal()]); 
       locations[0][8].setScene(scenes[sceneType.cave.ordinal()]); 
       locations[0][9].setScene(scenes[sceneType.hoboJoe.ordinal()]); 
       locations[1][0].setScene(scenes[sceneType.mountain.ordinal()]); 
       locations[1][2].setScene(scenes[sceneType.lakeside.ordinal()]); 
       locations[1][3].setScene(scenes[sceneType.meadow.ordinal()]); 
       locations[1][4].setScene(scenes[sceneType.tower.ordinal()]); 
       locations[1][5].setScene(scenes[sceneType.forest.ordinal()]); 
       locations[1][6].setScene(scenes[sceneType.forest.ordinal()]); 
       locations[1][7].setScene(scenes[sceneType.meadow.ordinal()]); 
       locations[1][8].setScene(scenes[sceneType.meadow.ordinal()]); 
       locations[1][9].setScene(scenes[sceneType.cave.ordinal()]); 
       locations[2][0].setScene(scenes[sceneType.cave.ordinal()]); 
       locations[2][1].setScene(scenes[sceneType.lakeside.ordinal()]); 
       locations[2][2].setScene(scenes[sceneType.lakeside.ordinal()]); 
       locations[2][3].setScene(scenes[sceneType.mountain.ordinal()]); 
       locations[2][4].setScene(scenes[sceneType.mountain.ordinal()]); 
       locations[2][5].setScene(scenes[sceneType.desert.ordinal()]); 
    }

}
