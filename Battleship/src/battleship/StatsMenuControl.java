/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;
import java.io.Serializable;

/**
 *
 * @author rubengonzalezflores
 */
public class StatsMenuControl implements Serializable {
    
    //default constructor
    public StatsMenuControl() {
    
    }
    
    public void totalGamesPlayed() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tTotal Games Played:");
        displayHelpBorder();
    }
    
    public void totalGamesWon() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tTotal Games Won");
        displayHelpBorder();
    }
    
    public void totalGamesLost() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tTotalGamesLost");
        displayHelpBorder();
    }
    
    public void percentWinsTotal() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tPercent of Wins:");
        displayHelpBorder();
    }
    
    public void displayError() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tInvalid command. Please enter a valid command.");
        displayHelpBorder();
    }
    
    public void displayHelpBorder() {
        System.out.println(
        "\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
        );
    }
}