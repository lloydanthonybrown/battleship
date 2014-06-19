package battleship;
import java.io.Serializable;

/* @author lloydab
 */

public class BattleshipLocation implements Serializable{
    private int row;
    private int column;
    private Player player;

    // Default constructor for the BattleshipLocation.java class.
    BattleshipLocation() {
    }
        
    public void occupyLocation(Player player) {
        this.player = player;
    }

    // Initialized constructor for the BattleshipLocation.java class.
    public BattleshipLocation(int row, int column, Player player) {
        this.row = row;
        this.column = column;
        this.player = player;
    }

    // Getters and Setters for the BattleshipLocation.java class
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
}
