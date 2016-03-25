/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import java.io.PrintWriter;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class ErrorView {
    private static final PrintWriter errorFile = ShadowOfTheCabbage.getOutfile();
    private static final PrintWriter logFile = ShadowOfTheCabbage.getLogfile();
    public static void display(String className, String errorMessage) {
        errorFile.println(
                        "---------------------------------------------"
                      + "\n- ERROR -" + errorMessage
                      + "\n--------------------------------------------");
        
            logFile.println(className + " - " + errorMessage);
    }
    
}
