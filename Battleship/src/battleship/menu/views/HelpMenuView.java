package battleship.menu.views;

import battleship.BattleshipError;
import battleship.menu.controls.HelpMenuControl;
import java.util.Scanner;
import battleship.interfaces.EnterInfo;

/**
 *
 * @author ckcarroll
 */
public class HelpMenuView extends Menu implements EnterInfo{
    
    public static final String INSTRUCTIONS = "INSTRUCTIONS";
    public static final String COMPUTER_PLAYER = "COMPUTER_PLAYER";
    public static final String GAME_OBJECTIVES = "GAME_OBJECTIVES";
    public static final String LOCATION = "LOCATION";
    public static final String MARKER = "MARKER";
    public static final String PEOPLE_PLAYER = "PEOPLE_PLAYER";
    
     private final static String[][] menuItems = {
        {"I", "Instructions"},
        {"C", "Computer player"}, 
        {"O", "Battleship Objectives"},
        {"L", "Locations"},
        {"B", "Boats"},
        {"P", "People players"},        
        {"Q", "Quit Help"}        
    };
    
   
    //private final HelpMenuControl helpMenuControl = new HelpMenuControl();
    

    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    } 
    
@Override
    public String getInput(Object object) {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); 
            
           
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "I":
                    this.displayHelp(HelpMenuView.INSTRUCTIONS);
                    break;
                case "C":
                    this.displayHelp(HelpMenuView.COMPUTER_PLAYER);
                    break;
                case "O":
                    this.displayHelp(HelpMenuView.GAME_OBJECTIVES);
                    break;                  
                case "L":
                    this.displayHelp(HelpMenuView.LOCATION);
                    break;
                case "M":
                    this.displayHelp(HelpMenuView.MARKER);
                    break;
                case "P":
                    this.displayHelp(HelpMenuView.PEOPLE_PLAYER);
                    break; 
                case "Q": 
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                    
            }
        } while (!command.equals("Q"));  
        
       return command;
    }

    // displays the help menu
    private void displayHelp(String helpType) {
        
        String helpText = null;
        
        switch (helpType) {
            case HelpMenuView.INSTRUCTIONS: helpText = 
                "\tBattleship has a grid of 30x30, 20x20, or 10x10 "
                + "\nYou will guess the position of your opponents ship by  "
                + "\nclicking on one square on the grid. When you have hit "
		+ "\nand sunk all of your opponents ships, then you will "
		+ "\nwon the game. However, if your opponent sinks all of your"
		+ "\nships, then you will have lost. "
                + "\n\t УДАЧИ!";
                break;
                
            case HelpMenuView.COMPUTER_PLAYER: helpText = 
                "\tA computer based player automatically takes its turn "
                + "\n\timmediately after a real player in a single player game.";
                break;
                
            case HelpMenuView.GAME_OBJECTIVES: helpText = 
                "\t The objective is to sink your opponents battleship before "
                + "\n\t they lay waste to your fleet."
		+ "\n"
		+ "\n\t If you are experiencing difficulty running the "
		+ "\ngame, then restart the game or refer to the manual."
                + "\n\t ОГОНЬ! ";
                break;
                
            case HelpMenuView.LOCATION: helpText = 
                "\tA location on the board where a player can place their marker"
		+ "\nor where he or she has placed their ships.";
                break;
                
            case HelpMenuView.MARKER: helpText = 
                "\tA white square shows a miss. A red square shows a hit. "
                + "\n\tThere will be no markers where there hasn't been a hit or miss\".";
                break;
            
            case HelpMenuView.PEOPLE_PLAYER: helpText = 
                "\tA real player manually guesses the ship's position by cliking "
                + "\n\t in the desired area.";
                break;
        }
        System.out.println("\n\t===============================================================");
        //System.out.println("\tEnter the letter associated with one of the following commands:");

        //for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            //System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        //}
        
        System.out.println(helpText);
        System.out.println("\t===============================================================\n");
    }
  
}
