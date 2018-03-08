package classwork;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Mar 7, 2018
 **/

public class LargestRowsAndColumns {

	public static void main(String[] args) {

		System.out.print("Enter the array size n: ");
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		int size = in.nextInt();
		in.close();
		int[][] arr = new int[size][size]; // array of random numbers
		int[] sumRow = new int[size]; // array of row sums
		int[] sumCol = new int[size]; // array of column sums
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				arr[row][col] = ran.nextInt(2); // array generation
				sumRow[row] += arr[row][col]; // sum of rows
				sumCol[col] += arr[row][col]; // sum of cols
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}

		// get the first index with the highest count in rows
		int max = 0;
		int counter = 0;
		int index = 0;
		for (int a : sumRow) {
			if (a > max) {
				max = a;
				index = counter;
			}
			counter++;
		}

		// checking for multiple indexes with the same count
		System.out.print("Indexes of largest rows: ");
		for (int a = index; a < size; a++) {
			if (sumRow[a] == max) {
				System.out.print(a + " ");
			}
		}
		System.out.println();

		// get first index with the highest count in columns
		max = 0;
		counter = 0;
		index = 0;
		for (int a : sumCol) {
			if (a > max) {
				max = a;
				index = counter;
			}
			counter++;
		}

		// checking for multiple indexes with the same count
		System.out.print("Indexes of largest columns: ");
		for (int a = index; a < size; a++) {
			if (sumCol[a] == max) {
				System.out.print(a + " ");
			}
		}
	}

}
