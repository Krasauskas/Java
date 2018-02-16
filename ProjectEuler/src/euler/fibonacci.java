package euler;

import javax.swing.JOptionPane;

public class fibonacci {
	
	public static void main(String[] args) {
		
		long first = 0;
		long second = 1;
		String input = JOptionPane.showInputDialog("Enter number: ");
		int numba = Integer.parseInt(input);
		for (int i = 1; i < numba; i++) {
			long temp = second;
			second = first + second;
			first = temp;
		}
		JOptionPane.showMessageDialog(null, "The " + numba +"th member of the sequence is " + first);
	}
}
