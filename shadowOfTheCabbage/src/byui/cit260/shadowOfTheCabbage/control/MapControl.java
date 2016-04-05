/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.model.BossScene;
import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.Map;
import byui.cit260.shadowOfTheCabbage.model.PuzzleScene;
import byui.cit260.shadowOfTheCabbage.model.RegularScene;
import byui.cit260.shadowOfTheCabbage.view.CaveView;
import byui.cit260.shadowOfTheCabbage.view.CylinderView;
import byui.cit260.shadowOfTheCabbage.view.DesertBossView;
import byui.cit260.shadowOfTheCabbage.view.DesertView;
import byui.cit260.shadowOfTheCabbage.view.FinishView;
import byui.cit260.shadowOfTheCabbage.view.FirstView;
import byui.cit260.shadowOfTheCabbage.view.ForestBossView;
import byui.cit260.shadowOfTheCabbage.view.ForestView;
import byui.cit260.shadowOfTheCabbage.view.FrozenBossView;
import byui.cit260.shadowOfTheCabbage.view.HoboJoeView;
import byui.cit260.shadowOfTheCabbage.view.LakesideView;
import byui.cit260.shadowOfTheCabbage.view.MeadowView;
import byui.cit260.shadowOfTheCabbage.view.MountainView;
import byui.cit260.shadowOfTheCabbage.view.ThrowPuzzleView;
import byui.cit260.shadowOfTheCabbage.view.TowerView;
import byui.cit260.shadowOfTheCabbage.view.WaterBossView;

import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(5, 5);

        RegularScene scenes[] = createScenes();

        assignScenesToLocations(map, scenes);

        return map;
    }

    private static RegularScene[] createScenes() {

        Game game = ShadowOfTheCabbage.getCurrentGame();

        RegularScene[] scenes = new RegularScene[SceneType.values().length];

        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
                "\nYou find yourself at the top of a hill overlooking a very large valley"
                + "\nYou see forests, deserts a large lake a frozen tundra"
                + "\nand ominous mountains in the distance");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        FirstView first = new FirstView();
        startingScene.setView(first);
        scenes[SceneType.start.ordinal()] = startingScene;

        PuzzleScene cylinderScene = new PuzzleScene();
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
        cylinderScene.setMapSymbol("CY");
        cylinderScene.setBlocked(false);
        CylinderView cylinder = new CylinderView();
        cylinderScene.setView(cylinder);
        scenes[SceneType.cylinder.ordinal()] = cylinderScene;

        BossScene fBossScene = new BossScene();
        fBossScene.setDescription(
                "\nThe door opens into a grove, with a small field in the middle"
                + "\nIn the center of the field stands a centaur. Kill it quick!");
        fBossScene.setMapSymbol("FB");
        fBossScene.setBlocked(false);
        ForestBossView fBoss = new ForestBossView();
        fBossScene.setView(fBoss);
        scenes[SceneType.fBoss.ordinal()] = fBossScene;

      BossScene cBossScene = new BossScene();
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
        cBossScene.setMapSymbol("CB");
        cBossScene.setBlocked(false);
        ThrowPuzzleView throwing = new ThrowPuzzleView();
        cBossScene.setView(throwing);
        scenes[SceneType.cBoss.ordinal()] = cBossScene;

        BossScene wBossScene = new BossScene();
        wBossScene.setDescription(
                "\nYou stumble upon a lake and decide you want to take a swim."
                + "\nSuddenly a serpent like beast bursts out of the water");
        wBossScene.setMapSymbol("WB");
        wBossScene.setBlocked(false);
        WaterBossView wBoss = new WaterBossView();
        wBossScene.setView(wBoss);
        scenes[SceneType.wBoss.ordinal()] = wBossScene;

        BossScene dBossScene = new BossScene();
        dBossScene.setDescription(
                "\nYou find a desert and decide you want to cross it."
                + "\nYou feel the sand rumble, and suddenly a giant snake pops out.");
        dBossScene.setMapSymbol("DB");
        dBossScene.setBlocked(false);
        DesertBossView dBoss = new DesertBossView();
        dBossScene.setView(dBoss); 
        scenes[SceneType.dBoss.ordinal()] = dBossScene;

        BossScene rBossScene = new BossScene();
        rBossScene.setDescription(
                "\nYou exit the cave only to find you’ve wandered into a frozen tundra."
                + "\nYou hear a loud roar, and look to your right.A huge Wampa is running at you!");
        rBossScene.setMapSymbol("RB");
        rBossScene.setBlocked(false);
        FrozenBossView rBoss = new FrozenBossView();
        rBossScene.setView(rBoss);
        scenes[SceneType.rBoss.ordinal()] = rBossScene;

        RegularScene forestScene = new RegularScene();
        forestScene.setDescription(
                "\nA beautiful forest");
        forestScene.setMapSymbol("F ");
        forestScene.setBlocked(false);
        ForestView forest = new ForestView();
        forestScene.setView(forest);
        scenes[SceneType.forest.ordinal()] = forestScene;

        RegularScene caveScene = new RegularScene();
        caveScene.setDescription(
                "\nA dark and damp cave");
        caveScene.setMapSymbol("C ");
        caveScene.setBlocked(false);
        CaveView cave = new CaveView();
        caveScene.setView(cave);
        scenes[SceneType.cave.ordinal()] = caveScene;

        RegularScene HoboJoeScene = new RegularScene();
        HoboJoeScene.setDescription(
                "\nYou find an old wise looking man sitting on a rock");
        HoboJoeScene.setMapSymbol("HJ");
        HoboJoeScene.setBlocked(false);
        HoboJoeView hobo = new HoboJoeView();
        HoboJoeScene.setView(hobo);
        scenes[SceneType.hoboJoe.ordinal()] = HoboJoeScene;

        RegularScene mountainScene = new RegularScene();
        mountainScene.setDescription(
                "\nYou are at the base of a large ominous mountain");
        mountainScene.setMapSymbol("M ");
        mountainScene.setBlocked(false);
        MountainView mountain = new MountainView();
        mountainScene.setView(mountain);
        scenes[SceneType.mountain.ordinal()] = mountainScene;

        RegularScene lakeSideScene = new RegularScene();
        lakeSideScene.setDescription(
                "\nYou are on the shore of a beautiful lake");
        lakeSideScene.setMapSymbol("LS");
        lakeSideScene.setBlocked(false);
        LakesideView lake = new LakesideView();
        lakeSideScene.setView(lake);
        scenes[SceneType.lakeside.ordinal()] = lakeSideScene;

        RegularScene meadowScene = new RegularScene();
        meadowScene.setDescription(
                "\nA large meadow full of grasses and flowers");
        meadowScene.setMapSymbol("G ");
        meadowScene.setBlocked(false);
        MeadowView meadow = new MeadowView();
        meadowScene.setView(meadow);
        scenes[SceneType.meadow.ordinal()] = meadowScene;

        RegularScene towerScene = new RegularScene();
        towerScene.setDescription(
                "\nYour lady loves tower of doom");
        towerScene.setMapSymbol("T ");
        towerScene.setBlocked(false);
        TowerView tower = new TowerView();
        towerScene.setView(tower);
        scenes[SceneType.tower.ordinal()] = towerScene;

        RegularScene finishScene = new RegularScene();
        finishScene.setDescription(
                "\nCongratulations,you’ve slayed the 5 beasts and saved your lady love");
        finishScene.setMapSymbol("E ");
        finishScene.setBlocked(false);
        FinishView finish = new FinishView();
        finishScene.setView(finish);
        scenes[SceneType.finish.ordinal()] = finishScene;

        RegularScene desertScene = new RegularScene();
        desertScene.setDescription(
                "\nA hot and sandy place");
        desertScene.setMapSymbol("D ");
        desertScene.setBlocked(false);
        DesertView desert = new DesertView();
        desertScene.setView(desert);
        scenes[SceneType.desert.ordinal()] = desertScene;

        return scenes;
    }

    public enum SceneType {
        start,
        cylinder,
        fBoss,
        cBoss,
        wBoss,
        dBoss,
        rBoss,
        forest,
        cave,
        hoboJoe,
        mountain,
        lakeside,
        meadow,
        tower,
        desert,
        finish;
    }

    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.lakeside.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.lakeside.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.wBoss.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.meadow.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.lakeside.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.cave.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.meadow.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.hoboJoe.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.meadow.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.cave.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.cylinder.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.tower.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.cBoss.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.fBoss.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.dBoss.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.rBoss.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
    }

}
