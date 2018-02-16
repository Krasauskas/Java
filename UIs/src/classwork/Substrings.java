package classwork;

import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Feb 6, 2018**/

public class Substrings {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = in.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = in.nextLine();
		in.close();
		
		if (s1.contains(s2)) {
			System.out.println(s2 + " is a substring of " + s1);
		} else {
			System.out.println(s2 + " is not a substring of " + s1);
		}
	}

}
