package assignment1images;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8221242098816095420L;
	private JButton button = new JButton("Open");
	
	public ButtonPanel (Controller controller) {
		add(this.button);
		this.button.addActionListener((ev) -> controller.openImage());
	}

}
