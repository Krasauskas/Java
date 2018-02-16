package classwork;

import java.util.Random;

/**Created by V Krasauskas
/**
/**Created on Feb 13, 2018**/

public class OpeningProblem {

	public static void main(String[] args) {
		
		Random ran = new Random();
		double[] arr = new double[100];
		double sum = 0;
		for (int i = 0; i < 100; i++) {
			arr[i] = ran.nextDouble() * ran.nextInt(100);
			sum += arr[i];
		}
		double avg = sum / 100;
		System.out.println("Array of generated numbers: ");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%.2f ", arr[i * 10 + j]);
			}
			System.out.println();
		}
		System.out.println("Average number is " + avg);
		int higherThanAvg = 0;
		for (int i = 0; i < 100; i++) {
			if (arr[i] > avg) {
				higherThanAvg++;
			}
		}
		System.out.println("There are " + higherThanAvg + " numbers that are higher than the average");
	}

}
