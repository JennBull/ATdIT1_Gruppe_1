import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.FlowLayout;

import java.awt.Image;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


 

import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class HomeScreen extends JFrame {
	Container c; 
	JButton start;
	JLabel lab;
	JPanel panel1, panel2;
	
	public HomeScreen () {
	c = getContentPane();
	c.setLayout(new BorderLayout());
	panel1 = new JPanel();
	panel2 = new JPanel();
	Icon bild = new ImageIcon("C:/Users/I518173/git/ATdIT1_Gruppe_1/myforest/src/MicrosoftTeams-image.png");
	lab = new JLabel (bild);
	start = new JButton("Start");
	panel1.add(lab);
	panel2.add(start);
	c.add(panel1, BorderLayout.NORTH);
	c.add(panel2, BorderLayout.SOUTH);
	
	}

	public static void main (String[] args) {
	HomeScreen home = new HomeScreen ();
	home.setTitle("My Forest");
	home.setSize(1100, 800);
	home.setVisible(true);
	home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}






 


 


 

public class ATdIT2020 extends JFrame {


 


 


 

 

}