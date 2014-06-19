package battleship;
import java.io.Serializable;

public class BoardView implements Serializable{
    
    private int gameboard[][] = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };
        
        private int i, j;
        
        //not sure what this error is, I tried it in a separate project and it
        //worked just fine without errors
        
        public void displayGameboard() {
            for (i = 0; i <10; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(gameboard[i][j] + ", ");
            System.out.println();}
        }

    // Default constructor for the BoardView.java class    
    public BoardView() {
    }

    // Constructor for the BoardView.java class, but I don't know if it is necessary.
    public BoardView(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Getters and setters for the BoardView.java class. 
    public int[][] getGameboard() {
        return gameboard;
    }

    public void setGameboard(int[][] gameboard) {
        this.gameboard = gameboard;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
        
            
}
