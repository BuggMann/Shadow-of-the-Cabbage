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
public class TowerView extends View{

    public TowerView() {
                super("\nYou have arrived at the towerof doom that houses your lady love."
                    + "\nEnter move then go south to climb the tower");
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
