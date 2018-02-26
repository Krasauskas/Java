package euler;

/**
 * Created by V Krasauskas /** /**Created on Feb 23, 2018
 **/

public class Problem12 {

	private static long next = 1;
	private static int numOfDiv = 0;

	static int numOfDivisors(long num) {
		numOfDiv = 0; // num of divisors
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				numOfDiv++;
			}
		}
		return numOfDiv;
	}

	public static void main(String[] args) {

		int counter = 2;
		while (true) {
			if (numOfDivisors(next) > 500) {
				break;
			}
			next += counter;
			counter++;
//			if (counter % 1000 == 0) {
//				System.out.println(next + " has " + numOfDiv + " divisors. Counter = " + counter);
//			}
		}
		System.out.println("The first triangle number with more than 500 divisors is " + next + " with " + numOfDiv
				+ " divisors.");
	}

}
