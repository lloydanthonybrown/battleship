package battleship.player;

import battleship.PlayerSuper;

/**
 *
 * @author ckcarroll
 */
public class PlayerArtSub extends PlayerSuper {
    
    public PlayerArtSub(){
        
    }
    
    public boolean ArtPlayer(){
        
        boolean shot, hit = false, miss = true; 
        
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
