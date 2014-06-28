package battleship;
import java.io.Serializable;
/**
 *
 * @author C.K. Carroll
 */
public class Shot implements Serializable {
    private boolean hit;
    private boolean miss; 
   
    
    public void takeShot(){
        hit = true;
        miss = false;
        
        
        
    }
    
//default constructor
    public Shot() {
        
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public boolean isMiss() {
        return miss;
    }

    public void setMiss(boolean miss) {
        this.miss = miss;
    }
    
    
    

    

    
}   
    
