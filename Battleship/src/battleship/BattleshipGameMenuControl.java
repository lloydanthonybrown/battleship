package battleship;

/* @author lloydab
 */
public class BattleshipGameMenuControl {
    private boolean isWinner() {

        // Location[][] locations = this.board.boardLocations;

        // for every row in the table
        for (int row = 0; row < locations.length; row++) {
            
            // get the list of locations (columns) in the row
            Location[] rowLocations = locations[row];
            
            // for every column in the row
            for (int col = 0; col < rowLocations.length; col++) {
                
                // three of the same players markers in a row?
                if (threeInARow(row, col, locations)) { 
                    return true; // three in a row found (a winner)
                }
            }
        }
    }
}