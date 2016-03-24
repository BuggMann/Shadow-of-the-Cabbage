/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.GameControl;
import byui.cit260.shadowOfTheCabbage.control.MaxStrengthControl;
import byui.cit260.shadowOfTheCabbage.model.Monster;
import java.util.Scanner;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author Scott
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n------------------------"
                + "\n| Help Menu            |"
                + "\n------------------------"
                + "\nA - Action Menu"
                + "\nC - Displays A Cabbage"
                + "\nI - Displays Inventory"
                + "\nT - Displays Trophy Menu"
                + "\nS - Displays Strength of Strongest Monster"
                + "\nB - Back (Main Menu)");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "A": //display action menu
                this.displayActionMenu();
                break;
            case "C": //display cabbage
                this.displayCabbage();
                break;
            case "I": //display inventory
                this.displayInventory();
                break;
            case "T":
                this.displayTrophyMenu();
                break;
            case "S":
                this.displayStrength();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayActionMenu() {
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.display();
    }

    private void displayCabbage() {
        System.out.println("        .-~~~~-.\n"
                + "       /  ( ( ' \\\n"
                + "      | ( )   )  |\n"
                + "      \\ ) ' }  / /\n"
                + "      (` \\ , /  ~)\n"
                + "       `-.`\\/_.-'\n"
                + "          `\"\"");
    }

    private void displayInventory() {
        System.out.println("*** displayInventory function Called ***");
    }

    private void displayTrophyMenu() {
        TrophyMenuView trophyMenu = new TrophyMenuView();
        trophyMenu.display();
    }

    private void displayStrength() {
        MaxStrengthControl maxStrength = new MaxStrengthControl();
        int maxStr = maxStrength.calcMaxStrength();
        System.out.println(maxStr);
    }
}
