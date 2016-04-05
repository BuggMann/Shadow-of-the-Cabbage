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
public class DesertBossView  extends View{

    public DesertBossView() {
                super("You are in a large desert, full of sand dunes. "
                    + "\nSuddenly the sand starts to move, and a large snakelike creature bursts out of the sand."
                    + "\nChoose your weapon and kill the snake!"
                    + "\nOr enter move to travel on");
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
