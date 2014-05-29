package battleship;
import java.util.Scanner;

/* @author lloydab
 */
public class OptionsMenuView {
    
     private final static String[][] menuItems = {
        {"G", "The Grid"},
        {"C", "Computer player"}, 
        {"P", "О Игре 'Battleship'"},
        {"L", "Locations"},
        {"M", "Markers"},
        {"PP", "People players"},        
        {"Q", "Quit Help"}        
    };
    
   
    private final HelpMenuControl helpMenuControl = new HelpMenuControl();
    

    public HelpMenuView() {
        
    } 
    

    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); 
            
           
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "G":
                    this.helpMenuControl.displayGridHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;
                case "P":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "L":
                    this.helpMenuControl.displayLocationHelp();
                    break;
                case "M":
                    this.helpMenuControl.displayMarkerHelp();
                    break;
                 case "PP":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                    
            }
        } while (!command.equals("Q"));  
        
       
    }

    /*    // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }*/
  
}
