
import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class MainMenu extends Container  {

	public JTextField eingabeDateiFeld, ausgabeDateiFeld;
	JPanel panelTitle,panelWeather,panelMap,panelButtons;
	JScrollPane scrollPanel;
	JLabel labelTitle,labelWeather,labelMap;
	JFrame parentframe;


	public MainMenu (JFrame parentframe){
		this.parentframe = parentframe;
		setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        scrollPanel = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panelTitle = new JPanel();
        panelWeather = new JPanel();
        panelMap= new JPanel();
        panelButtons = new JPanel();
        URL titleUrl = MainMenu.class.getResource("TitleImage.png");
        URL weatherUrl = MainMenu.class.getResource("weatherImage.png");
        URL mapUrl = MainMenu.class.getResource("mapImage.png");
        Icon title = new ImageIcon(titleUrl);
        Icon weather = new ImageIcon(weatherUrl);
        Icon map = new ImageIcon(mapUrl);
        
        labelTitle = new JLabel(title);
        labelWeather = new JLabel(weather);
        labelMap = new JLabel(map);
        
        JButton Menu1 = new JButton("Probleme");
        //Menu1.addActionListener(new navButtonListener(this, navButtonListener.));
        JButton Menu2 = new JButton("Chat");
        Menu2.addActionListener(new navButtonListener(this.parentframe, navButtonListener.CHAT_PAGE));
        JButton Menu3 = new JButton("Shop");
        Menu3.addActionListener(new navButtonListener(this.parentframe, navButtonListener.SHOP_PAGE));
        JButton Menu4 = new JButton("Aufgaben");
        JButton btnMap = new JButton("Karte");
        btnMap.addActionListener(new navButtonListener(this.parentframe, navButtonListener.MAP_PAGE));
        //Menu1.addActionListener(new navButtonListener(this, navButtonListener.));
        
       
        panelTitle.add(labelTitle);
//        panelWeather.add(labelWeather);
//        panelMap.add(labelMap);
        panelButtons.setLayout(new GridLayout(1,5));
        panelButtons.add(Menu1);
        panelButtons.add(Menu2);
        panelButtons.add(Menu3);
        panelButtons.add(Menu4);
        panelButtons.add(btnMap);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy= 0;
        gbc.gridheight = 1;
        add(panelTitle, gbc);
        
        JPanel panelMiddle= new JPanel(new GridLayout(2,1));
        panelMiddle.add(labelWeather);
        panelMiddle.add(labelMap);
        scrollPanel.add(panelMiddle);
        scrollPanel.setSize(800, 500);
        gbc.gridx = 0;
        gbc.gridy = 1; 
        gbc.gridheight = 4;
        add(labelWeather, gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 5; 
        gbc.gridheight = 1;
        add(panelButtons, gbc);
       
        setVisible(true);
    }
}


 


 

 

