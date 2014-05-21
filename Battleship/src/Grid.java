package battleship;
import java.util.Scanner;
/* author Lloyd Brown
*/

public class Grid {
    private int width = 10;
    private int height = width;
    private double gridSize = width * height;
    private int guesses; 
    /* This is a crappy way of doing it, I know. It would be better to have
    * calculated the number of ships first, and how big those ships are, and 
    * then used that as the upper boundary for how many hits could be achieved.
    */
    private int numberOfHits;
    private int numberOfHitsPossible;  
    /* public void getGridSize() {
        Grid testGrid = new Grid();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one side of the grid: ");
        this.width = input.nextByte();
        testGrid.getGridSize();
    }
    */
    
    public void displayGridWidth() {
        System.out.println(width);
    }
    
    public void displayGridHeight() {
        System.out.println(height);
    }

    public Grid(int guesses, int numberOfHits, int numberOfHitsPossible) {
        this.guesses = guesses;
        this.numberOfHits = numberOfHits;
        this.numberOfHitsPossible = numberOfHitsPossible;
    }
    
//    Grid grid1 = new Grid(10, 4, 17);
//        System.out.println(this.gridSize);
//
//    private static class gridSize {
//
//        public gridSize() {
//        }
//    }
    public static double getPercentageOfGameComplete(){
        Grid grid1 = new Grid(10, 4, 17);
        
        if (size < 0)  {
            System.out.println("Invalid grid size");
            return -1;}
        if (numberOfHits == 0)  {
            System.out.println("Invalid grid size");
            return 0;}
        if (numberOfHits < 0)  {
            System.out.println("Invalid number of hits");
            return -1;}
        if (numberOfHitsPossible < 0) {
            System.out.println("Invalid number of hits possible");
            return -1;}
        if (guesses < 0) {
            System.out.println("Invalid number of guesses");
            return -1;}
        if (numberOfHits > guesses)  {
            System.out.println("Invalid number of hits - cannot be greater than "
                    + " number of guesses");
            return -1;}
        
        double percentageGuessed = guesses / size;
        
        if (percentageGuessed = 0){
            return 0;}
    
    }
    
}

