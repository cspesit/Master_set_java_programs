/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package whileproject;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class WhileProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int x = 10;
//        
//        while (x > 0)
//        {
//            System.out.println(" Value of x = " +  x);
//            x--;
//        }
//        
//        int y = 1;
//        while (y <= 10)
//        {
//            System.out.println(y);
//            y++;
//        }
//        
//        int numberVar = 1;
//        while(numberVar <= 100)
//        {
//            if(numberVar % 2 == 0)
//            {
//                System.out.print(numberVar);
//                System.out.print(",");
//            }
//            numberVar++;
//        }
//        
        int numVar = 1;
        System.out.print("\n");
        while(numVar <= 100)
        {
            if((numVar % 8 == 0) || (numVar % 9 == 0) )
            {
                
                System.out.print(numVar);
                System.out.print(",");
            }
            numVar++;
        }
        /// end of 8 and 9 program
        
        // start of houston program
        // Take first time input
        String strCity = JOptionPane.
                showInputDialog("Enter a city");
        // check whether the user entered Houston in first go
        if(strCity.equalsIgnoreCase("Houston"))
        {
            // if Houston - show them the message below
            JOptionPane.showMessageDialog(null, "Yayyy!!");
        }
        // execute while loop as long as the city is not houston
        while(!strCity.equalsIgnoreCase("Houston"))
        {
            // ask user for input again
            strCity = JOptionPane.
                showInputDialog(strCity + 
                        " is not Cool Please enter something else");
            // while loop exits if the city if houston
        }
        // immediately after exit, show the message below
        JOptionPane.showMessageDialog(null, "Yayyy!!");
        
        
        
        
    } // end Main
    
} // end Class
