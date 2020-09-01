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
	public static final String CHAT_PAGE = "chat";
	public static final String SHOP_PAGE = "shop";
	public static final String MAP_PAGE  = "map";
	
	
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
		case(CHAT_PAGE):
			frame.setContentPane(new Chat(frame));
			break;
		case(SHOP_PAGE):
			frame.setContentPane(new Shop(frame));
			break;
		case(MAP_PAGE):
			frame.setContentPane(new MapPage(frame));
			break;
		}
		frame.setVisible(true);
		
	}

}
