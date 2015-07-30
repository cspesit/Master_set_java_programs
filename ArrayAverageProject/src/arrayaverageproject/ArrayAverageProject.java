/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayaverageproject;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class ArrayAverageProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create an empty array
        int[] intArray = new int[10];
        // get the data from user
        for(int position = 0;position < intArray.length;position++)
        {
            intArray[position] = Integer.parseInt(JOptionPane.
                    showInputDialog(null,""
                            + " Please enter a number"
                            + " at position =" + position));
            
        }
        //calculate sum of all elements
        int sum =0;
        for(int position = 0;position < intArray.length;position++)
        {
            sum = sum + intArray[position];
        }
        double average = sum/intArray.length;
        JOptionPane.showMessageDialog(null, " Average= " 
                + average);
                
    
        
    }
    
}
