package assignment1images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Controller extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8232162903570879844L;
	private ImageWindow imgWin;

	public Controller() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.imgWin = new ImageWindow(this);
		Model model = new Model(imgWin);

	}

	public void openImage() {
		BufferedImage imgFile = imgWin.chooseImageFile();
	
	}

	public static void launch() {
		new Controller();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> launch());
	}

}
