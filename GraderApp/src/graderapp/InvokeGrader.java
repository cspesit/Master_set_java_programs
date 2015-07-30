/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graderapp;

/**
 *
 * @author vijay.dontharaju
 */
public class InvokeGrader {
    
    public static void main(String args[])
    {
        double[] inputArray = new double[10];
        Grader graderInst = new Grader(inputArray);
        Grader graderInst2 = new Grader();
        graderInst2.setScores(inputArray);
        System.out.println("Lowest Score = "
                + graderInst.getLowScore());
        System.out.println("Highest Score = "
                + graderInst.getHighScore());
        System.out.println("Average Score = "
                + graderInst.getAvgScore());
    }
}
