package euler;

<<<<<<< HEAD
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
=======
public class Problem12 {

	static int numOfDivisors(long number) { //finding number of divisors using prime factorization.
		int divisor = 2; // starting divisor
		int nod = 1; // number of divisors
		while (number > 1) {
			int count = 0; // number of divisors of current number in the cycle
			while (number % divisor == 0) {
				number = number / divisor;
				count++;
			}
			nod = nod * (count + 1);
			divisor++;
		}
		return nod;
	}

	public static void main(String[] args) {
		
		StopWatch.start();
		
		long number = 1;
		int counter = 2;
		while (numOfDivisors(number) < 500) {
			number += counter;
			counter++;
		}
		
		StopWatch.stop();
		long time = StopWatch.getElapsedTime();
		System.out.println(number + " " + counter + ". Answer found in " + time + "ms.");
>>>>>>> branch 'master' of https://github.com/Krasauskas/Java
	}

}
