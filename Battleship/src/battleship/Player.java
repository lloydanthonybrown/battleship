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
     for ( i = 0; i < moves.length - 1; i++ )  
     {
          first = 0;   //initialize to subscript of first element
          for(m = 1; m < moves.length - 1; m++)   //locate smallest element between positions 1 and i.
          {
               if( moves[m] < moves[first] )         
                 first = m;
          }
          temp = moves[first];   //swap smallest found with element in position i.
          moves[first] = moves[i];
          moves[i] = temp;
      }
    
    for(int x : moves){
        System.out.print(x + " ");
    }
}
    
}
