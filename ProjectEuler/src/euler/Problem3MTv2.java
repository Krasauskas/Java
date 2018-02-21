package euler;

import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 19, 2018
 **/

class ThreadTest extends Thread {

	long limit;
	int decrement;
	int offset;
	String threadName;
	long startTime = System.currentTimeMillis();

	ThreadTest(String name, int off, long num, int dec) {
		threadName = name;
		limit = num;
		offset = off;
		decrement = dec;
	}

	boolean isPrime2(long num) {
		for (long i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	boolean isPrime(long num) {
		for (long i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void run() {
		long half = limit / 2 - offset;
		for (long i = half; i > 0; i -= decrement) {
			if(limit % i == 0) { //is a factor
				if (isPrime2(i)) { //check if that factor is prime
					System.err.println(threadName + ":: Prime factor found: " + i);
				}
			}
		}
		System.out.println(threadName + " runtime: " + (System.currentTimeMillis() - startTime) + "ms.");
	}
}

public class Problem3MTv2 {
	public static void main(String[] args) {
		
		long limit; // max limit to find primes till
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 0 for test number (1319517) or 1 for project euler number (600851475143): ");
		if (in.nextInt() == 0) {
			limit = 1319517;
		} else {
			limit = 60085147514L;
		}
		in.close();

		int numOfThreads = 8;
		long now = System.currentTimeMillis();
		for (int i = 0; i < numOfThreads; i++) {
			ThreadTest thread = new ThreadTest("Thread " + i, i, limit, numOfThreads);// this launches ThreadTest constructor, which then calls run(). numOfThreads is the decrement
			thread.start();
		}
		System.out.println(System.currentTimeMillis() - now + "ms.");

	}

}
