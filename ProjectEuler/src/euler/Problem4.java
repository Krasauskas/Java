package euler;

/**
 * Created by V Krasauskas /** /**Created on Feb 20, 2018
 **/

public class Problem4 {

	static boolean isPalindrome(int num) {
		String s = String.valueOf(num);
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
		boolean isPalindrome = true;
		;
		for (boolean a : p) {
			if (a == false) {
				isPalindrome = false;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {

		int max = 0;

		for (int i = 99; i < 999; i++) {
			for (int j = 99; j < 999; j++) {
				if (isPalindrome(i * j)) {
					if ((i * j) > max) {
						max = i * j;
						System.out.println("Palindrome found: " + (i * j) + " = " + i + " * " + j);
					}
				}
			}
		}
	}

}
