package battleship;
import java.io.Serializable;

public class Boat implements Serializable{
    private int hitcheck;
    //added by ckcarroll
   
   // Default constructor for the Boat.java class 
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

    // Getters and setters for the Boat.java class.
    public int getHitcheck() {
        return hitcheck;
    }

    public void setHitcheck(int hitcheck) {
        this.hitcheck = hitcheck;
    }

    public int[] getRowBoat() {
        return rowBoat;
    }

    public void setRowBoat(int[] rowBoat) {
        this.rowBoat = rowBoat;
    }

    public int[] getSloop() {
        return Sloop;
    }

    public void setSloop(int[] Sloop) {
        this.Sloop = Sloop;
    }

    public int[] getDestroyer() {
        return Destroyer;
    }

    public void setDestroyer(int[] Destroyer) {
        this.Destroyer = Destroyer;
    }

    public int[] getCarrier() {
        return Carrier;
    }

    public void setCarrier(int[] Carrier) {
        this.Carrier = Carrier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
}
