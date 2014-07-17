package battleship.menu.views;
import battleship.BattleshipError;
import battleship.interfaces.EnterInfo;
import battleship.menu.controls.MainMenuControl;
import java.util.Scanner;

/**
 *
 * @author ckcarroll
 */
public class MainMenuView extends Menu implements EnterInfo{
    
    public static final String CONTROL = "CONTROL";
    public static final String VIEW = "VIEW";
    public static final String START_GAME = "START_GAME";
    public static final String RESUME = "RESUME";
    public static final String ADVANCED_OPTIONS = "ADVANCED_OPTIONS";
    
     private final static String[][] menuItems = {
        {"C", "Control"},
        {"V", "View"}, 
        {"S", "Start now"},
        {"R", "Resume"},
        {"Q", "Quit"},
        {"A", "Advanced Options"}        
    };
     
     public MainMenuView() {
        super(MainMenuView.menuItems);}
        
         
        
            
        
   
    //private final MainMenuControl mainMenuControl = new MainMenuControl();
    
   @Override
    public String getInput(Object object){

    
      
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); 
            
           
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "C":
                    this.displayHelp(MainMenuView.CONTROL);
                    break;
                case "V":
                    this.displayHelp(MainMenuView.VIEW);
                    break;
                case "R":
                    this.displayHelp(MainMenuView.RESUME);
                    break;
                case "Q":
                    break;
                case "A":
                  this.displayHelp(MainMenuView.ADVANCED_OPTIONS);
                     break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                  
            }
        } while (!command.equals("Q")); 
        return command;
    }

    // displays the main menu
    private void displayHelp(String helpType) {
        
        String helpText = null;
        
        switch (helpType) {
            case MainMenuView.CONTROL: helpText = 
                "\t Controls- well, you just click on the grid...thats really it...";
                break;
                
            case MainMenuView.VIEW: helpText = 
                "\t You can change the grid color to red, white, or blue.";
                break;
                
            case MainMenuView.START_GAME: helpText = 
                "\t Starting Game...";
                break;
                
            case MainMenuView.RESUME: helpText = 
                "\t Resume Game?";
                break;
                
            case MainMenuView.ADVANCED_OPTIONS: helpText = 
                "\t Advanced options"
                + "\n\t Player"
                + "\n\t Options"
                + "\n\t Statistics";
                break;
        }
        System.out.println("\n\t===============================================================");
        System.out.println(helpText);
        System.out.println("\t===============================================================\n");
    }
    
  
}
