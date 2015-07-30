/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodimensionalarray;

import java.util.Random;

/**
 *
 * @author vijay.dontharaju
 */
public class TwoDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[][] twoDArray = {{1,2,3,4},
                              {5,6,7,8}, 
                              {9,10,11,12},
                              {13,14,15,16}};
        
       
        int rows = 4;
        int cols = 4;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(twoDArray[i][j] + ",");
            }
            System.out.print("\n");
        }
       
        
        
        
    }
    
}
