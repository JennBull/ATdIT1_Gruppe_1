import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MenuBar extends JPanel {
	JButton back;
	
	public MenuBar(JFrame parentFrame, String destination ) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		URL url = MenuBar.class.getResource("Icon.png");
	    Icon icon = new ImageIcon(url);
	    //JLabel label = new JLabel(icon);
		back = new JButton(icon);
		back.setSize(60, 60);
	    back.addActionListener(new navButtonListener( parentFrame, navButtonListener.MAIN_MENU));
	    setBackground(Color.white);
	    add(back);
	    //add(label);
	}
}
