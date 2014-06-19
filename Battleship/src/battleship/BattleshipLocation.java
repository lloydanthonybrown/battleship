package battleship;
import java.io.Serializable;

/* @author lloydab
 */

public class BattleshipLocation implements Serializable{
    public int row;
    public int column;
    public Player player;

    BattleshipLocation() {
    }
        
    public void occupyLocation(Player player) {
        this.player = player;
    }

    public BattleshipLocation(int row, int column, Player player) {
        this.row = row;
        this.column = column;
        this.player = player;
    }
    
    
}
