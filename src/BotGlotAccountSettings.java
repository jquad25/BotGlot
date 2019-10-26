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
import twitter4j.*;

/**
 *
 * @author Ursula Jordan Aquadro
 */


public class BotGlotAccountSettings extends AccountSettings {

    BotGlotAccountSettings  twitterSettings = new BotGlotAccountSettings();

    //Twitter UI language for user - English (US)
    twitterSettings.getLanguage(en);

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
