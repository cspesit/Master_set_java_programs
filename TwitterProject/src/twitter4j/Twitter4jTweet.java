/*
 * Mehrab Rahman
 * COSC 1436
 * Fall 2014
 */
package twitter4j;

import twitter4j.auth.AccessToken;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mehrab
 */
public class Twitter4jTweet {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws IOException, TwitterException {
        String consumerKey = "";
        String consumerSecret = "";
        String accessToken = "";
        String accessTokenSecret = "";
        
        TwitterFactory twitterFactory = new TwitterFactory();
        Twitter twitter = twitterFactory.getInstance();
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));
        StatusUpdate statusUpdate = new StatusUpdate(JOptionPane.showInputDialog("Tweet:"));
        Status status = twitter.updateStatus(statusUpdate);
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
    }
}
