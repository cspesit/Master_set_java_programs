/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifcombination;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class IfCombination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Take first input
        String ageStr = JOptionPane.
                showInputDialog("Please enter your age");
        // convert the String age to integer
        int age = Integer.parseInt(ageStr);
        // Take second input
        String state = JOptionPane.
                showInputDialog("Please enter your state");
        // decide
        if( (age > 65) && (state.equalsIgnoreCase("Texas")))
        {
           JOptionPane.
                   showMessageDialog(null, "Eligible for"
                           + " the Fund");
        }
        else
        {
             JOptionPane.
                   showMessageDialog(null, " NOT Eligible for"
                           + " the Fund");
        }
    }
    
}
