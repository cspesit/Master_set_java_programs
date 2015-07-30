/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayreversalusingmethod;

import java.util.Random;

/**
 *
 * @author vijay.dontharaju
 */
public class ArrayReversalUsingMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] intArray  = new int[10];
       Random randInst = new Random();
       for(int i=0;i<intArray.length;i++)
       {
           intArray[i] = randInst.nextInt(100);
       }
       
       int[] reversedArray = reverseMyArray(intArray);
       
       for(int i=0;i<intArray.length;i++)
       {
           System.out.println(intArray[i] + "," + reversedArray[i]);
       }
        
    }

    private static int[] reverseMyArray(int[] intArray) {
      
        int[] reversedArray = new int[10];
        for(int i= intArray.length-1;i>=0;i--)
        {
            reversedArray[intArray.length-1-i] = intArray[i];
        }
        
        return reversedArray;
    }
    
}
