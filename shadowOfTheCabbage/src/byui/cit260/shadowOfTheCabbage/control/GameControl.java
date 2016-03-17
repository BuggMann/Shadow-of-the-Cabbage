/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Item;
import byui.cit260.shadowOfTheCabbage.model.Map;
import byui.cit260.shadowOfTheCabbage.model.Player;
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
