/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.control;

import byui.cit260.shadowOfTheCabbage.model.Item;

/**
 *
 * @author heapc_000
 */
public class ItemSortControl {
    public static Item[] doSelectionSort(Item[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                String firstName = arr[j].getName();
                String secondName = arr[index].getName();
                int result = firstName.compareTo(secondName);
                if (result < 0)
                    index = j;
            }
            Item smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
