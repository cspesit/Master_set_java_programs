/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forloopproject;

/**
 *
 * @author vijay.dontharaju
 */
public class ForLoopProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        for(int i = 1; i<= 10; i++)
//        {
//            System.out.println(i);
//        }
//        // same code with while
//        int i =1;
//        while(i <= 10)
//        {
//           System.out.println(i);
//           i++;
//        }
        
//        for (int k = 1; k <= 1000; k++)
//        {
//           
//           
//            if(Math.sqrt(k) % 5 == 0)
//            {
//                System.out.println(" number = " + 
//                        k + " Sqrt = " + Math.sqrt(k) );
//            }
//        }
        
        for(int i =1 ; i<=10;i++)
        {
            System.out.println( " x ="
                    + " "+ i + " xsquare+x+1 = " +
                    (i*i+i+1));
        }
        
        for (int j=1;j<= 100;j++)
        {
            if((j>=30) && (j<= 40) && (j%2 ==0))
            {
                System.out.println(j);
            }
        }
        // Nested for Loop
        
        for(int i =1 ;i <= 10;i++)
        {
            int sum =0;
            for(int j = i;j>=1; j--)
            {
                sum = sum +j;
            }
            System.out.println(i + "," + sum);
        }
        
    } // end Main
} //end Class
