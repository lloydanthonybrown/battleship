
package battleship;
import battleship.interfaces.TakeShot;
/**
 *
 * @author KamiAnne Dastrup
 */
public class ShotMiss extends Shot implements TakeShot{
    String shot;
    String hit;
    
    public void takeShot(){
        if (shot == hit)
            System.out.println("Shot missed!");
    }
    
    public void ShotMiss(){
    }
    
    public void MissMessage(){
        System.out.println("Miss! Better luck next turn.");
    }
}
