/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numbersearch;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class NumberSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arrayOfInteger = new int[10];
       Random randomInst = new Random();
       
       for(int i=0;i< arrayOfInteger.length;i++)
       {
           arrayOfInteger[i] = randomInst.nextInt(1000);
       }
       int searchKey = Integer.parseInt(JOptionPane
               .showInputDialog(" Enter a number to search"));
       boolean numberFound = false;
       for(int i =0;i< arrayOfInteger.length;i++)
       {
           if(searchKey == arrayOfInteger[i])
           {
               numberFound = true;
           }
       }
       
       if(numberFound)
       {
           JOptionPane.showMessageDialog(null, "Number Found !");
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Number Not Found");
       }
       
    }
    
}
