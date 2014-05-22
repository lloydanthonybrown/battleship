/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

/**
 *
 * @author KamiAnne Dastrup
 */
public class PlayerMenuControl {
    
    public PlayerMenuControl() {
    
    }
    
    public void changeP1Name() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tPlease enter the name of Player 1");
        displayHelpBorder();
    }
    
    public void changeP2Name() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tPlease enter the name of Player 2");
        displayHelpBorder();
    }
    
    public void changeCompName() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tPlease enter a new name for the computer player");
        displayHelpBorder();
    }
    
    public void changeFirstTurn() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println("\tPlease enter which player you would like to go first"
            + "\n\tor enter 'random' to have the game decide for you.");
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
