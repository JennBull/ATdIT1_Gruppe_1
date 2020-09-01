import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 * This is the starting point of the MyForest Application
 * @author Gruppe 1
 *
 */
public class StartClass extends JFrame {
	Container c;
	public static void main(String[] args) {
		JFrame start = new StartClass();
		start.setContentPane(new HomeScreen(start));
		start.setTitle("My Forest");
		start.setSize(1500, 1000);
		start.setVisible(true);
		start.setBackground(Color.white);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
