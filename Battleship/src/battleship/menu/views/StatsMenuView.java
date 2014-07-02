/*
 I think this class can be deleted. We have stats listed in the Options Menu.
 */

package battleship.menu.views;
import battleship.StatsMenuControl;
import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author rubengonzalezflores
 */
public class StatsMenuView implements Serializable{
    private final static String[][] menuItems = {
        {"T", "Total Games Played"},
        {"W", "Total Games won"},
        {"L", "Total Games Lost"},
        {"P", "Percent of Wins/Total"},
        {"Q", "Quit Player Menu"}
    };
    
    //Instance of StatsMenuControl class
    private StatsMenuControl StatsMenuControl = new StatsMenuControl();
    
    //default constructor
    public StatsMenuView() {
    
    }
    
    //display Statistics Menu and get user input selection
    public void getInput() {
    
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); //display menu
            
            //get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            switch (command) {
                case "T":
                    this.StatsMenuControl.totalGamesPlayed();
                    break;
                case "W":
                    this.StatsMenuControl.totalGamesWon();
                    break;
                case "L":
                    this.StatsMenuControl.totalGamesLost();
                    break;
                case "A":
                    this.StatsMenuControl.percentWinsTotal();
                    break;
                case "Q":
                    break;
                default:
                    this.StatsMenuControl.displayError();
                    continue;
            }
        } while (!command.equals("Q"));
        
        return;
    }
    
    //displays Stats menu
    public final void display() {
        System.out.println("\tEnter the letter or number associated with one of the following commands:");
        
        for (int i = 0; i < StatsMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }
}
