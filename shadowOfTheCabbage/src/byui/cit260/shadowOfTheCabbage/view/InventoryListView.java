/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import java.io.IOException;
import java.io.PrintWriter;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class InventoryListView extends View {

    public InventoryListView() {
                super("\n"
                    + "Select the file where you want to save your inventory list");
    }

    @Override
    public boolean doAction(String outputLocation) {
            //call function in ActionMenuView
            try { PrintWriter outFile = new PrintWriter(outputLocation);
                ActionMenuView.displayInventory(outFile);
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
                return false;
            }
       //print that file was printed succesfully
       this.console.println("Inventory List printed");
       return true;
    }
    
    
}
