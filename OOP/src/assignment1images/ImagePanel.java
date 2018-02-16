package assignment1images;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4378337150664924473L;
	private BufferedImage image;
	
	public void setImage(BufferedImage image) {
		Graphics g = image.getGraphics();
		paintComponent(g);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, this);
		
	}

}
