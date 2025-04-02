import javax.swing.SwingUtilities;

public class App {
    //Main Method 
    public static void main(String[] args) { 
        //Method to run the main thread of the app 
        SwingUtilities.invokeLater(() -> { 
            //Create the JFrame object 
            SwingTemperatureApp swingTemperatureApp = new SwingTemperatureApp(); 
            //Set it visible (Open the JFrame) 
            swingTemperatureApp.setVisible(true); 
        }); 
    } 
}
