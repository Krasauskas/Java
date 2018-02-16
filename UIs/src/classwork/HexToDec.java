package classwork;

import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Feb 6, 2018**/

public class HexToDec {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a hex number: ");
		String hex = in.nextLine();
		in.close();
		
		int dec = Integer.parseInt(hex, 16);
		System.out.println("Converted to decimal " + hex + " is " + dec);

	}

}
