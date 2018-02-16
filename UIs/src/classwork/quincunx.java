package classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Feb 13, 2018**/

public class quincunx {
	
	public static int max(int[] x) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int balls = in.nextInt();
		System.out.print("Enter a number of slots: ");
		int[] slots = new int[in.nextInt()]; //default values are 0s
		in.close();
		Random ran = new Random();
		for (int i = 0; i < balls; i++) {
			String result = "";
			int slot = 0;
			for (int j = 0; j < slots.length - 1; j++) {
				if (ran.nextBoolean() == true) {
					result += "R";
					slot++;
				} else {
					result += "L";
					
				}
			}
			slots[slot]++;
			System.out.println(result); //print out L/R combo
		}
				
		//Histogram
		System.out.println();
		int height = max(slots);
		for (int i = height; i > 0; i--) {
			for (int j = 0; j < slots.length; j++) {
				if (slots[j] >= i) {
					System.out.print("0");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.toString(slots));
		
		System.out.println("\nThe Mean is " + Statistics.mean(slots));
		System.out.println("The Standard Deviation " + Statistics.deviation(slots));
		
	}

}
