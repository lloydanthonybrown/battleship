package battleship.menu.controls;

/**
 *
 * @author ckcarroll
 */
public class MainMenuControl {
    public MainMenuControl(){
        
    }
    
    
    public void displayControlHelp(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t Controls- well, you just click on the grid...thats really it..."
        );
        //additional controls added later
        displayHelpBorder();
    }  
    
    public void displayViewHelp(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t You can change the grid color to red, white, or blue."
        );
        //possibly later, when we lean, to add different colors to the grid
        displayHelpBorder();
    }
    
    public void displayStart(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t Starting Game..."
        );
        //Later- add fucntion to start game
        displayHelpBorder();
    }
    
    public void displayResume(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t Resume Game?"
        );
        //additions to be added later.
        displayHelpBorder();
    }
    public void displayQuit(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t Are you sure you want to exit?"
        );
        //additions to be added later
        displayHelpBorder();
    }
    
    public void displayMusic(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t Sorry, you are stuck with the Top Gun sound track."
        );
        //additions to be added later. 
        displayHelpBorder();
    }
    public void displayAdvancedOptions(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
        "\t Advanced options"
                + "\n\t Player"
                + "\n\t Options"
                + "\n\t Statistics"
        );
        displayHelpBorder();
    }    
     public void displayHelpBorder() {       
        System.out.println(
        "\tЖжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжЖ");
    }    
   
}
