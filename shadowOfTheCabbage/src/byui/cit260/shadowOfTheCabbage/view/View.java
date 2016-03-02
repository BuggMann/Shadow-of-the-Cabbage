/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import java.util.Scanner;

/**
 *
 * @author heapc_000
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

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
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = null; // value to be returned
        boolean valid = false; // initialize to not value

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trail blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break; // end the loop
        }
        return value;
    }
}
