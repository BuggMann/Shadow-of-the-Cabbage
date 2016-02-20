/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.model.Player;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class GameControl {

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
