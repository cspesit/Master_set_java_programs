/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringtokenizerproject;

import java.util.StringTokenizer;

/**
 *
 * @author vijay.dontharaju
 */
public class StringTokenizerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inputString = "Jack In The Box";
        StringTokenizer st = new StringTokenizer(inputString);
        String inputString2 = "Jack,In,The,Box";
        StringTokenizer st2 = new 
                              StringTokenizer(inputString2, ",");
    
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        
        while(st2.hasMoreTokens())
        {
            System.out.println(st2.nextToken());
        }
        
    }
    
}
