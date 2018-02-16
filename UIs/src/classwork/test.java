package classwork;

import java.util.Scanner;

public class test {

	static String str = "1";

	public static void main(String[] args) {

		System.out.println("How many rows do you want?");
		Scanner in = new Scanner(System.in);
		int row = in.nextInt(); // Number of rows

		int spaces = row - 1; // Number of spaces

		int numPrint = 1; // We'll use this to set the new number on outer string

		for (int x = 0; x < row; x++) { // Loop to go through each row

			for (int y = 0; y < spaces; y++) { // Loop to print all the spaces for this line

				System.out.print(" ");
			}

			System.out.print(str); // print the string

			numPrint++; // add one to the outside number on line

			String outNums = Integer.toString(numPrint); // cast the outer number to a string

			str = outNums + str + outNums; // build new string

			spaces -= 1; // subtract 1 space for the next line

			System.out.println(); // move to next line

		}

	}
}
