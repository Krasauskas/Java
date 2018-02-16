package classwork;

import javax.swing.JOptionPane;

public class tutorial2 {

	public static void main(String[] args) {
		
		int failed = 0, passed = 0, sum = 0;
		for (int i = 0; i < 10; i++) {
			String input = JOptionPane.showInputDialog("Enter the grade:");
			int grade = Integer.parseInt(input);
			sum += grade;
			if (grade < 50) {
				failed++;
			} else {
				passed++;
			}
		}
		int avg = sum/10;
		JOptionPane.showMessageDialog(null, "The average grade is " + avg +"\n" + passed + " have passed, " + failed + " have failed.");

	}

}
