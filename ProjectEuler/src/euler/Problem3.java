package euler;

/**Created by V Krasauskas
/**
/**Created on Feb 16, 2018**/

public class Problem3 {

	public static void main(String[] args) {

		long numba = 6008514751L;
		final long start = System.currentTimeMillis();
		Long[] array = PrimeGenerator.getPrimes(numba / 2);
		for (int i = array.length - 1; i >= 0; i--) {
			if (numba % array[i] == 0) {
				System.out.println("Prime factor found: " + array[i]);
			}
		}
		final long stop = System.currentTimeMillis();
		System.out.println("Execution time was " + (stop - start) + "ms.");
	}

}
