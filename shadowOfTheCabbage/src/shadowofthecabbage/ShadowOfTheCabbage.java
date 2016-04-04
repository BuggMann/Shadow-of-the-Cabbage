/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowofthecabbage;

import byui.cit260.shadowOfTheCabbage.model.Game;
import byui.cit260.shadowOfTheCabbage.model.Player;
import byui.cit260.shadowOfTheCabbage.view.ErrorView;
import byui.cit260.shadowOfTheCabbage.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Scott
 */
public class ShadowOfTheCabbage {

    private static Game currentGame;
    private static Player player = null;
    private static PrintWriter outfile = null;
    private static BufferedReader infile = null;
    private static PrintWriter logfile = null;

    public static void main(String[] args) {
        try {
            ShadowOfTheCabbage.infile
                    = new BufferedReader(new InputStreamReader(System.in));

            ShadowOfTheCabbage.outfile = new PrintWriter(System.out, true);

            String filePath = "log.text";
            ShadowOfTheCabbage.logfile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;

        } catch (Throwable te) {
            ErrorView.display("ShadowOfTheCabbage", "te.getMessage()");
            te.printStackTrace();
        } finally {
            try {
                if (ShadowOfTheCabbage.infile != null);
                ShadowOfTheCabbage.infile.close();

                if (ShadowOfTheCabbage.outfile != null);
                ShadowOfTheCabbage.outfile.close();

                if (ShadowOfTheCabbage.logfile != null);
                ShadowOfTheCabbage.logfile.close();
            } catch (IOException ex) {
                ErrorView.display("ShadowOfTheCabbage", "Error closing files");
                return;
            }

        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ShadowOfTheCabbage.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ShadowOfTheCabbage.player = player;
    }

    public static PrintWriter getOutfile() {
        return outfile;
    }

    public static void setOutfile(PrintWriter outfile) {
        ShadowOfTheCabbage.outfile = outfile;
    }

    public static BufferedReader getInfile() {
        return infile;
    }

    public static void setInfile(BufferedReader infile) {
        ShadowOfTheCabbage.infile = infile;
    }

    public static PrintWriter getLogfile() {
        return logfile;
    }

    public static void setLogfile(PrintWriter logfile) {
        ShadowOfTheCabbage.logfile = logfile;
    }

}
