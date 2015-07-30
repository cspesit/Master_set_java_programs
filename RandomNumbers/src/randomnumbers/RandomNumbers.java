/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbers;

import java.util.Random;

/**
 *
 * @author vijay.dontharaju
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random randNumbers = new Random();
        
        for(int i =1;i<=10;i++)
        {
            System.out.
                    println(randNumbers.nextInt(100));
            
            
        }
        
        
    } // end Main
    
}// end Class
