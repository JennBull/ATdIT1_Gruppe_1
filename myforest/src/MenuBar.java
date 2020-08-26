import javax.swing.*;
import java.awt.*;

public class MenuBar extends JPanel {
	JButton back;
	
	public MenuBar(JFrame parentFrame, String destination ) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		back = new JButton("<");
	    back.addActionListener(new navButtonListener( parentFrame, navButtonListener.MAIN_MENU));
	    add(back);
	}
}
