package classwork;

import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 20, 2018
 **/

public class Palindrome {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		in.close();
		int length = s.length();
		int arrSize = length / 2 + 1;
		boolean[] p = new boolean[arrSize];
		for (int i = 0; i <= length / 2; i++) {
			if (s.charAt(i) == s.charAt(length - 1 - i)) {
				p[i] = true;
			} else {
				p[i] = false;
			}
		}
		boolean isPalindrome = true;;
		for (boolean a:p) {
			if(a == false) {
				isPalindrome = false;
			}
		}
		System.out.println(s + " is a palindrome: " + isPalindrome);

	}

}
