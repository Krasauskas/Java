package classwork;

import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 13, 2018
 **/

public class LinearEquations {

	public static double[] linearEquation(double[][] a, double[] b) {
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			return null;
		} else {
			double[] x = new double[2];
			x[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
			x[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
			return x;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a\u2080\u2080, a\u2080\u2081, a\u2081\u2080 and a\u2081\u2081: ");
		double[][] a = new double[2][2];
		double[] b = new double[2];
		a[0][0] = in.nextDouble();
		a[0][1] = in.nextDouble();
		a[1][0] = in.nextDouble();
		a[1][1] = in.nextDouble();
		System.out.println("Enter b\u2080 and b\u2081");
		b[0] = in.nextDouble();
		b[1] = in.nextDouble();
		in.close();

		double[] arr = linearEquation(a, b);
		if (arr == null) {
			System.out.println("The equation has no solution.");
		} else {
			System.out.println("x = " + arr[0]);
			System.out.println("y = " + arr[1]);
		}
	}

}
