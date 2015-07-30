/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraymethod;

/**
 *
 * @author vijay.dontharaju
 */
public class ArrayMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] strArray = {"abcd", "xyz", "wggh", "cded"};
         String finalVal = concatenateAllValues(strArray);
         for(int k=0;k<strArray.length;k++)
         {
             System.out.println(strArray[k]);
         }
         
         System.out.println(finalVal);
        
        
        
    }

    private static String concatenateAllValues(String[] strArray) {
        
        String finalVal = "";
        
        for(int i=0;i< strArray.length;i++)
        {
            finalVal  = finalVal + strArray[i];
        }
        
        return finalVal;
    }
    
}
