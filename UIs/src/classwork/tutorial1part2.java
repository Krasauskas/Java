package classwork;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class tutorial1part2 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter number of lines: ");
		int lines = Integer.parseInt(input);
		int cols = (lines*2)-1;
		int center = lines-1;
		String out = ""; //output string
		int[][] a = new int[lines][cols];
		
		int line,col;
		for (line = 0; line < lines; line++) {
			for (col = 0; col < cols; col++) {
				if ((col - center < 0) && (line + col >= center)) { //left side of center column
					a[line][col] = lines-col;
				}
				if (col - center == 0) { //center column
					a[line][col] = 1;
				}
				if ((col - center > 0) && (col - line <= center)){ //right side of center column
					a[line][col] = col-center+1;
				}
			}
		}
		
		//convert to String
		for (line = 0; line < lines; line++) {
			for (col = 0; col < cols; col++) {
				if (a[line][col] == 0) {
					out += "  "; // 3 spaces for JOptionPane, 2 spaces for console
				} else {
					out += a[line][col] + " ";
				}
			}
			out += "\n";
			System.out.println(Arrays.toString(a[line]));
		}
		System.out.println(out);

//		JOptionPane.showMessageDialog(null, out);
	}

}
