package battleship;

/* @author lloydab
 */
public class OptionsMenuControl {

      public OptionsMenuControl() {
    } 
      
    public void changeDifficulty() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tBattleship has a grid of 30x30 "
                + "\n\t You will guess the position of your opponents ship by  "
                + "\n\t clicking on one square on the grid. "
                + "\n\t УДАЧИ!");
        displayHelpBorder();
    }

    public void numberOfPlayers() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tBattleship has a total of 5 boats per player. "
                + "\n\t You will place each boat on your grid by clicking "
                + "\n\t on two squares in the grid to specify the beginning "
                + "\n\t and ending location of the boat.");
        displayHelpBorder();
    }
    
    public void playerOptions() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tBattleship has a total of 5 boats per player. "
                + "\n\t You will place each boat on your grid by clicking "
                + "\n\t on two squares in the grid to specify the beginning "
                + "\n\t and ending location of the boat.");
        displayHelpBorder();
    }
    
    public void playerStatistics() {
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tBattleship has a total of 5 boats per player. "
                + "\n\t You will place each boat on your grid by clicking "
                + "\n\t on two squares in the grid to specify the beginning "
                + "\n\t and ending location of the boat.");
        displayHelpBorder();
    }
        
    public void displayError() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void displayHelpBorder() {
        System.out.println(
        "\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
        );
    }
}
