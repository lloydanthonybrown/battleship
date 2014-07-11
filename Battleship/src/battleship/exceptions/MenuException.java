package battleship.exceptions;

/* @author lloydab
 */

// This class is for dealing with all user errors in Battleship menu classes.
public class MenuException extends Exception {
    
    public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    }
    
    
}
