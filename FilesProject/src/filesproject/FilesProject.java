/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filesproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author vijay.dontharaju
 */
public class FilesProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
        
        PrintWriter fileWriter = 
                new PrintWriter
        ("D:/test/testfile.txt");
        fileWriter.println(" Line 1");
        fileWriter.println(" Line 2");
        fileWriter.println(" Line 3");
        fileWriter.append("Line 4");
        fileWriter.println(2424);
        fileWriter.close();
        
        File fInstance = new 
                 File("D:/test/testfile.txt");
        Scanner fScanner = new Scanner(fInstance);
        
//        String fileLine = fScanner.nextLine();
//        System.out.println(fileLine);
//        String fileLine2 = fScanner.nextLine();
//        System.out.println(fileLine2);
        
        while(fScanner.hasNext())
        {
            String fileLine = fScanner.nextLine();
            System.out.println(fileLine);
        }
        
        
    }// end Main
    
} // end Class
