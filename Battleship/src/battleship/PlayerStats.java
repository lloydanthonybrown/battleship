
package battleship;

/**
 *
 * @author KamiAnne Dastrup
 */
public class PlayerStats {

    public PlayerStats() {
    }
    
    private static int wins;
    private static int losses;
    private static double totalScore;
    private static double winLossRatio;
    
    public static double GetWinningPercentage(){
        if (wins < 0) {
            System.out.println("Invalid number of wins");
            return -1;}
        if (losses < 0) {
            System.out.println("Invalid number of losses");
            return -1;}
        totalScore = wins + losses;
        if (totalScore ==  0) {
            return 0;}
        winLossRatio = (wins / totalScore) * 100;
        return winLossRatio;
    }
    
    private static int numOfMoves;
    private static int highScore;
    private static boolean playerWin;
    
    public static int GetHighScore() {
        if (playerWin == true) {
        
            if (numOfMoves < highScore) {
                highScore = numOfMoves;
            }
        }
        return highScore;
    }

    public static int getWins() {
        return wins;
    }

    public static void setWins(int wins) {
        PlayerStats.wins = wins;
    }

    public static int getLosses() {
        return losses;
    }

    public static void setLosses(int losses) {
        PlayerStats.losses = losses;
    }

    public static double getTotalScore() {
        return totalScore;
    }

    public static void setTotalScore(double totalScore) {
        PlayerStats.totalScore = totalScore;
    }

    public static double getWinLossRatio() {
        return winLossRatio;
    }

    public static void setWinLossRatio(double winLossRatio) {
        PlayerStats.winLossRatio = winLossRatio;
    }

    public static int getNumOfMoves() {
        return numOfMoves;
    }

    public static void setNumOfMoves(int numOfMoves) {
        PlayerStats.numOfMoves = numOfMoves;
    }

    public static int getHighScore() {
        return highScore;
    }

    public static void setHighScore(int highScore) {
        PlayerStats.highScore = highScore;
    }

    public static boolean isPlayerWin() {
        return playerWin;
    }

    public static void setPlayerWin(boolean playerWin) {
        PlayerStats.playerWin = playerWin;
    }
    
    
}
