/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.GameControl;
import java.awt.Choice;
import java.util.Scanner;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author Scott
 */
public class MainMenuView {
    private String menu;

    public MainMenuView() {
    this.menu = "\n"
              + "\n------------------------"
              + "\n| Main Menu            |"
              + "\n------------------------"
              + "\nN - New Game"
              + "\nL - Load Game"
              + "\nS - Save Game"
              + "\nH - Help Menu"
              + "\nP - Puzzle"
              + "\nQ - Quit";
    }
    public void displayMainMenuView() {
        
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
      String value = ""; // value to be returned
      boolean valid = false; // initialize to not value
      
      while (!valid) { // loop while an invalid value is entered
          System.out.println("\n" + this.menu);
          
          value = keyboard.nextLine(); // get next line typed on keyboard
          value = value.trim(); // trim off leading and trail blanks
          
          if (value.length() < 1) { // value is blank
              System.out.println("\nInvalid value: value can not be blank");
          }
          
          break; // end the loop
      }
      
      return value; // return the value entered
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "L":
                this.loadGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.displayHelpMenuView();
                break;
            case "P":
                this.displayThrowPuzzleView();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
       GameControl.createNewGame(ShadowOfTheCabbage.getPlayer()); 
       
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }

    private void loadGame() {
        System.out.println("*** loadGame function Called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function Called ***");
    }

    private void displayHelpMenuView() {
       
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.displayHelpMenuView();
    }

    private void displayThrowPuzzleView() {
       ThrowPuzzleView puzzleView = new ThrowPuzzleView();
       puzzleView.displayThrowPuzzleView();
    }

   
       
}
