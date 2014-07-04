

package battleship;
import battleship.interfaces.TakeShot;
/**
 *
 * @author KamiAnne Dastrup
 */
public class ShotHit extends Shot implements TakeShot{
    
    String shot;
    String hit;
    
    public void takeShot(){
        if (shot == hit)
            System.out.println("You hit the opponent's ship!");
                
    }
    
    public void ShotHit(){
    }
    
    public void goAgain(){
        System.out.println("Ship hit! Go again.");
    }
}
