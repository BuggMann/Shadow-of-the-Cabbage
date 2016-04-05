/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Scott
 */
public class StrengthListView extends View {

    public StrengthListView() {
        super("\n"
                + "Select the file where you want to save your Monster Statistics");
    }

    @Override
    public boolean doAction(String outputLocation) {
        //call function in ActionMenuView
        try {
            PrintWriter outFile = new PrintWriter(outputLocation);
            HelpMenuView.displayStrengthStats(outFile);
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        //print that file was printed succesfully
        this.console.println("Strength Statistics Printed");
        return true;
    }

}
