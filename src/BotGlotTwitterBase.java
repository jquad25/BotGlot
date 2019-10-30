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


public class BotGlotTwitterBase extends TwitterBase {

    BotGlotTwitterBase botBase = new BotGlotTwitterBase();

    //create bot's screen name
    String screenName = "BotGlot";
    botBase.getScreenName(screenName);

    //return authenticating user's user id
    //may interally call verifyCredentials() - look into this
    Long botglotUserId;

    //check TwitterBase interface for other needed methods

    /*getAuthorization() comes from Authorization which is an interface
    do I need to create a new class just for authorization?
     */

    /*getConfiguration() comes from the Configuration interface
    so same question - do I need to create a new class just for that?
    I'd like to have some subclasses in here that implement those interfaces
    instead of making separate classes for them
     */


}
