/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.view;

import byui.cit260.shadowOfTheCabbage.control.MoveControl;
import byui.cit260.shadowOfTheCabbage.exceptions.MoveControlException;
import byui.cit260.shadowOfTheCabbage.model.BossScene;
import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.model.PuzzleScene;
import byui.cit260.shadowOfTheCabbage.model.RegularScene;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class MoveView extends View {

    public MoveView() {
        super("\nEnter direction (North, South, East, or West)");
    }
    
    @Override
    public boolean doAction(String direction) {
        Location location = ShadowOfTheCabbage.getCurrentGame().getCurrentLocation();
        try {
            Location newLocation = MoveControl.moveDirection(direction, location);
            ShadowOfTheCabbage.getCurrentGame().setCurrentLocation(newLocation);
            this.console.println("\nyou moved to the next area");
            // get the scene from the newLocation.
            RegularScene scene = newLocation.getScene();
            scene.getView().display();
            // If scene type is RegularScene
           
        } catch (MoveControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
        return false;
    }
    
    
}
