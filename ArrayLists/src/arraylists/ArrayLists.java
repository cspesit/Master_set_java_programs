/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vijay.dontharaju
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String> arrayListInst = new ArrayList<String>();
        arrayListInst.add("Something1");
        arrayListInst.add("Something2");
        arrayListInst.add("Something3");
        
        //iterate and print the elements of an arraylist
        
        for(String element: arrayListInst)
        {
            System.out.println(element);
        }
//        for(int i=0;i<arrayListInst.size(); i++)
//        {
//            System.out.println(arrayListInst.get(i));
//        }
        
        arrayListInst.remove(2);
         for(String element: arrayListInst)
        {
            System.out.println(element);
        }
         
         List<Integer> intArrayList = new ArrayList<Integer>();
         intArrayList.add(42);
         
        
    }
    
    
    
}
