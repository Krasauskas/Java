package classwork;

import java.util.Arrays;
import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Feb 6, 2018**/

public class phonepad {
	
	private static String[][] letters = {
			{"a", "b", "c"},
			{"d", "e", "f"},
			{"g", "h", "i"},
			{"j", "k", "l"},
			{"m", "n", "o"},
			{"p", "q", "r", "s"},
			{"t", "u", "v"},
			{"w", "x", "y", "z"}
	};

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = in.nextLine();
		in.close();
		
		for (int i = 0; i < 8; i++) {
			if (Arrays.asList(letters[i]).contains(letter)) {
				System.out.println("Letter " + letter + " is on number " + (i + 2)); //offset of two because the phonepad starts at 2
			}
		}
	}

}
