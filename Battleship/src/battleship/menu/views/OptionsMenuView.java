package battleship.menu.views;
import battleship.OptionsMenuControl;
import java.util.Scanner;

/* @author lloydab
 */
public class OptionsMenuView extends MainMenuView{
    
     private final static String[][] menuItems = {
        {"D", "Difficulty"},
        {"N", "Number of Players"}, 
        {"P", "Player Options'"},
        {"S", "Statistics"},
        {"Q", "Quit Help"}        
    };
   
    private final OptionsMenuControl optionsMenuControl = new OptionsMenuControl();

    public OptionsMenuView() {
    } 

     @Override
    public void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); 
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "D":
                    this.optionsMenuControl.changeDifficulty();
                    break;
                case "N":
                    this.optionsMenuControl.numberOfPlayers();
                    break;
                case "P":
                    this.optionsMenuControl.playerOptions();
                    break;                  
                case "S":
                    this.optionsMenuControl.playerStatistics();
                    break;
                case "Q":
                    break;
                default: 
                    this.optionsMenuControl.displayError();
                    continue;
                                        
            }
        } while (!command.equals("Q"));  
       return;
    }

        // displays the options menu
     @Override
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < OptionsMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
