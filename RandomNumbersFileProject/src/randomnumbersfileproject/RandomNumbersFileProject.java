/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomnumbersfileproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vijay.dontharaju
 */
public class RandomNumbersFileProject {

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
        
        for(int k=1;k<=100;k++)
        {
           fileWriter.
                   println
                    (randomGenerator.nextInt(1000));
        } // end for loop
        fileWriter.close();
        
        // Reading the file requires
        // File and Scanner Classes
        
        File fileReference = 
                new File("D:/test/testfile.txt");
        Scanner sFile = new Scanner(fileReference);
        
        while(sFile.hasNext())
        {
            String numberStr = sFile.nextLine();
            int number = Integer.parseInt(numberStr);
            if(number%2 == 0)
            {
                System.out.println(number);
            }
        }
        
        
        
    } // end Main
    
} // end Class
