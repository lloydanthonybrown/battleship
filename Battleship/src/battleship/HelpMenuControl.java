package battleship;


public class HelpMenuControl {
      public HelpMenuControl() {
        
    } 
      
      
    public void displayWelcomeHelp(){
	System.out.println();
	this.displayHelpBorder();
	System.out.println(
	"/tWelcome to the Battleship help menu! Please choose from "
		+ "the following"
		+ "options."
	);
    }  

    public void displayInsHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tBattleship has a grid of 30x30, 20x20, or 10x10 "
                + "\nYou will guess the position of your opponents ship by  "
                + "\nclicking on one square on the grid. When you have hit "
		+ "\nand sunk all of your opponents ships, then you will "
		+ "\nwon the game. However, if your opponent sinks all of your"
		+ "\nships, then you will have lost. "
                + "\n\t УДАЧИ!");
        displayHelpBorder();
    }
    
    
        
    public void displayObHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\t The objective is to sink your opponents battleship before "
                + "\n\t they lay waste to your fleet."
		+ "\n"
		+ "\n\t If you are experiencing difficulty running the "
		+ "\ngame, then restart the game or refer to the manual."
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
               "\tA location on the board where a player can place their marker"
		       + "\nor where he or she has placed their ships."
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
