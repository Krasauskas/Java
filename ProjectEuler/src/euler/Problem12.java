package euler;

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
	}

}
