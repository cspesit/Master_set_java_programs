/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pyramidexample1;

/**
 *
 * @author vijay.dontharaju
 */
public class PyramidExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  *
      //  **
      //  ***
      //  ****
        
        int numOfRows = 10;
        
        for(int i=1;i<=10;i++) // vertical 
        {
            for(int j=1;j<=i;j++) // horizontally
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
                
                
             
    }
    
}
