package classwork;

import javax.swing.JOptionPane;

public class tutorial1 {
	
	static boolean isInt(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}

	
	public static int gcd(int num1, int num2) {
		int divisor = num1;
		for (int i = num1; i > 0; i--) {
			if (isInt(num1, i)) {
				if (isInt(num2,num1/i)) {
					divisor = num1/i;
				}
			}
		}
		return divisor;
	}

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter the first number:");
		int num1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter the second number:");
		int num2 = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "The GCD is " + gcd(num1, num2));
		
	}

}
