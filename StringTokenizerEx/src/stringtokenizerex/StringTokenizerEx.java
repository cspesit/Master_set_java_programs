/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringtokenizerex;

import java.util.StringTokenizer;

/**
 *
 * @author vijay.dontharaju
 */
public class StringTokenizerEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String inputStr = "Login,to,use,your,existing,HCC,card";
        
        StringTokenizer st = new StringTokenizer(inputStr, ",");
        int i=0;
        String[] strArray = new String[7];
        while(st.hasMoreTokens())
        {
            strArray[i] = st.nextToken();
            i++;
        }
         
        for( i=0;i<strArray.length;i++)
        {
            System.out.println(strArray[i].length());
        }
       
        
    }
    
}
