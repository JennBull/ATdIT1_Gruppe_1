import javax.swing.*;
import java.awt.*;

public class TryClass extends JFrame {
	JPanel p1,p2,p3,p4;
	
	public TryClass() {
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.CYAN);
		p4.setBackground(Color.RED);
		
		setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
       gbc.gridx = 0;
       gbc.gridy = 0;
       gbc.gridwidth = 5;
       add(p1, gbc);
       
       gbc.gridx = 1;
       gbc.gridy = 1;
       gbc.gridwidth = 5;
       add(p2, gbc);
       
       gbc.gridx = 1;
       gbc.gridy = 2;
       gbc.gridwidth = 5;
       add(p3, gbc);
	}
	
	public static void main(String[] args) {
		JFrame f = new TryClass();
		f.setVisible(true);
	}
}
