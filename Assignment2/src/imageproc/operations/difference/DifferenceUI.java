package imageproc.operations.difference;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DifferenceUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1794204212459186129L;
	private final JTextField otherImagePath = new JTextField(60);
	private final JButton fileChooserButton = new JButton("Open");

	private final JFileChooser chooser;
	private File file;

	public DifferenceUI(JFileChooser chooser) {
		super(new BorderLayout());

		this.chooser = chooser;

		JPanel pathPanel = new JPanel();
		pathPanel.add(otherImagePath);
		pathPanel.add(fileChooserButton);
		pathPanel.setBorder(BorderFactory.createTitledBorder("Image to get the difference from"));

		add(pathPanel, BorderLayout.NORTH);

		otherImagePath.setEditable(false);

		fileChooserButton.addActionListener(ev -> showChooser());
	}

	private void showChooser() {
		if (this.chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			this.file = this.chooser.getSelectedFile();
			otherImagePath.setText(file.getPath());
		}
	}
	
	public File getOtherImagePath() {
        return this.file;
    }

}
