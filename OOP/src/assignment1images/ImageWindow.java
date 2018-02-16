package assignment1images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ImageWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7000281064441967620L;
	private File file;
	final JFileChooser fc = new JFileChooser();
	private BufferedImage img;

	public ImageWindow(Controller controller) {
		ImagePanel imgPanel = new ImagePanel();
		ButtonPanel btnPanel = new ButtonPanel(controller);
		add(imgPanel);
		add(btnPanel);
		setTitle("Turbo Mega Coursework Program");
		pack();
		setLocation(800, 400);
		setVisible(true);
		// imgPanel.setImage(setImage()));
	}

	public BufferedImage setImage(BufferedImage image) {
		return image;
	}

	public BufferedImage chooseImageFile() {
		// open dialog
		int retVal = fc.showOpenDialog(getParent());
		// get the file
		if (retVal == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
			try {
				img = ImageIO.read(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return img;
	}

}
