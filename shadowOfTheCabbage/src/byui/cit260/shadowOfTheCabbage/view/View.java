/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = ShadowOfTheCabbage.getInfile();
    protected final PrintWriter console = ShadowOfTheCabbage.getOutfile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        do {

            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);

        } while (!done);
    }

    @Override
    public String getInput() {
        
        String value = null; // value to be returned
        boolean valid = false; // initialize to not value
        try {
        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + this.displayMessage);

            value = this.keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trail blanks

            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }

            break; // end the loop
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return value;
    }
}
