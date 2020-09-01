import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;


import javax.swing.*;
import javax.swing.plaf.LayerUI;
public class MapPage extends Container{
    JPanel panel1, panelNavigation, pnlProblem;
    JLabel lab;
    JFrame parentFrame;
    JButton back;
    
    public MapPage (JFrame parentFrame) {
    this.parentFrame = parentFrame;
    setLayout(new BorderLayout());
    panel1 = new MapLabel();
    panelNavigation = new MenuBar(parentFrame);
   
     
    add(panelNavigation, BorderLayout.NORTH);
    add(panel1, BorderLayout.CENTER);
    
   
    }
    
    
    class MapLabel extends JPanel {
    	
    	public MapLabel() {
    		
    		URL url = Chat.class.getResource("map.png");           
    	    ImageIcon bild = new ImageIcon(url);
    	    lab = new JLabel (bild);
    	    LayerUI<JLabel> UI = new Point();
    	    JLayer<JLabel> layerMap = new JLayer<JLabel>(lab,UI);
    	    add(layerMap);
       	}   		
    		
    }
    	
    class Point extends LayerUI<JLabel>{
    	@Override
    	public void paint(Graphics g, JComponent c) {
    		super.paint(g, c);
    		g.setColor(Color.RED);
    		g.fillRect(300, 200, 10, 10);
    		
    	}    
    
}
    
}