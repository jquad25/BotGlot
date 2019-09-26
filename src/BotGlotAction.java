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

public class BotGlotAction {
    //Create bot name
    public static final String USER_NAME_BOT = "BotGlot";
    Twitter twitter;
    long lastSTatusTime;
    ArrayList<Status> tweetAlreadyused; //need this?
    ArrayList<Status> tweets;

    //Account settings - see other class


    //Need to search for desired users

    //Need to to follow desired users
    getId(); //long
    getName(); //String
    getScreenName(); //String
    createFriendship(java.lang.String screenName, boolean follow)
    isFollowing(); //boolean
    isFollowedBy(); //boolean


    //Need to retweet content of desired users into bot's TL
    /*
    from PJF16's twitterbot code - need to review and change


        //Works but tries to retweet some Tweets twice. Checking...

    public void searchTweetandRetweet(String hashtag) { //instead of String hashtag need String username?
        Query query = new Query(hashtag);
        query.count(40);
        int check = 0;
        int alreadyused = 0;
        int remove = 0;

        try {
            QueryResult queryresult = this.twitter.search(query);
            this.tweets = (ArrayList<Status>) queryresult.getTweets();
            Collections.reverse(tweets);
            for (Status status : tweets) {
                if (!status.isRetweetedByMe() && status.getCreatedAt().getTime() > this.lastStatusTime) {
                    try {
                        this.retweetTweet(status);
                        this.lastStatusTime = status.getCreatedAt().getTime();
                        this.writeTimeToFile();
                        Thread.sleep(10000);
                    } catch (TwitterException tex) {
                        System.out.println("Twitter Exception - Already Retweeted");
                    }
                }
            }
        } catch (TwitterException ex) {
            Logger.getLogger(TwitterActions.class.getName()).log(Level.SEVERE, null, ex);

        } catch (InterruptedException ex) {
            Logger.getLogger(TwitterActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void retweetTweet(Status status) throws TwitterException {
        this.twitter.retweetStatus(status.getId());
    }

    private long lastRetweetFromFile() {
        long lastretweet = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("time.dat"));
            lastretweet = Long.parseLong(br.readLine());
        } catch (FileNotFoundException ex) {
            lastretweet = new Date().getTime();
            try {
                PrintWriter pw = new PrintWriter("time.dat");
                pw.print(new Date().getTime());
                pw.close();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(TwitterActions.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            lastretweet = new Date().getTime();
            try {
                PrintWriter pw = new PrintWriter("time.dat");
                pw.print(new Date().getTime());
                pw.close();
            } catch (FileNotFoundException ex1) {
                Logger.getLogger(TwitterActions.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        return lastretweet;

    }




     */
}
