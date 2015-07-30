/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradecalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author vijay.dontharaju
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // creating a array to hold the values
        double[] testScores = new double[5];
       // pumping in the values
        
        for(int i=0;i<testScores.length;i++)
        {
            testScores[i] = Double.
                    parseDouble(JOptionPane.
                            showInputDialog("Enter Test "
                                    + "Score " + i));
        }
        double average = calculateAverage(testScores);
        String letterGrade = calculateLetterGrade(average);
        JOptionPane.showMessageDialog(null,
                "Your grade is " + letterGrade);
        
    }
    private static double calculateAverage(double[] testScores) {
        double sum =0;
        for(int i=0;i<testScores.length;i++)
        {
            sum = sum + testScores[i];
        }
       return sum/testScores.length;
    }

    private static String calculateLetterGrade(double average) {
        if(average>= 90 && average <=100){return "A"; }
        else if(average >= 80 && average <=89){return "B";}
        else if(average >= 70 && average <= 79){return "C";}
        else if(average >= 60 && average <= 69){return "D";}
        else if(average <= 59){return "F";}
        else{return "No Grade";}
         
    }
    
}
