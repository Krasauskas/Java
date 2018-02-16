package assignment1images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Model {
	private BufferedImage image;
	
	public Model(ImageWindow view) {
//		this.view = view;
	}
	
	public boolean setImage(BufferedImage image) {
		return true;
	}
	
	public BufferedImage loadImage(File file) {
		try {
			BufferedImage image = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

}
