/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filesproject2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author vijay.dontharaju
 */
public class FilesProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter fileWriter = 
                new PrintWriter("D:/test/testfile.txt");
        
        for (int i = 1;i<=100;i++)
        {
            if((i>=50 && i<=60) || (i>=70 && i<=80))
            {
                fileWriter.println(i);
            }
        }
        fileWriter.close();
        
    }
    
}
