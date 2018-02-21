package euler;

/**Created by V Krasauskas
/**
/**Created on Feb 21, 2018**/

public class Problem9 {

	public static void main(String[] args) {

		for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				for (int c = b + 1; c < 1000; c++) {
					if (a * a + b * b == c * c) {
						if (a + b + c == 1000) {
							System.out.println(a + " x " + b + " x " + c + " = " + (a * b * c));
						}
					}
				}
			}
		}
	}

}
