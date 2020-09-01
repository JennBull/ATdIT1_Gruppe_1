
import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class MainMenu extends Container  {

	public JTextField eingabeDateiFeld, ausgabeDateiFeld;
	JPanel panelTitle,panelWeather,panelMap, panelNavigation;
	JPanel scrollPanel;
	JLabel labelTitle,labelWeather,labelMap;
	JFrame parentFrame;


	public MainMenu (JFrame parentframe){
		this.parentFrame = parentframe;
		setLayout(new BorderLayout());
        panelWeather 	= new JPanel();
        panelMap		= new JPanel();
        panelNavigation = new MenuBar(parentFrame);

        URL weatherUrl 	= MainMenu.class.getResource("weatherImage.png");
        URL mapUrl 		= MainMenu.class.getResource("map.png");
        Icon weather 	= new ImageIcon(weatherUrl);
        Icon map 		= new ImageIcon(mapUrl);
        
        labelWeather 	= new JLabel(weather);
        labelMap 		= new JLabel(map);
        
        JPanel panelMiddle= new JPanel(new GridLayout(2,1));
        panelMiddle.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0; 
        gbc.gridheight = 1;
        panelMiddle.add(labelWeather, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1; 
        gbc.gridheight = 2;
        gbc.insets = new Insets(10, 0, 0, 0);
        panelMiddle.add(labelMap, gbc);
        
        add(panelNavigation, BorderLayout.NORTH);
        add(panelMiddle, BorderLayout.CENTER);
        setVisible(true);
    }
}


 


 

 

