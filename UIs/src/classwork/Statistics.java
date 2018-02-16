package classwork;

import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 13, 2018
 **/

public class Statistics {

	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;

	}

	public static double deviation(double[] x) {
		double sum = 0;
		double mean = mean(x);
		for (int i = 0; i < x.length; i++) {
			sum += sqr(x[i] - mean);
		}
		return Math.sqrt(sum / (x.length - 1));

	}
	
	//This is for quincunx
	public static double mean(int[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;

	}
	
	//This is for quincunx
	public static double deviation(int[] x) {
		double sum = 0;
		double mean = mean(x);
		for (int i = 0; i < x.length; i++) {
			sum += sqr(x[i] - mean);
		}
		return Math.sqrt(sum / (x.length - 1));

	}

	public static double sqr(double a) {
		return a * a;
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
		System.out.println("The mean is " + mean(arr));
		System.out.println("The standard deviation is " + deviation(arr));
	}

}
