/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

/**
 *
 * @author heapc_000
 */
public class ForestBossView extends View{

    public ForestBossView() {
            super("\nThis is where you will fight a forest critter"
                + "\nenter move to change scenes");
        
    }

    

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "MOVE": 
                this.displayMoveView();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
         private void displayMoveView() {
            MoveView move = new MoveView();
            move.display();
        }
    
    
    
}
