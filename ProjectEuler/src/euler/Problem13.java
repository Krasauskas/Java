package euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Problem13 {
	
	static int rows = 100;
	static int cols = 50;

	
	static String[] getStringArray() {
		String fileName = "src/files/100_numbers_50_digit_long";
		String[] stringNums = new String[rows];
		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int row = 0;
			while (row < rows) {
				stringNums[row] = bufferedReader.readLine();
				row++;
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		return stringNums;
	}

	static int[][] getInts(String[] numms) {
		
		int[][] ints = new int[rows][cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				ints[row][col] = Integer.parseInt(numms[row].substring(col, col + 1));
			}
		}
		return ints;
	}
	
	public static void main(String[] args) {

//		System.out.println(Arrays.deepToString(getInts(getStringArray())));
		int[][] nums = getInts(getStringArray());
		int[] sum = new int[51];
		int colSum = 0;
		int col = 0;
		int row = 0;
		for (col = cols - 1; col >= 0; col--) {
			colSum = colSum / 10;
			for(row = 0; row < rows; row++) {
				colSum += nums[row][col];
			}
			sum[col + 1] = colSum % 10;
		}
		sum[0] = colSum / 10;
		
		System.out.println(Arrays.toString(sum));
	}

}
