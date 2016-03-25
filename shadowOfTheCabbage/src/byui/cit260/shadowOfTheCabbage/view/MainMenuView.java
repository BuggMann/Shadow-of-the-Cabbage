/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.GameControl;
import byui.cit260.shadowOfTheCabbage.model.Item;
import java.awt.Choice;
import java.util.Scanner;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author Scott
 */
public class MainMenuView extends View {
   
        public MainMenuView(){
            super("\n"
              + "\n------------------------"
              + "\n| Main Menu            |"
              + "\n------------------------"
              + "\nN - New Game"
              + "\nL - Load Game"
              + "\nS - Save Game"
              + "\nH - Help Menu"
              + "\nI - Inventory"
              + "\nM - Map"
              + "\nC - Cylinder View"
              + "\nP - Puzzle View"
              + "\nF - Forest View"
              + "\nO - First View"
              + "\nQ - Quit");
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
            case "C":
                this.displayCylinderView();
                break;
            case "P":
                this.displayThrowPuzzleView();
                break;
            case "F":
                this.displayForestView();
                break;
            case "O":
                this.displayFirstView();
                break;
            case "I":
                this.displayInventory();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
       GameControl.createNewGame(ShadowOfTheCabbage.getPlayer()); 
       
       ActionMenuView actionMenu = new ActionMenuView();
       actionMenu.display();
    }

    private void loadGame() {
        this.console.println("\nSelect the game to be loaded");
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.display();
    }

    private void saveGame() {
        this.console.println("\nSelect the file where you want to save your game");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(ShadowOfTheCabbage.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenuView() {
       
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
    }

    private void displayCylinderView() {
        CylinderView volume = new CylinderView();
        volume.display();
    }
    
    private void displayThrowPuzzleView() {
        ThrowPuzzleView angle = new ThrowPuzzleView();
        angle.display();
    }
    
    private void displayForestView() {
        ForestView forest = new ForestView();
        forest.display();
    }

    private void displayFirstView() {
        FirstView first = new FirstView();
        first.display();
    }

    private void displayInventory() {
       Item[] items = Item.values();
        
        for (Item item: items){
            this.console.println(item.getName() + " - " + item.getDescription());
        }
    }
     
}
