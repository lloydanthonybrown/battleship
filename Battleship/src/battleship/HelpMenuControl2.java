package battleship;


public class HelpMenuControl2 {
      public HelpMenuControl2() {
        
    } 

    public void displayGridHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tBattleship has a grid of 30x30 "
                + "\n\t You will guess the position of your opponents ship by  "
                + "\n\t clicking on one square on the grid. "
                + "\n\t УДАЧИ!");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\t The objective is to sink your opponents battleship before "
                + "\n\t they lay waste to your fleet. "
                + "\n\t ОГОНЬ! "
                ); 
        displayHelpBorder();
    }
            
    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA real player manually guesses the ship's position by cliking "
                + "\n\t in the desired area."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer based player automatically takes its turn "
                + "\n\timmediately after a real player in a single player game."
                ); 
        displayHelpBorder();
    }
             
    public void displayLocationHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA location on the board where a player can place their marker."
                ); 
        displayHelpBorder();
    }
                 
    public void displayMarkerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA white square shows a miss. A red square shows a hit. "
                + "\n\tThere will be no markers where there hasn't been a hit or miss\"."
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
