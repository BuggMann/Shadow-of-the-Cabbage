/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

/**
 *
 * @author Scott
 */
class GameMenuView extends View{
     public GameMenuView(){
            super("\n"
              + "\n------------------------"
              + "\n| Game Menu            |"
              + "\n------------------------"
              + "\nN - New Game"
              + "\nL - Load Game"
              + "\nS - Save Game"
              + "\nH - Help Menu"
              + "\nC - Cylinder View"
              + "\nP - Puzzle View"
              + "\nQ - Quit");
    }

    @Override
    public boolean doAction(String value) {
       System.out.println("\n this is a stub");
       return false;
    }
    
}
