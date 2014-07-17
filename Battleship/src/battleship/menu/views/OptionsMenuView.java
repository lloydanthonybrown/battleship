package battleship.menu.views;
import battleship.BattleshipError;
import battleship.interfaces.EnterInfo;
import battleship.menu.controls.OptionsMenuControl;
import java.util.Scanner;

/* @author lloydab
 */
public class OptionsMenuView extends Menu implements EnterInfo{
    
    public static final String DIFFICULTY = "DIFFICULTY";
    public static final String NUMBER_PLAYERS = "NUMBER_PLAYERS";
    public static final String PLAYER_OPTIONS = "PLAYER_OPTIONS";
    public static final String STATISTICS = "STATISTICS";
        
     private final static String[][] menuItems = {
        {"D", "Difficulty"},
        {"N", "Number of Players"}, 
        {"P", "Player Options'"},
        {"S", "Statistics"},
        {"Q", "Quit Help"}        
    };
   
    //private final OptionsMenuControl optionsMenuControl = new OptionsMenuControl();

    public OptionsMenuView() {
        super(OptionsMenuView.menuItems);
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
                case "D":
                    this.displayHelp(OptionsMenuView.DIFFICULTY);
                    break;
                case "N":
                    this.displayHelp(OptionsMenuView.NUMBER_PLAYERS);
                    break;
                case "P":
                    this.displayHelp(OptionsMenuView.PLAYER_OPTIONS);
                    break;                  
                case "S":
                    this.displayHelp(OptionsMenuView.STATISTICS);
                    break;
                case "Q":
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                    continue;
                                        
            }
        } while (!command.equals("Q"));  
       return command;
    }

        // displays the options menu
    private void displayHelp(String helpType) {
        
        String helpText = null;
        
        switch (helpType) {
            case OptionsMenuView.DIFFICULTY: helpText = 
                "\tBattleship has a grid of 10x10, 20x20, or 30x30 "
                + "\n\t Select Easy for 10x10.  "
                + "\n\t Select Medium for 20x20. "
                + "\n\t Select Hard for 30x30.";
                break;
                
            case OptionsMenuView.NUMBER_PLAYERS: helpText = 
                "\tSelect whether you want to play 1 player vs. the computer, . "
                + "\n\t or a 2 player game.";
                break;
                
            case OptionsMenuView.PLAYER_OPTIONS: helpText = 
                "\tWould you like to change the name of a player? ";
                break;
                
            case OptionsMenuView.STATISTICS: helpText = 
                "\tYour statistics show: "
                + "\n\t Winning Percentage"
                + "\n\t Total Games Played"
                + "\n\t High Score";
                break;
                
            }
        System.out.println("\n\t===============================================================");
        System.out.println(helpText);
        System.out.println("\t===============================================================\n");
    }
}
