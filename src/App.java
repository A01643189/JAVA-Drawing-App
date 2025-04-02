import javax.swing.SwingUtilities;

public class App {
    //Main Method 
    public static void main(String[] args) { 
        //Method to run the main thread of the app 
        SwingUtilities.invokeLater(() -> { 
            //Create the JFrame object 
            JPanelPractice jPanelPractice = new JPanelPractice(); 
            //Set it visible (Open the JFrame) 
            jPanelPractice.setVisible(true); 
            }); 
        } 
}
