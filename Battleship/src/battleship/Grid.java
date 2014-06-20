package battleship;

import java.awt.Point;
import java.io.Serializable;
import java.util.Scanner;

/* author Lloyd Brown
*/

public class Grid implements Serializable {
    int width;

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

   
    int height;
    private double gridSize;
    private int guesses; 

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getGridSize() {
        return gridSize;
    }

    public void setGridSize(double gridSize) {
        this.gridSize = gridSize;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }
    
    public Grid(int guesses) {
        this.gridSize = width * height;
        this.height = width;
        this.width = 30;
        this.guesses = guesses;
    }
    
   
    
    private int numberOfHits;
    private int numberOfHitsPossible;  

    public Grid(int numberOfHits, int numberOfHitsPossible) {
        this.numberOfHits = numberOfHits;
        this.numberOfHitsPossible = numberOfHitsPossible;
    }

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public void setNumberOfHits(int numberOfHits) {
        this.numberOfHits = numberOfHits;
    }

    public int getNumberOfHitsPossible() {
        return numberOfHitsPossible;
    }

    public void setNumberOfHitsPossible(int numberOfHitsPossible) {
        this.numberOfHitsPossible = numberOfHitsPossible;
    }
    
    
   
    
    public void displayGridWidth() {
        System.out.println(width);
    }
    
    public void displayGridHeight() {
        System.out.println(height);
    }

    public Grid(){
        this.gridSize = width * height;
        this.height = width;
        this.width = 30;
        
    }
    public Grid(int guesses, int numberOfHits, int numberOfHitsPossible) {
        this.gridSize = width * height;
        this.height = width;
        this.width = 30;
        this.guesses = guesses;
        this.numberOfHits = numberOfHits;
        this.numberOfHitsPossible = numberOfHitsPossible;
    }
    
    

    
     public static void printRow(int[] row) {
      
         for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
        
        int gridArray[][]= new int[20][20];
        int y,x,k=1;

        for(y=20;y<gridArray.length;y++) {
            for(x=20;x<gridArray.length;x++) {
                gridArray[y][x]=k;
                k++;
            }
        }

     /*  
    private Grid largeGrid = new Grid();
    
    public Point getInput() {

        Scanner inFile = new Scanner(System.in); // get input file      
        String[] coordinates;
        Point location = null;
        
        boolean valid = false;
        

        // prompt the use to enter the locaton to placeread the row and column coordinates
        while (!valid) {
            // prompt for the row and column numbers
            System.out.println("\n\n\t" + "Dear hoodlum, it is your turn."
                + " Enter a row and column number (For example: 1 3)");
            
            // get the value entered by the user 
            String strRowColumn = inFile.nextLine(); 
            
            // trim off all extra blanks from the input
            strRowColumn = strRowColumn.trim();  
            
            // replace any commas enter with blanks
            strRowColumn = strRowColumn.replace(',', ' '); 
            
            // tokenize the string into an array of words
            coordinates = strRowColumn.split("\\s"); 

            if (coordinates.length < 1) { // the value entered was not blank?
                new BattleshipError().displayError(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }    

            else if (coordinates.length == 1) { // only one coordinate entered?
                if (coordinates[0].toUpperCase().equals("Q")) { // Quit?
                    return null;
                } else { // wrong number of values entered.
                    new BattleshipError().displayError(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                    continue;
                }
            }
            
            // user java regular expression to check for valid integer number 
            // for both numbers
            String regExpressionPattern = ".*\\d.*";
            if (!coordinates[0].matches(regExpressionPattern) ||
                !coordinates[1].matches(regExpressionPattern)) {
                new BattleshipError().displayError(
                        "You must enter two numbers, the number rows and columns, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }
            
            // convert each of the cordinates from a String type to 
            // an integer type
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
                     
            // I think this works?? We'll see.
            Grid grid = this.largeGrid;
            
            // Check for invalid row and column entered
            if (row < 1   ||  row > grid.width ||
                column < 1  ||  column > grid.height) {
                new BattleshipError().displayError(
                        "Please enter a valid number of rows and columns from 1 to 30.");
                continue;
            }
            
            // create a Point object to store the row and column coordinates in
            location = new Point(row-1, column-1);
            

            valid = true; // a valid location was entered

        }
        
        return location; 
            
    }*/
     }
    
}

