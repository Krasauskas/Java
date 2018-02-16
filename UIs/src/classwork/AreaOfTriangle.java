package classwork;

import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Feb 13, 2018**/

public class AreaOfTriangle {
	
	public static double sqr(double a) {
		return a * a;
	}
	
	public static double getTriangleArea(double[][] points) {
		double area = 0;
		double side1, side2, side3;
		side1 = Math.sqrt(sqr(points[1][0] - points[0][0]) + sqr(points[1][1] - points[0][1]));
		side2 = Math.sqrt(sqr(points[1][0] - points[2][0]) + sqr(points[1][1] - points[2][1]));
		side3 = Math.sqrt(sqr(points[2][0] - points[0][0]) + sqr(points[2][1] - points[0][1]));
		System.out.println(side1 + " " + side2 + " " + side3);
		double s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double[][] arr = new double[3][2];
		System.out.print("Enter point A(x;y): ");
		arr[0][0] = in.nextDouble();
		arr[0][1] = in.nextDouble();
		System.out.print("Enter point B(x;y): ");
		arr[1][0] = in.nextDouble();
		arr[1][1] = in.nextDouble();
		System.out.print("Enter point C(x;y): ");
		arr[2][0] = in.nextDouble();
		arr[2][1] = in.nextDouble();
		in.close();
		System.out.println("The area of the triangle is " + getTriangleArea(arr));
	}

}
