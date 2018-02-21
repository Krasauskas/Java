package euler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**Created by V Krasauskas
/**
/**Created on Feb 19, 2018**/
//First attempt at multithreading

//HANGS THE CPU

public class Problem3MT implements Runnable {
	
	private static final long limit = 1319517;
	Long[] primes;

	public static void main(String[] args) {


		long n1 = primeFactors();
		System.out.println("Time taken: " + n1 + "ms.");
	}
	
	private static long primeFactors() 
    {
    long now=System.currentTimeMillis();
    ExecutorService service=Executors.newFixedThreadPool(8); 

    for (long i = 3; i < limit; i +=2)
        {
        service.submit(new Problem3MT());
        }
    service.shutdown();
    return System.currentTimeMillis()-now;
    }

	@Override
	public void run() {

		boolean isPrime = PrimeGenerator.isPrime(limit);
	}

}
