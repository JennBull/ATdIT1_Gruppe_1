import java.awt.*;
import java.net.URL;


import javax.swing.*;

public class Chat extends Container{
    JPanel panel1, panelNavigation;
    JLabel lab;
    JFrame parentFrame;
    JButton back;
    
    public Chat (JFrame parentFrame) {
    this.parentFrame = parentFrame;
    setLayout(new BorderLayout());
    panel1 = new JPanel();
    panelNavigation = new MenuBar(parentFrame);
    URL url = Chat.class.getResource("Chat.png");           
    ImageIcon bild = new ImageIcon(url);
    lab = new JLabel (bild);
    panel1.add(lab);
    add(panelNavigation, BorderLayout.NORTH);
    add(panel1, BorderLayout.CENTER);
    
   
    }
    
}