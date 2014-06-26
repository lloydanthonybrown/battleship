package battleship;

/**
 *
 * @author ckcarroll
 */
public class MainSuper {
    
    private final String [][] menuItems=null;
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
    
public abstract class Menu{
    
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
        
    }
    
    private boolean validCommand(String command){
        return false;
    }
    
    protected final String getCommand(){
        return null;
    }
    
}

    public class MainMenu extends MainSuper{
        
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
