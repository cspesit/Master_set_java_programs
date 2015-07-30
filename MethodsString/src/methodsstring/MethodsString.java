/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodsstring;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class MethodsString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1 = 
                JOptionPane.showInputDialog("Enter String 1");
        String input2 = JOptionPane.
                showInputDialog("Enter String 2");
        
        String concatOutput  = joinStrings(input1,input2);
        
    }

    private static String joinStrings(String input1, String input2) {
        
        return input1 + input2;
    }
    
}
