/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowofthecabbage;



import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Player;
import byui.cit260.shadowOfTheCabbage.view.StartProgramView;

/**
 *
 * @author Scott
 */
public class ShadowOfTheCabbage {

    private static Game currentGame;
    private static Player player = null;
    
    public static void main(String[] args) {
       
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }
            

    public static void setCurrentGame(Game currentGame) {
        ShadowOfTheCabbage.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ShadowOfTheCabbage.player = player;
    }
    
    
    
}
