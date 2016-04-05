/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.ItemSortControl;
import byui.cit260.shadowOfTheCabbage.control.MapControl;
import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Item;
import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.Map;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author Scott
 */
public class ActionMenuView extends View {

    public ActionMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n|           Action Menu              |"
                + "\n-------------------------------------"
                + "\nM - Displays map"
                + "\nLook - Get a description of the current environment"
                + "\nOpen - Opens items that are not locked"
                + "\nUse - Use item already in inventory"
                + "\nSave - Save game at current location"
                + "\nI - Display inventory"
                + "\nIP - Print Inventory"
                + "\nQ - Go Back (Help Menu)"
                + "\nF - first view");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "M":
                this.displayMap();
                break;
            case "LOOK":
                this.look();
                break;
            case "OPEN":
                this.open();
                break;
            case "USE":
                this.use();
                break;
            case "SAVE":
                this.save();
                break;
            case "I":
                this.displayInventory(this.console);
                break;
            case "IP":
                this.displayPrintInventory();
                break;
            case "F":
                this.displayFirstView();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayMap() {
        Location[][] locations = ShadowOfTheCabbage.getCurrentGame().getMap().getLocations();
        String symbol;
        for (int i = 0; i < locations.length; i++) {
            this.console.println("\n--------------------------");
            for (int j = 0; j < locations[0].length; j++) {
                if (locations[i][j].isVisited()) {
                    symbol = locations[i][j].getScene().getMapSymbol();
                } else {
                    symbol = "??";
                }
                this.console.print("| " + symbol + " ");
            }
            this.console.print("|");
        }
        this.console.println("\n--------------------------");
    }

    private void look() {
        this.console.println("\n*** look() function called*** ");
    }

    private void open() {
        this.console.println("\n*** open() function called*** ");
    }

    private void use() {
        this.console.println("\n*** use() function called*** ");
    }

    private void save() {
        this.console.println("\n*** save() function called*** ");
    }

    public static void displayInventory(PrintWriter outFile) {
        Item[] items = Item.values();
        items = ItemSortControl.doSelectionSort(items);

        outFile.println("\n\n             Inventory List             ");
        outFile.printf("%n%-15s%-20s%-50s", "Name", "Item Type", "Description");
        outFile.printf("%n%-15s%-20s%-50s", "----", "---------", "-----------");

        for (Item item : items) {
            outFile.printf("%n%-15s%-20s%-50s", item.getName(), item.getItemType(), item.getDescription());

        }
        outFile.flush();

    }

    private void displayPrintInventory() {
        InventoryListView inventory = new InventoryListView();
        inventory.display();
    }
    
    private void displayFirstView() {
        FirstView first = new FirstView();
        first.display();
    }

}
