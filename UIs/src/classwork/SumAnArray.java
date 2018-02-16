package classwork;

import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Feb 13, 2018**/

public class SumAnArray {
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static double sum(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 irrational values:");
		double[] arr = new double[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Value " + (i + 1) + ": ");
			arr[i] = in.nextDouble();
		}
		in.close();
		System.out.println("The sum of all numbers is " + sum(arr));
	}

}
