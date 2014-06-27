package battleship;

import java.util.Scanner;

/**
 *
 * @author ckcarroll
 */
public class MainSuper {
  /*  
    private final String [][] menuItems={
        {"1", "Play against the Computer"},
        {"2", "Play agaist a person...like your friend or something"},
        {"3", "Help Menu"},
        {"4", "Options"},
        {"5", "Main Menu"},
        {"6", "Get outta here"}
            
    };
    
    public MainSuper(){
        
    }
    public MainSuper(String[][] menuItems){
        
    }
    
    public void setMenuItems(){
        
    }
    
    protected final void display(){
        
    }*/
    
   /* private boolean validCommand(String command){
	String [][] items = this.menuItems;
	
	    if(item[0].equals(command));{
	    return true;
	}    
    }
    protected final String getCommand(){
        return null;
        
    }
    
    public String executeCommands(Object object){
        return null;
    }*/
    
public abstract class Menu{
    
    private final String [][] menuItems=null;
    
    public Menu(){
        
    }
    
    public void getInput(){
        String command;
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        
    }

    public Menu(String [][] menuItems){
	this();
        menuItems = menuItems;
	
    }
    
    public abstract String executeCommands(Object objeect);
    
    
    public String[][] getMenuItems(){
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuItems){
        
    }
    
    public final void display(){
        System.out.println("\n\tжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\tжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж\n");
    }
    
    private boolean validCommand(String command){
        String[][] items = this.menuItems;
        
        for (String [] item : this.menuItems){
         if (item[0].equals(command)){
             return true;
         }
        }
        
        return false;
    }
    
    protected final String getCommand(){
        
        String command;
        Scanner inFile = battleship.getInput();
        boolean valid = false;
        
        do{
            command = inFile.nextLine();
            command= command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)){
                new BattleshipError().displayError("Invalid Command. Please try again.");
	
            }
        return command;
        
       
        } while(!valid);
        
        
}    
    
}

}
