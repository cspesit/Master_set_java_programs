/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tempconversion;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class TempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double celsius = Double.parseDouble(JOptionPane
                .showInputDialog("Enter Temperature in Celsius"));
        double farenheit = giveMeFarenheit(celsius);
        
        for(double i=-100.0; i<=100.0;i++)
        {
            farenheit = giveMeFarenheit(i);
            System.out.println(i + ","+ farenheit);
        }
        
        
    }

    private static double giveMeFarenheit(double celsius) {
       
        return (9.0/5.0)*celsius + 32.0;
    }
    
}
