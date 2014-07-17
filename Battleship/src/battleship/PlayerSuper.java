package battleship;

import java.util.Scanner;

/**
 *
 * @author ckcarroll
 */
public abstract class PlayerSuper{
    
    public void PlayerSuper(){
        
    }
   
        
        
    
    
    public  String  playerWel(){
	System.out.println("Welcome Player");
	return null;
    }
    public final void display(){
	System.out.println("\t гггггггггггггггггггггггггггггггггггггггггггггггггггг");
	System.out.println();
	System.out.println("\t гггггггггггггггггггггггггггггггггггггггггггггггггггг");
    }

    /**
     *
     */
    public void playerName(){
        
       
       Scanner name;
        name = new Scanner(System.in);
                    
    }
    
     int [] moves = {20, 17, 30, 35, 18, 40};
   
    public double SortScores ( int[] moves ){
     int i, m, first, temp;
        
        for(i = moves.length - 1; i > 0; i--) {
            first = 0;
            for(m = 1; m <= i; m++) {
                if (moves[m] > moves[first])
                    first = m;
            }
             temp = moves[ first ];   //swap smallest found with element in position i.
            moves[ first ] = moves[ i ];
            moves[ i ] = temp;
            
            }
        System.out.print("Sorted array is:");
        int a;    
        for (a = 0; a< moves.length; a++)
                System.out.print(" " + moves[a]);
            System.out.println();
        return a;
}
    
    public double PlayerSuper(int [] moves) {
        int sum = 0;
        int average;
        for (int x : moves)
            sum += x;
        average = sum / moves.length;
        System.out.println("You average score is " + average);
        return average;
    }
    
    // Still working on this part. Bear with me. -Lloyd
    // Yay, I think it's working now!! :D
    public double MaxScore(int[] moves) {
        int max = 0;
        for (int i : moves){
            if (moves[i] > max)
                max = moves[i];
                }
        System.out.println("Your max score is " + max);
        
        // This was what I had to start, but that was before I used the for-each.
        // Probably don't need this section any more :( 
        /* for ( i = 0; i <= moves.length; i++){
            max = moves[i];
            if (moves[i] > max){
                max = moves[i];
            }
        } */
        return max;
    }
    
}
