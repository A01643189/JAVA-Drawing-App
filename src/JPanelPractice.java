import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class JPanelPractice extends JFrame {
    private JTextField celsiusField; 
    private JTextField fahrenheitField; 

    public JPanelPractice(){ 
        setTitle("Jpanel Practice"); 
        setSize(900, 600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 

        JPanel whitePanel = new JPanel(); 
        whitePanel.setBounds(0,0,900,500); 
        whitePanel.setBackground(Color.WHITE); 
        add(whitePanel); 

        JPanel grayPanel = new JPanel(); 
        grayPanel.setBounds(0,500,900,100); 
        grayPanel.setBackground(Color.LIGHT_GRAY); 
        grayPanel.setLayout(null); 
        add(grayPanel);

        JPanel blackPanel = new JPanel(); 
        blackPanel.setBounds(0,0,50,50); 
        blackPanel.setBackground(Color.BLACK); 
        grayPanel.add(blackPanel); 

        JPanel redPanel = new JPanel(); 
        redPanel.setBounds(850,0,50,50); 
        redPanel.setBackground(Color.RED); 
        grayPanel.add(redPanel); 
    } 
}
