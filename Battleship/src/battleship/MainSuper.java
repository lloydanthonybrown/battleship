package battleship;

/**
 *
 * @author ckcarroll
 */
public class MainSuper {
    
   /* private final String [][] menuItems={
        {"1", "Play against the Computer"},
        {"2", "Play against a person...like your friend or something"},
        {"3", "Help Menu"},
        {"4", "Options"},
        {"5", "Main Menu"},
        {"6", "Get outta here"}
        
    };
    */
    public MainSuper(){
        
    }
    public MainSuper(String[][] menuItems){
        
    }
    
    public void setMenuItems(){
        
    }
    
    protected final void display(){
        
    }
    
    private boolean validCommand(String command){
        return false;
        
    }
    protected final String getCommand(){
        return null;
        
    }
    
     
    public String executeCommands(){
        return null;
    }
    
public class Menu{
    
    public final String [][] menuItems=null;
    
    public Menu(){
        
    }
    
    public Menu(String [][] menuItems){
        
    }
    
    public String[][] getMenuItems(){
        return null;
    }
    
    public void setMenuItems(String[][] menuItems){
        
    }
    
    protected final void display(){
        System.out.println("\n\tжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\tжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжжж\n");
    }
    
    private boolean validCommand(String command){
        return false;
    }
    
    protected final String getCommand(){
        //something a little like this...
        String command;
        Scanner inFile = battleship.getInputFile();
        boolean valid = false;
        
        do{
            command = inFile.nextLine();
            command= command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)){
                new battleshipError().displayError("Invalid Command. Please try again.");
            }
        
        }
        
        return command;
        return command;
    }
    
}

    public class MainMenu extends MainSuper {
        
        private final static String[][] menuItems = {
            {"C", "Control"},
            {"V", "View"}, 
            {"S", "Start now"},
            {"R", "Resume"},
            {"A", "Advanced Options"},
            {"M", "Music"},        
            {"Q", "Quit"}
        };
        
        public MainMenu() {
            super(MainMenu.menuItems);}
        
        @Override  
        public String executeCommands(){
            return null;
        }
    }
}
