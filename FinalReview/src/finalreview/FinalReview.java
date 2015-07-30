/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalreview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author vijay.dontharaju
 */
public class FinalReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
        // 1) How to read data from a file
        // Create a file instance first
        // Use Scanner class with the file instance
        // start looping through till the end
        
        File fileInst  = new File("c:/test.txt");
        Scanner scannerInst = new Scanner(fileInst);
        while(scannerInst.hasNext())
        {
            scannerInst.next();
        }
        
        /// 2) How to write into a file
        /// User printwriter class which is similar to 
        /// system.out.println
        //// ****Make sure you close the printwriter!!!!!*****
        PrintWriter pw = new PrintWriter("c/test.txt");
        pw.append("something");
        pw.append("something2");
        ///********CLOSE**********//
        pw.close();
        ///********PLSSSSSS CLOSE**********//
        /// 3) How to create an array
        /// double array example
        double[] doubleArr = new double[10];
        /// String array example
        String[] strArr = new String[10];
        //// how to hard code elements into an array
        String[] strArr2 = {"something", "something2"};
        
        /// 4) How to loop through and read elements of an array
        /// double array example
        /// **** Always remeber that arrays start with 0 ***//
        for(int i=0;i< doubleArr.length;i++)
        {
            System.out.println(doubleArr[i]);
        }
        /// 5) & 6) How to create a method
        //// Before you create a method think about a few things
        //// what does your method takes as input?
        //// What does your method do - Implementation
        //// What does your method return back?
        /// pretend that the method exists and do a method call
        /// Take the help of compiler to create the method
        /// a method should have declaration and definition
        double testVar = 89;
        double squareOfNum = calculateSquare(testVar);
        
        /// 7) How to pass an array to a method
        /// create an array
        int[] intArr = new int[10];
        double average =  calculateAverage(intArr);
        
        // *** Please make
         //// sure you understand how to sort an array****//
        
        String oneVar = "something";
        String secondVar = "xyz";
        
        if(oneVar.compareTo(secondVar) < 0)
        {
            System.out.println("Less than");
        }
        if(oneVar.compareTo(secondVar) > 0)
        {
            System.out.println("Greater than");
        }
        if(oneVar.compareTo(secondVar) == 0)
        {
            System.out.println("Equals");
        }
         
        
        
    }

    private static double calculateSquare(double testVar) {
        
        return testVar*testVar;
    }

    private static double calculateAverage(int[] intArr) {
        
       /// Implement the logic to calculate average
        ///and return back
        
        return 0;
    }
    
}
