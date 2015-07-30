/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringarraysproject;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class StringArraysProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /// Create 3 arrays with empty buckets
        String[] array1 = new String[5];
        String[] array2 = new String[5];
        String[] array3 = new String[5];
        //Take Inputs for Array1
        for(int i=0;i<array1.length;i++)
        {
            array1[i] = JOptionPane.
                    showInputDialog(null, "array 1 - Position - "
                           + i + "Please enter a String");
        }
        // Take Inputs for Array 2
        for(int i=0;i<array2.length;i++)
        {
            array2[i] = JOptionPane.
                    showInputDialog(null, "array 2 - Position - "
                           + i + "Please enter a String");
        }
        /// Concatenate and load into Array 3
        for(int i=0;i<array3.length;i++)
        {
            array3[i] = array1[i] + array2[i];
        }
        
    }
    
}
