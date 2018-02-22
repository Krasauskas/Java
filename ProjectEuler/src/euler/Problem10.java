package euler;

/**
 * Created by V Krasauskas /** /**Created on Feb 22, 2018
 **/

public class Problem10 {

	static boolean isPrime(long num) {
		for (long i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		long sum = 0;
		for (int i = 2; i < 2000000; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
