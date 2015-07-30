/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package retailcostcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class RetailCostCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double wholeSaleCost = Double.
                parseDouble(JOptionPane.
                        showInputDialog("Please "
                                + "enter wholesale Cost"));
        double markUpPercent = Double.
                parseDouble(JOptionPane.
                        showInputDialog
        ("Please enter mark up percentage"));
        
        double retailCost = calcualateRetailCost
        (wholeSaleCost, markUpPercent);
        
        JOptionPane.showMessageDialog(null,
                " Retail Cost = " + retailCost);;
        
        
        
    }

    private static double 
        calcualateRetailCost
        (double wholeSaleCost, double markUpPercent) {
             
            return wholeSaleCost + 
                    (wholeSaleCost * (markUpPercent/100));
    }
    
}
