package battleship;
import java.io.Serializable;

public class Boat implements Serializable{
    private int hitcheck;
    //added by ckcarroll
    
   public Boat(){
   }
    
    int rowBoat [] = new int [1];
    int Sloop [] = new int [2];
    int Destroyer [] = new int [4];
    int Carrier [] = new int [6];
    
    String model;
    int length;
        
    private int isSunk(){
        
        //check to see if ships are sunk
        //added by ckcarroll
        
        for (int hit = 0; rowBoat.length > hit; hit++){
            System.out.println("Row boat Sunk. I pitty the fool.");
            hitcheck+=hit;
        }
        
        for (int hit = 0; Sloop.length > hit; hit++){
            System.out.println("Sloop Sunk...nbd, just collateral, right?");
            hitcheck+=hit;
        }
        
        for (int hit = 0; Destroyer.length > hit; hit++){
            System.out.println("Destroyer Sunk. That was a hard one, "
                    + "\n\tmaybe next time don't just that away, m'kay?");
            hitcheck+=hit;
        }
        
        for (int hit = 0; Carrier.length > hit; hit++){
            System.out.println("Carrier Sunk. Seriously, dude?");
            hitcheck+=hit;
        }
        
        
     return hitcheck;
    }
    
    
}
