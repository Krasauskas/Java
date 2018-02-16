package classwork;

import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Feb 6, 2018**/

public class MajorAndStatus {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String input = in.nextLine();
		in.close();

		String char1 = input.substring(0, 1).toLowerCase();
		String char2 = input.substring(1, 2);
		int num = Integer.parseInt(char2);
		
		switch(char1) {
		case "i": 
			System.out.print("Information Management ");
			break;
		case "c": 
			System.out.print("Computer Science ");
			break;
		case "a":
			System.out.print("Accounting ");
			break;
		default:
			System.err.println("Department not found.");
			break;
		}
		
		switch(num) {
		case 1:
			System.out.println("Freshman");
			break;
		case 2:
			System.out.println("Junior");
			break;
		case 3:
			System.out.println("Senior");
			break;
		default:
			System.err.println("Year incorrect.");
			break;
		}

	}

}
