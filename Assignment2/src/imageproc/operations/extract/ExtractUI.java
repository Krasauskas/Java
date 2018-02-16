package imageproc.operations.extract;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import imageproc.operations.ColourComponent;

public class ExtractUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6716278564859809028L;
	
	private final JRadioButton rButton = new JRadioButton("Red");
    private final JRadioButton gButton = new JRadioButton("Green");
    private final JRadioButton bButton = new JRadioButton("Blue");
    
    private ColourComponent selectedColor = ColourComponent.RED;

    
	public ExtractUI() {
		super(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.add(rButton);
        radioPanel.add(gButton);
        radioPanel.add(bButton);

        // make radio buttons mutually exclusive
        ButtonGroup bg = new ButtonGroup();
        bg.add(rButton);
        bg.add(gButton);
        bg.add(bButton);

        rButton.setSelected(true);

        rButton.addActionListener((ev) -> colourChosen(ColourComponent.RED));
        gButton.addActionListener((ev) -> colourChosen(ColourComponent.GREEN));
        bButton.addActionListener((ev) -> colourChosen(ColourComponent.BLUE));

        add(radioPanel, BorderLayout.CENTER);
    }
	
	private void colourChosen(ColourComponent colour) {
        this.selectedColor = colour;
    }

    public ColourComponent getChosenColor() {
        return this.selectedColor;
    }


}
