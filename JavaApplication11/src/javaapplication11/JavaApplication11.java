/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

/**
 *
 * @author vijay.dontharaju
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // when i do this i know the elements before hand.
        int[] intArr = {2,45,63,232,-13,-214};
        for(int i = 0;i <= intArr.length-1;i++)
        {
            System.out.println(intArr[i]);
        }
        //Another way to create an array;
        int[] intArr2 = new int[100];
        for(int i= 1;i<=100;i++)
        {
            intArr2[i-1] = i;
        }
        
        for(int i=0;i< 100;i++)
        {
            if (intArr2[i] %2 == 0)
            {
                System.out.println(intArr2[i]);
            }
        }
    }
    
}
