/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author KamiAnne Dastrup
 */
public class PlayerMenuView implements Serializable {
    
    private final static String[][] menuItems = {
        {"1", "Change Player 1 Name"},
        {"2", "Change Player 2 Name"},
        {"C", "Change Computer Name"},
        {"F", "Change who goes first"},
        {"Q", "Quit Player Menu"}
    };
    
    //Instance of HelpMenuControl class
    private PlayerMenuControl playerMenuControl = new PlayerMenuControl();
    
    //default constructor
    public PlayerMenuView() {
    
    }
    
    //display Player Menu and get user input selection
    public void getInput() {
    
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); //display menu
            
            //get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            switch (command) {
                case "1":
                    this.playerMenuControl.changeP1Name();
                    break;
                case "2":
                    this.playerMenuControl.changeP2Name();
                    break;
                case "C":
                    this.playerMenuControl.changeCompName();
                    break;
                case "F":
                    this.playerMenuControl.changeFirstTurn();
                    break;
                case "Q":
                    break;
                default:
                    this.playerMenuControl.displayError();
                    continue;
            }
        } while (!command.equals("Q"));
        
        return;
    }
    
    //displays player menu
    public final void display() {
        System.out.println("\tEnter the letter or number associated with one of the following commands:");
        
        for (int i = 0; i < PlayerMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }
}
