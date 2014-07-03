package battleship;

/* @author lloydab
 */
public enum BoatNames {
    ROWBOAT(1),
    SLOOP(2),
    DESTROYER(3),
    BATTLESHIP(4),
    CARRIER(5);
    
    private int length;
    BoatNames(int l){
        length = l;
    }
    
    int getLength(){
        return length;
    }
    
}
