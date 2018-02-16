package imageproc.operations.negative;

import java.awt.image.BufferedImage;

import javax.swing.JComponent;

import imageproc.model.AbstractOperation;
import imageproc.operations.OperationUtilities;
import imageproc.view.ImageWindow;

public class NegativeOperation extends AbstractOperation{

	public NegativeOperation() {
		super("Negative", "Changes image to negative");
	}
	
	@Override
    public JComponent settingsUI(ImageWindow view) {
        return new NegativeUI();
    }

	@Override
	public BufferedImage execute(BufferedImage inputImage) {
		  for (int x = 0; x < inputImage.getWidth(); x++) {
	            for (int y = 0; y < inputImage.getHeight(); y++) {
	                int inputRGB = OperationUtilities.getRGB(x, y, inputImage);
	                int outputRGB = OperationUtilities.negative(inputRGB);
	                OperationUtilities.setRGB(x, y, outputRGB, inputImage);
	            }
	        }
	        return inputImage;
	    }

}
