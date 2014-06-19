package battleship;
import java.io.Serializable;

//Authors: KamiAnne Dastrup, Ruben Gonzalez, Lloyd Brown, Chris Carroll
public class UserHelp implements Serializable {
    String rules;
    
    private static int wins;
    private static int losses;
    private static double totalGames;
    private static double losingPercentage;
    
    //Do we want to use this statistic or delete? If so class can be deleted.
    public static double getLosingPercentage() {
       
        //check for valid values
        if (wins < 0)  {
            System.out.println("Invalid number of wins");
            return -1;}
        if (losses < 0) {
            System.out.println("Invalid number of losses");
            return -1;}
        
        //find total number of games
        totalGames = wins + losses;
        
        //find losing percentage
        losingPercentage = losses / totalGames;
        
        //display help prompt or losing percentage
        if (totalGames >= 5 && losingPercentage >= 0.75) 
            System.out.println("Would you like to \n review the instructions?");
        else 
            System.out.println("Your losing percentage is " + losingPercentage);
        
        return losingPercentage;
    
        } 

    public UserHelp() {
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public static int getWins() {
        return wins;
    }

    public static void setWins(int wins) {
        UserHelp.wins = wins;
    }

    public static int getLosses() {
        return losses;
    }

    public static void setLosses(int losses) {
        UserHelp.losses = losses;
    }

    public static double getTotalGames() {
        return totalGames;
    }

    public static void setTotalGames(double totalGames) {
        UserHelp.totalGames = totalGames;
    }
    
    
        
    }

