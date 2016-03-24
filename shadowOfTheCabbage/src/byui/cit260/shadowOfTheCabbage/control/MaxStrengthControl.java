/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.model.Monster;

/**
 *
 * @author Scott
 */
public class MaxStrengthControl {

    public MaxStrengthControl() {
    }
    
    
 
    public int calcMaxStrength() {
        Monster[] monsters = Monster.values();
        int maxStr = monsters[0].getStr();
        for (Monster monster : monsters) {
            int str = monster.getStr();
            if (str > maxStr) {
                maxStr = str;
        
    }
            
} 
        return maxStr;
    }
}
