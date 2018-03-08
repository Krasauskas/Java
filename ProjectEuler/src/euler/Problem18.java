package euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**Created by V Krasauskas
/**
/**Created on Feb 26, 2018**/

public class Problem18 {
	
	static int[][] getArray() {
		String fileName = "src/files/problem18array";
		int[][] numms = new int[15][];
		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int row = 0;
			while (row < 15) {
				String line = bufferedReader.readLine();
				line.replace(" ", "");
				System.out.println(line);
				int[] temp = new int[(line.length() / 2)];
				for (int col = 0; col < line.length() / 2; col++) {
					String num = line.substring(col, (col + 2));
					temp[col] = Integer.parseInt(num);
				}
				numms[row] = temp;
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

	public static void main(String[] args) {

		System.out.println(Arrays.deepToString(getArray()));
	}

}
