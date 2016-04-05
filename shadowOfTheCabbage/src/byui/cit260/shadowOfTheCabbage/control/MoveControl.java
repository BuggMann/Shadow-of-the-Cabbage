/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.exceptions.MoveControlException;
import byui.cit260.shadowOfTheCabbage.model.Location;
import byui.cit260.shadowOfTheCabbage.view.ErrorView;
import java.awt.Point;
import shadowofthecabbage.ShadowOfTheCabbage;

/**
 *
 * @author heapc_000
 */
public class MoveControl {

    public static Location moveDirection(String direction, Location currentPosition) throws MoveControlException {
        if (direction == null) {
            throw new MoveControlException("\nInvalid direction");
        }
        if (currentPosition == null) {
            throw new MoveControlException("\nInvalid direction. current position unknown");
        }

        direction = direction.toUpperCase();
        int row;
        int column;
        switch (direction) {
            case "NORTH": //display action menu
                if (currentPosition.getRow() < 1) {
                    throw new MoveControlException("\nInvalid direction");
                }
                row = currentPosition.getRow() - 1;
                column = currentPosition.getColumn();
                break;
            case "SOUTH": //display cabbage
                if (currentPosition.getRow() > 3) {
                    throw new MoveControlException("\nInvalid direction");
                }
                row = currentPosition.getRow() + 1;
                column = currentPosition.getColumn();
                break;
            case "EAST": //display inventory
                if (currentPosition.getColumn() > 3) {
                    throw new MoveControlException("\nInvalid direction");
                }
                row = currentPosition.getRow();
                column = currentPosition.getColumn() + 1;
                break;
            case "WEST":
                if (currentPosition.getColumn() < 1) {
                    throw new MoveControlException("\nInvalid direction");
                }
                row = currentPosition.getRow();
                column = currentPosition.getColumn() - 1;
                break;
            default:
                throw new MoveControlException("\nNot a valid direction. Try again.");
        }
        Location newLocation = ShadowOfTheCabbage.getCurrentGame().getMap().getLocations()[row][column];
        ShadowOfTheCabbage.getCurrentGame().setCurrentLocation(newLocation);
        return newLocation;

    }
}
