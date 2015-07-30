/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodsproject;

/**
 *
 * @author vijay.dontharaju
 */
public class MethodsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 5;
        int j = 6;
        
        int sum = sumOfNumbers(5,6);
        int product = prodOfNumbers(5,6);
        int max = getMeTheMax(5,6);
        System.out.println("sum of numbers = " + sum);
        System.out.println("sum of numbers = " + sumOfNumbers(5,6));
        
    } // end main

    private static int sumOfNumbers(int i, int j) {
         
        int sum = i + j;
   
        return sum;
    }  // end sumOfNumbers Method

    private static int prodOfNumbers(int i, int j) {
        
        int product  = i * j;
        return product;
    }

    private static int getMeTheMax(int i, int j) {
       
        if (i>j)
        {
            return i;
        }
        else
        {
            return j;
        }
    }
    
} // end of Class
