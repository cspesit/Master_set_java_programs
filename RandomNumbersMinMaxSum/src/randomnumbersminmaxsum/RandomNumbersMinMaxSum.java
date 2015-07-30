/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbersminmaxsum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vijay.dontharaju
 */
public class RandomNumbersMinMaxSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
         // Writing a file requires 
        // PrintWriter Class
        PrintWriter fileWriter = 
                new PrintWriter
        ("D:/test/testfile.txt");
        Random randomGenerator = new Random();
        
        for(int k=1;k<=10;k++)
        {
           fileWriter.
                   println
                    (randomGenerator.nextInt(1000));
        } // end for loop
        fileWriter.close();
        
         File fileReference = 
                new File("D:/test/testfile.txt");
        Scanner sFile = new Scanner(fileReference);
        int sum =0;
         int counter = 1;
         int max=0, min=0;
        while(sFile.hasNext())
        {
            
            String numberStr = sFile.nextLine();
            int number = Integer.parseInt(numberStr);
            if(counter == 1)
            {
                  max = number;
                  min = number;
                  counter++;
            }
            sum = sum + number;
            if(number>max)
            {
                max  = number;
            }
            if(number < min)
            {
                min = number;
                
            }
        }    
        
        System.out.println("Sum ="+ sum + "Min =" +min
        + "Max="+ max);
        
    }
    
}
