package classwork;

import java.util.Arrays;
import java.util.Random;

/**Created by V Krasauskas
/**
/**Created on Feb 20, 2018**/

public class StopWatch {
	
	 long startTime, endTime;
	
	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}

	public static void main(String[] args) {

		Random ran = new Random();
		int[] numbers = new int[100000];
		for (int i = 0; i < 100000; i++) {
			numbers[i] = ran.nextInt(1000000);
		}
		StopWatch sw = new StopWatch();
		Arrays.sort(numbers);
		sw.stop();
		System.out.println("Time spent sorting: " + sw.getElapsedTime() + "ms.");
	}

}
