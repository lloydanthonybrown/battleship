package battleship;
import java.util.Scanner;

public class Battleship {
// authors Lloyd Brown, Christopher Carroll, Rubin Gonzalez, and KamiAnne Dastrup
    
    String name;
    String instructions = "The game of Battleship \n\n"
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
        
       //call function from UserHelp
        int wins = 8;
        int losses = 1;
        UserHelp.getLosingPercentage(wins, losses);
        GetWinningPercentage(wins, losses);
        Player plays[] = new Player[2];
        Grid.getPercentageOfGameComplete();
    }

    public Battleship() {
    }
    
    public Battleship(String name) {
        this.name = name;
    }
        
public static double GetWinningPercentage(int wins, int losses){
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
}

}
