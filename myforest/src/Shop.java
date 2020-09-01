import java.awt.*;
import java.net.URL;
import javax.swing.*;

 

public class Shop extends Container{
    JPanel panel1, panelNavigation;
    JLabel lab;
    JFrame parentFrame;
    
    public Shop (JFrame parentFrame) {
    this.parentFrame = parentFrame;
    setLayout(new BorderLayout());
    panel1 = new JPanel();
    panelNavigation = new MenuBar(parentFrame);
    //URL url = Shop.class.getResource("Shop.png");           
    //ImageIcon bild = new ImageIcon(url);
    //lab = new JLabel (bild);
    //panel1.add(lab);
    add(panelNavigation, BorderLayout.NORTH);
    setBackground(Color.white);
    }
}