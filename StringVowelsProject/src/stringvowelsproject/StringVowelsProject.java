/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringvowelsproject;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class StringVowelsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input = JOptionPane.
                showInputDialog("Please enter a String");
        
        int count = getMeCount(input);
        System.out.println("No. Of Vowels in " 
                + input + " = " + count);
        
        
    }

    private static int getMeCount(String input) {
           int count =0;
        for(int i=0;i<input.length();i++)
        {
           String tempStr = input.substring(i, i+1);
           if(tempStr.equalsIgnoreCase("A")||
                   tempStr.equalsIgnoreCase("E")||
                   tempStr.equalsIgnoreCase("I")||
                   tempStr.equalsIgnoreCase("O")||
                   tempStr.equalsIgnoreCase("U"))
           {
               count++;
           }
        }
        
        return count;
    }
    
}
