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
public class LakesideView extends View{

    public LakesideView() {
                super("\nYoure on the edge of a beautiful lake"
                    + "\nEnter move to travel on");
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
