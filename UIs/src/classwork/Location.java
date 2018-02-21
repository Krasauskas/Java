package classwork;

import java.util.Arrays;
import java.util.Random;

/**Created by V Krasauskas
/**
/**Created on Feb 20, 2018**/

public class Location {
	
	public int row, column;
	public double maxValue;
	
	Location(double maxValue, int row, int column) {
		this.maxValue = maxValue;
		this.row = row;
		this.column = column;
	}
	
	public static Location locateLargest(double[][] a) {
		int x = 0;
		int y = 0;
		double maxValue = 0;
		for (int i = 0; i < a.length; i++ ) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					x = i;
					y = j;
				}
			}
		}
		return new Location(maxValue, x, y);
	}
	
	public String toString() {
		return maxValue + " at [" + row + "," + column +"]";
	}

	public static void main(String[] args) {

		Random ran = new Random();
		
		//Generating a random size array with random values
		int rows = ran.nextInt(10) + 1;
		int cols = ran.nextInt(10) + 1;
		double[][] arr = new double[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = ran.nextDouble() * (ran.nextInt(99) + 1);
			}
		}
		
		System.out.println("Generated array: " + rows + " x " + cols);
		for (int i = 0; i < rows; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		Location test = locateLargest(arr);
		System.out.println("Largest value: " + test.toString());
	}

}
