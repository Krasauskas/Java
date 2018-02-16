package classwork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 13, 2018
 **/

public class QuadraticEquation {

	public static double discriminant(double[] abc) {
		return sqr(abc[1]) - 4 * abc[0] * abc[2];
	}

	public static double sqr(double a) {
		return a * a;
	}

	public static double[] solveQuadratic(double[] eqn) {

		double[] roots = new double[2];
		roots[0] = ((eqn[1] * (-1) + Math.sqrt(sqr(eqn[1]) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]));
		roots[1] = ((eqn[1] * (-1) - Math.sqrt(sqr(eqn[1]) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]));
		return roots;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double[] arr = new double[3];

		System.out.println("ax\u00B2 + bx + c = 0");
		System.out.print("Enter a: ");
		arr[0] = in.nextDouble();
		System.out.print("Enter b: ");
		arr[1] = in.nextDouble();
		System.out.print("Enter c: ");
		arr[2] = in.nextDouble();
		in.close();
		if (discriminant(arr) < 0) {
			System.out.println("There are no real solutions.");
		} else {
			double[] roots = solveQuadratic(arr);
			System.out.println("The solutions are: " + Arrays.toString(roots));
		}
	}

}
