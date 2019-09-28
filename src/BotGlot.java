import java.util.logging.Level; //is this needed for mine?
import java.util.logging.Logger; //is this needed for mine?
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.IDs;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


/**
 *
 * @author Ursula Jordan Aquadro
 */



public class BotGlot {

    /**
     * @param args creates the actions object
     */

    //Create main method to run actions w/ action object
    public static void main(String[] args) {
        TwitterActions actions = new TwitterActions ();

        /*
        is any of this needed?
        //call your function here. example:

        int i=1;
        while (i>0){
            actions.searchTweetandRetweet("#austria");
            try {
                Thread.sleep (300000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TwitterBot.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
*/
    }







}
