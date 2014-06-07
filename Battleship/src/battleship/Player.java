package battleship;
public class Player {

private String name; 
private int highScore; 
private double averagewins; 
   
   public Player(){
       name = "Skipper";
              
   }
   
   public String getName(){
       return name;
       
   }
   
   public void setName(String s){
       name = s; 
       
   }
   
   public class PlayerComp{
   private String name; 
   private int highScore; 
   private double averagewins; 
   
   
   public PlayerComp(){
       name = "Admiral";
              
   }
   
   public String getName(){
       return name;
       
   }
   
   public void setName(String s){
       name = s; 
       
   }
      
    public boolean startGuess(boolean hit, boolean miss, boolean shot){
       
       shot = true;
       hit = true;
       miss = false;
       
      int up = 0;
      int down = 0; 
      int right = 0;
      int left = 0;
      
       if (shot = hit){
           up++;
           if (shot = miss){
               down++;
           }
           else{
               hit=miss;
               System.out.println("Battleship Sunk\n Ты Лучшее");
           }
       }
       if (shot = hit){
           right++;
      
           if (hit=miss){
               left++;
           }
           
           else{
               hit=miss;
               System.out.println("Battleship Sunk\n Ты Лучшее");
           }    
       }
       if (shot = hit){
           down++;
           
           if (hit=miss){
               up++;
           }
           else{
               hit=miss;
               System.out.println("Battleship Sunk\n Ты Лучшее");
           }
       }
       if (shot = hit){
           left++;
           
           if(hit=miss){
               right++;
           }
           else{
               hit=miss;
               System.out.println("Battleship Sunk\n Ты Лучшее");
           }
           
       if (shot = miss){
          Math.random();
          
       }
       }
       
        return miss;
       
   }    
   
}
 /**
     *
     * @param moves
     */
    int [] moves = {20, 17, 30, 35, 18, 40};
   
    public static void SortScores ( int[] moves )
{
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
}
    
    public static void AverageMoves(int [] moves) {
        int sum = 0;
        int average;
        for (int x : moves)
            sum += x;
        average = sum / moves.length;
        System.out.println("You average score is " + average);
    }
    
    // Still working on this part. Bear with me. -Lloyd
    // Yay, I think it's working now!! :D
    public static void MaxScore(int[] moves) {
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
    }
}
