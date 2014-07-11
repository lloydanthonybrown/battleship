package battleship;
import battleship.menu.views.MainMenuView;
import java.io.Serializable;
import java.util.Scanner;

public class Battleship implements Serializable{
// authors Lloyd Brown, Christopher Carroll, Rubin Gonzalez, and KamiAnne Dastrup
    private static final Scanner inFile = new Scanner(System.in);
    private String name;
    private String instructions = "The game of Battleship \n\n"
            + "You will have the choice of playing against another person\n"
            + "or against a computer. The object of the game is to guess\n"
            + "where the opponent's ships are located. They can be\n" 
            + "individually located vertically or horizontally.\n";
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name + ", to: " + "\n");
        System.out.println(this.instructions);
    }
            
    public static void main(String[] args) {
        Battleship myGame = new Battleship();
        myGame.getName();
        myGame.displayHelp();
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        int array1[] = {8, 12, 10, 20, 17};
        int array2[] = {0, 4, 2, 0};
        
        for(int i = 0; i<array1.length; i++){
            try {
                System.out.println(array1[i] + " / " +
                        array2[i] + " is " + 
                        array1[i]/array2[i]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array out of bounds, ya loon.");
        }
        catch (Throwable ex) {
            System.out.println("Something else wrong happened.");
        }
        finally {
                Battleship.inFile.close();
            }
    }
        
       //call function from UserHelp
        /* int wins = 8;
        int losses = 1;
        UserHelp.getLosingPercentage(wins, losses);
        GetWinningPercentage(wins, losses);
        Player plays[] = new Player[2];
        Grid.getPercentageOfGameComplete(); 
        Grid.getPercentageOfGameComplete(); */
        
        //duplicate instance created
        //MainMenuView mainMenu = new MainMenuView();
        //mainMenu.getInput();
    }

    public Battleship() {
    }
    
    public Battleship(String name) {
        this.name = name;
    }
        
/*public static double GetWinningPercentage(int wins, int losses){
    if (wins < 0) {
    System.out.println("Invalid number of wins");
    return -1;}
    if (losses < 0) {
    System.out.println("Invalid number of losses");
    return -1;}
    double totalScore = wins + losses;
    if (totalScore ==  0) {
    return 0;}
    double winLossRatio = (wins / totalScore) * 100;
    return winLossRatio;
    }*/
    
    //****************************
    // I don't know if this should be replacing the other getName() above or not.
    /* public String getName() {
        return name;
    } */
    //****************************
    
    // The remaining getters and setters for this Battleship.java class.
    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    
    
}
