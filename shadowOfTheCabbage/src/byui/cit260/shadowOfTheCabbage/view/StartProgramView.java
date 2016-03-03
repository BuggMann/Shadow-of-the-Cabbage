/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.GameControl;
import byui.cit260.shadowOfTheCabbage.model.Player;
import java.util.Scanner;

/**
 *
 * @author heapc_000
 */
public class StartProgramView extends View{
    
    public StartProgramView() {
        super("\nPlease enter your name: ");
        //display the banner when view is created 
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
            "\n********************************************"
           +"\n*     Welcome to Shadow of the Cabbage     *"
           +"\n* In this game you will create a character *"
           +"\n* and start an epic journey to find the    *"
           +"\n* love of your life. On your journey you   *"
           +"\n* have heard whisperings of a fair maiden  *"
           +"\n* trapped in a far off land, bound to her  *"
           +"\n* tower by the magic held by five massive  *"
           +"\n* monsters. After a thirty-seven day       *"
           +"\n* journey, you arrived at a large gateway, *"
           +"\n* the entrance to this mystical land.      *"
           +"\n*                                          *"
           +"\n* Do you have what it takes to find your   *"
           +"\n* eternal lady love?                       *"
           +"\n********************************************"
        );
    }

    @Override
    public boolean doAction(String playersName) {
       
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccesful
            System.out.println("\nError creating the player");
            return false;
        }
        
        this.displayNextView(player);
        
        return true; // success
    }

    private void displayNextView(Player player) {
       System.out.println("\n====================================="
                         + "\n Welcome to the game, " + player.getName() 
                         + "\n We hope you have a lot of fun!!"
                         + "\n====================================="
                         );
       
       MainMenuView mainMenuView = new MainMenuView();
               
       mainMenuView.display();
    }

    
}
