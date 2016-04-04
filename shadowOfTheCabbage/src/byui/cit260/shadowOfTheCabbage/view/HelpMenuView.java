/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.GameControl;
import byui.cit260.shadowOfTheCabbage.control.ItemSortControl;
import byui.cit260.shadowOfTheCabbage.control.MaxStrengthControl;
import byui.cit260.shadowOfTheCabbage.model.Item;
import byui.cit260.shadowOfTheCabbage.model.Monster;
import java.io.PrintWriter;
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
                + "\nQ - Back (Main Menu)"
                + "\nP - Print Monster Information"
                + "\nMP - Print Monster Information To Document");
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
            case "P":
                this.displayStrengthStats(this.console);
                break;
            case "MP":
                this.printStats();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayActionMenu() {
        ActionMenuView actionMenu = new ActionMenuView();
        actionMenu.display();
    }

    private void displayCabbage() {
        this.console.println("        .-~~~~-.\n"
                + "       /  ( ( ' \\\n"
                + "      | ( )   )  |\n"
                + "      \\ ) ' }  / /\n"
                + "      (` \\ , /  ~)\n"
                + "       `-.`\\/_.-'\n"
                + "          `\"\"");
    }

    private void displayInventory() {
        this.console.println("*** displayInventory function Called ***");
    }

    private void displayTrophyMenu() {
        TrophyMenuView trophyMenu = new TrophyMenuView();
        trophyMenu.display();
    }

    private void displayStrength() {
        MaxStrengthControl maxStrength = new MaxStrengthControl();
        int maxStr = maxStrength.calcMaxStrength();
        this.console.println(maxStr);
    }

    private void printStats() {
        StrengthListView strength = new StrengthListView();
        strength.display();
    }
    
    
    public static void displayStrengthStats(PrintWriter outFile) {
        Monster[] monsters = Monster.values();

        outFile.println("\n\n     Monster List             ");
        outFile.printf("%n%-15s%-20s%-50s", "Name", "Monster Type", "Strength Points");
        outFile.printf("%n%-15s%-20s%-50s", "----", "------------", "---------------");

        for (Monster monster : monsters) {
            outFile.printf("%n%-15s%-20s%-50s", monster.getMonsterName(), monster.getMonsterType(), monster.getStr());

        }
        outFile.flush();

    }
}
