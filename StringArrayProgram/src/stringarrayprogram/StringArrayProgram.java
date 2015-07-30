/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringarrayprogram;

/**
 *
 * @author vijay.dontharaju
 */
public class StringArrayProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
        
        for(int i=0;i< planets.length;i++)
        {
            System.out.println(planets[i]);
        }
        
        for(int i=0;i< planets.length;i++)
        {
            char letter = planets[i].charAt(0);

            System.out.println (letter);
            System.out.println(planets[i].substring(0, 3));

      
        }

    }
    
}
