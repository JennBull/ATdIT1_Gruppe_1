

import java.awt.*;
import javax.swing.*;


public class MainMenu extends JFrame  {

	public JTextField eingabeDateiFeld, ausgabeDateiFeld;
	JPanel panel1,panel2,panel3,panel4;
	JLabel label1,label2,label3;


	public MainMenu (){
        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 1));
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        Icon title = new ImageIcon("C:/Users/I518173/git/ATdIT1_Gruppe_1/myforest/src/MicrosoftTeams-image%20(2).png");
        Icon weather = new ImageIcon("C:/Users/I518173/git/ATdIT1_Gruppe_1/myforest/src/MicrosoftTeams-image3.png");
        Icon map = new ImageIcon("C:/Users/I518173/git/ATdIT1_Gruppe_1/myforest/src/MicrosoftTeams-image%20(1).png");
        
        label1 = new JLabel(title);
        label2 = new JLabel(weather);
        label3 = new JLabel(map);
        JButton Menu1 = new JButton("Probleme");
        JButton Menu2 = new JButton("Chat");
        JButton Menu3 = new JButton("Shop");
        JButton Menu4 = new JButton("Aufgaben");
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.setLayout(new GridLayout(2,2));
        panel4.add(Menu1);
        panel4.add(Menu2);
        panel4.add(Menu3);
        panel4.add(Menu4);
        c.add(panel1);
        c.add(panel2);
        c.add(panel3);
        c.add(panel4);
    }
    
    public static void main(String[] args) {

    	MainMenu fenster = new MainMenu();
        fenster.setTitle("My Forest");
        fenster.setSize(2000, 2000);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


 


 

 

