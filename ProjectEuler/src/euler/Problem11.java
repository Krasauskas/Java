package euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by V Krasauskas /** /**Created on Feb 22, 2018
 **/

public class Problem11 {

	static int[][] getArray() {
		String fileName = "src/files/numArray";
		int[][] numms = new int[20][20];
		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int row = 0;
			while (row < 20) {
				String line = bufferedReader.readLine();
				int charPos = 0;
				for (int col = 0; col < 20; col++) {
					String num = line.substring(charPos, (charPos + 2));
					charPos += 3;
					numms[row][col] = Integer.parseInt(num);
				}
				row++;
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		return numms;
	}

	static int[] horizontal(int[][] numms) {
		int[] max = new int[3];
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 16; col++) {
				int a = numms[row][col] * numms[row][col + 1] * numms[row][col + 2] * numms[row][col + 3];
				if (a > max[0]) {
					max[0] = a;
					max[1] = row;
					max[2] = col;
				}
			}
		}
		return max;
	}

	static int[] vertical(int[][] numms) {
		int[] max = new int[3];
		for (int col = 0; col < 20; col++) {
			for (int row = 0; row < 16; row++) {
				int a = numms[row][col] * numms[row + 1][col] * numms[row + 2][col] * numms[row + 3][col];
				if (max[0] < a) {
					max[0] = a;
					max[1] = row;
					max[2] = col;
				}
			}
		}
		return max;
	}

	static int[] diagDown(int[][] numms) {
		int[] max = new int[3];

		for (int row = 0; row < 17; row++) { // to the right and down
			for (int col = 0; col < 16; col++) {
				int a = 0;
				a = numms[row][col] * numms[row + 1][col + 1] * numms[row + 2][col + 2] * numms[row + 3][col + 3];
				if (a > max[0]) {
					max[0] = a;
					max[1] = row;
					max[2] = col;
				}
			}
		}
		return max;
	}

	static int[] diagUp(int[][] numms) {
		int[] max = new int[3];

		for (int row = 19; row > 2; row--) {
			for (int col = 0; col < 16; col++) {
				int a = 0;
				a = numms[row][col] * numms[row - 1][col + 1] * numms[row - 2][col + 2] * numms[row - 3][col + 3];
				if (a > max[0]) {
					max[0] = a;
					max[1] = row;
					max[2] = col;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[][] array = getArray();
		System.out.println("Array read successfully.");
		int[] a = horizontal(array);
		System.out.println("Horizontal cheching finished.");
		int[] b = vertical(array);
		System.out.println("Vertical checking finished.");
		int[] c = diagDown(array);
		System.out.println("Diagonal down checking finished.");
		int[] d = diagUp(array);
		System.out.println("Diagonal up checking finished.");
		
		int[] max = a;
		String s = "horizontally";
		if (b[0] > max[0]) {
			max = b;
			s = "vertically";
		}
		if (c[0] > max[0]) {
			max = c;
			s = "diagonally downwards";
		}
		if (d[0] > max[0]) {
			max = d;
			s = "diagonally upwards";
		}
		
		System.out.println("The highest product is produced going " + s +".");
		System.out.println("The product is " + max[0] + ", starting at [" + max[1] + ";" + max[2] +"].");
	}

}
