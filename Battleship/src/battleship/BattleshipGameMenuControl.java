package battleship;
import java.io.Serializable;

/* @author lloydab
 */

public class BattleshipGameMenuControl implements Serializable{

    public BattleshipGameMenuControl() {
    }
    /*private boolean isWinner() {

        // Location[][] locations = this.board.boardLocations;

        // for every row in the table
        count = 0;
        for (int row = 0; row < locations.length; row++) {
            
            // get the list of locations (columns) in the row
            Location[] rowLocations = locations[row];
            
            // for every column in the row
            for (int col = 0; col < rowLocations.length; col++) {
                
                // three of the same players markers in a row?
                if (shipSunk(row, col, locations)) { 
                    System.out.println("You have sunk an enemy ship!");
                    return true;
                    count++;
                }
            }
            
            if (count = 5) {
                System.out.println("All enemy ships are down. You are the winner!");
            }
        }
}
 private boolean isSunk(){
        
        //check to see if ships are sunk
        //added by ckcarroll
        
        for (int hitcheck = 0; rowBoat.length > hitcheck; hitcheck++){
            System.out.println("Row boat Sunk. I pitty the fool.");
        }
        
        for (int hitcheck = 0; Sloop.length > hitcheck; hitcheck++){
            System.out.println("Sloop Sunk...nbd, just collateral, right?");
        }
        
        for (int hitcheck = 0; Destroyer.length > hitcheck; hitcheck++){
            System.out.println("Destroyer Sunk. That was a hard one, "
                    + "\n\tmaybe next time don't just that away, m'kay?");
        }
        
        for (int hitcheck = 0; Carrier.length > hitcheck; hitcheck++){
            System.out.println("Carrier Sunk. Seriously, dude?");
        }
        
    }*/
    
    // Getters and Setters not available for this class yet.
}
