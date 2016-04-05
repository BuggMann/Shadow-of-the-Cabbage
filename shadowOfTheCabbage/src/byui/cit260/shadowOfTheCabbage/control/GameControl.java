/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.exceptions.GameControlException;
import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Item;
import byui.cit260.shadowOfTheCabbage.model.Map;
import byui.cit260.shadowOfTheCabbage.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        ShadowOfTheCabbage.setCurrentGame(game);

        game.setPlayer(player);

        Map map = MapControl.createMap();
        game.setMap(map);
        
        game.setCurrentLocation(map.getLocations()[0][0]);
    }

    public static void saveGame(Game game, String filePath) throws GameControlException, IOException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        ShadowOfTheCabbage.setCurrentGame(game);
    }

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        ShadowOfTheCabbage.setPlayer(player);

        return player;
    }

}
