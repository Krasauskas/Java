package classwork;

import java.util.Scanner;

public class triangles {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double[][] coord = new double[3][2];
		
		//getting the coordinates
		for (int i = 0; i < 3; i++) {
			System.out.print("\nEnter the coordinates for corner " + (i + 1) +": ");
			coord[i][0] = in.nextDouble();
			coord[i][1] = in.nextDouble();
		}
		in.close();
		
		//checking if values are stored correctly
		System.out.println("\nEntered coordinates:");
		for (int i = 0; i < 3; i++) {
			System.out.println(coord[i][0] + ", " + coord[i][1]);
		}
		
		//getting  the lengths of the sides
		double[] sides = new double[3];
		sides[0] = Math.sqrt(sqr(coord[2][0] - coord[1][0]) + sqr(coord[2][1] - coord[1][1]));
		sides[1] = Math.sqrt(sqr(coord[2][0] - coord[0][0]) + sqr(coord[2][1] - coord[0][1]));
		sides[2] = Math.sqrt(sqr(coord[1][0] - coord[0][0]) + sqr(coord[1][1] - coord[0][1]));
		
		//checking if sides calculated  correctly
		System.out.println("\nCalculated sides a, b and c:");
		for (int i = 0; i < 3; i++) {
			System.out.println(sides[i]);
		}
		
		//calculating the corners
		double cornerA = Math.acos((sqr(sides[0]) - sqr(sides[1]) - sqr(sides[2])) / (-2 * sides[1] * sides[2]));
		double cornerB = Math.acos((sqr(sides[1]) - sqr(sides[0]) - sqr(sides[2])) / (-2 * sides[0] * sides[2]));
		double cornerC = Math.acos((sqr(sides[2]) - sqr(sides[1]) - sqr(sides[0])) / (-2 * sides[0] * sides[1]));
		cornerA = Math.toDegrees(cornerA);
		cornerB = Math.toDegrees(cornerB);
		cornerC = Math.toDegrees(cornerC);
		
		System.out.println("\nCalculated corners A, B and C: \n" + cornerA + "\n" + cornerB + "\n" + cornerC);
		
	}
	
	public static double sqr(double a) {
		return a * a;
	}

}
