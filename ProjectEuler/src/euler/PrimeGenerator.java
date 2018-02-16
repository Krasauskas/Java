package euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 16, 2018
 **/

public class PrimeGenerator {

	public static Integer[] primes(int limit) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < (limit / 2 + 1); i++) {
			boolean prime = true;
			if (i % 2 == 0) {
				prime = false;
			} else {
				for (int j = 3; j * j < (i / 2 + 1); j += 2) {
					if (i % j == 0) {
						prime = false;
					}
				}
			}
			if (prime = true) {
				list.add(i);
			}
		}
		Integer[] arr = new Integer[list.size()];
		return list.toArray(arr);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the limit to find primes: ");
		int limit = in.nextInt();
		in.close();
		Integer[] array = primes(limit);
		System.out.println("The primes are:\n" + Arrays.toString(array));
	}

}
