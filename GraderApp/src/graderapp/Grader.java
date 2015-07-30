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
public class Grader {

    double[] scores;

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }
    
    public Grader()
    {
        
    }
    public Grader(double[] scores)
    {
        this.scores = scores;
    }
    
    public double getLowScore()
    {
        
        return 0;
    }
    public double getHighScore()
    {
        
        return 0;
    }
    public double getAvgScore()
    {
        
        return 0;
    }
    
    
}
