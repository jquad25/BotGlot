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
import java.lang.String;
import twitter4j.IDs;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;


public class BotGlotAccountSettings {

    //Do not allow DMs
    getAllowDmsFrom();

    //Twitter UI language for user - English (US)
    getLanguage();

    //screen name = BotGlot
    getScreenName();

    //get timezone
    getTimeZone();

    //is not discoverable by email - boolean
    isDiscoverableByEmail();

    //always access by http? - boolean
    isAlwaysUseHttp();

    //is not geo-enabled - boolean
    isGeoEnabled();

    //sleep time enabled? - boolean
    isSleepTimeEnabled();
}
