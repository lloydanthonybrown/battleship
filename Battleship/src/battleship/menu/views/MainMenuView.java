package battleship.menu.views;
import battleship.BattleshipError;
import battleship.MainMenuControl;
import battleship.Menu;
import java.util.Scanner;

/**
 *
 * @author ckcarroll
 */
public abstract class MainMenuView extends Menu{
     private final static String[][] menuItems = {
        {"C", "Control"},
        {"V", "View"}, 
        {"S", "Start now"},
        {"R", "Resume"},
        {"Q", "Quit"},
        {"M", "Music"},        
        {"A", "Advanced Options"}        
    };
     
     public MainMenuView() {
        super(MainMenuView.menuItems);}
        
         
        
            
        
   
    private final MainMenuControl mainMenuControl = new MainMenuControl();
    
   
    public String executeCommands(Object object){

    
      
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); 
            
           
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "C":
                    this.mainMenuControl.displayControlHelp();
                    break;
                case "V":
                    this.mainMenuControl.displayViewHelp();
                    break;
                case "R":
                    this.mainMenuControl.displayResume();
                    break;
                case "Q":
                    this.mainMenuControl.displayQuit();
                    break;
                case "M":
                    this.mainMenuControl.displayMusic();
                    break;
                case "A":
                  this.mainMenuControl.displayAdvancedOptions();
                     break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                  
            }
        } while (!command.equals("Q")); 
        return command;
    }

     /*   // displays the help menu
    public final void display() {
        System.out.println("\n\tжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\tжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж\n");
    }*/
    
    
  
}
