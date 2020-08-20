import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 * This is a generic ActionListener for Navigation between different pages of the project
 * @author Gruppe 1
 *
 */
public class navButtonListener implements ActionListener {
	
	String destinationPage;
	JFrame frame;
	public static final String MAIN_MENU = "main";
	public static final String HOME_PAGE = "home";
	
	
	 public navButtonListener(JFrame frame, String destinationPage) {
		 this.destinationPage = destinationPage;
		 this.frame = frame;
		 }
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(destinationPage) {
		case(MAIN_MENU):
			frame.setContentPane(new MainMenu(frame));
			break;
		case(HOME_PAGE):
			frame.setContentPane(new HomeScreen(frame));
			break;
		}
		frame.setVisible(true);
		
	}

}
