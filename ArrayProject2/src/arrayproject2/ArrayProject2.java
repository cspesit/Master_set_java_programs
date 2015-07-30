/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayproject2;

import java.util.Random;

/**
 *
 * @author vijay.dontharaju
 */
public class ArrayProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random randGen = new Random();
        int[] intArr = new int[10];
        
        for(int i=1;i<=10;i++)
        {
            intArr[i-1] = randGen.nextInt(100);
        }
        int sum =0;
        int min=0, max=0;
        for(int i=1;i<=10;i++)
        {
            sum = sum + intArr[i-1];
            if(i==1)
            {
                min = intArr[i-1];
                max = intArr[i-1];
            }
            
            if(intArr[i-1] < min)
            {
                min = intArr[i-1];
            }
            if(intArr[i-1] > max)
            {
                max = intArr[i-1];
            }
            
        }
        
        // static elements
        String[] strArr  = {"Something1",
                              "Something2","Something3"};
       // dynamic elements
        String[] strArr2 = new String[10];
        
        System.out.println(strArr[2]);
      
                
    }
    
}
