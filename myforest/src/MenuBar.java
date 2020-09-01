import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MenuBar extends JPanel {
	JButton main, shop, chat, problems, tasks ;
	
	public MenuBar(JFrame parentFrame ) {
		setLayout(new GridLayout(1,5));
		URL url = MenuBar.class.getResource("Icon.png");
	    Icon icon = new ImageIcon(url);
	    
	    
		main 		= new JButton(icon);
		shop 		= new JButton("Shop");
		chat 		= new JButton("Chat");
		problems 	= new JButton("Probleme");
		tasks	 	= new JButton("Aufgaben");
		
		
	    main.addActionListener(new navButtonListener( parentFrame, navButtonListener.MAIN_MENU));
	    shop.addActionListener(new navButtonListener( parentFrame, navButtonListener.SHOP_PAGE));
	    chat.addActionListener(new navButtonListener( parentFrame, navButtonListener.CHAT_PAGE));
	    problems.addActionListener(new navButtonListener( parentFrame, navButtonListener.MAIN_MENU));
	    tasks.addActionListener(new navButtonListener( parentFrame, navButtonListener.MAIN_MENU));
	    
	    tasks.setBackground(Color.WHITE);
	    main.setBackground(Color.WHITE);
	    problems.setBackground(Color.WHITE);
	    shop.setBackground(Color.WHITE);
	    chat.setBackground(Color.WHITE);
	    
	    setBackground(Color.white);
	    
	    add(problems);
	    add(tasks);
	    add(main);
	    add(shop);
	    add(chat);
	}
}
