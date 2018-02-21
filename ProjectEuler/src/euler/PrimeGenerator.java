package euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 16, 2018
 **/

public class PrimeGenerator {
	
	public static boolean isPrime(long num) {
		boolean prime = true;
		for (long i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	public static Long[] getPrimes(long num) { //starts in the middle of the number, going downwards
		List<Long> longs = new ArrayList<Long>();
		for (long i = num / 2; i > 0; i--) {
			if (isPrime(i)) {
				longs.add(i);
			}
		}
		Long[] arr = new Long[longs.size()];
		return longs.toArray(arr);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the limit to find primes: ");
		int limit = in.nextInt();
		in.close();
		Long[] array = getPrimes(limit);
//		Integer[] array2 = primes(limit);
		System.out.println("The primes are:\n" + Arrays.toString(array));
		int i = 1;
		for (long a:array) {
			if (i % 20 == 0) {
				System.out.println();
				i = 1;
			}
			System.out.print(a + " ");
			i++;
		}
//		System.out.println("Array2: " + Arrays.toString(array2));
	}

}
