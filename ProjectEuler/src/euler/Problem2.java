package euler;

/**Created by V Krasauskas
/**
/**Created on Feb 16, 2018**/

public class Problem2 {

	public static void main(String[] args) {

		double one = 1;
		double two = 2;
		double sum = 2; //two is already provided
		int limit = 4000000;
		System.out.print(one + "\n" + two + "\n");
		while (two < limit) {
			double temp = two;
			two += one;
			one = temp;
			System.out.println(two);
			if (two % 2 == 0) {
				sum += two;
			}
		}
		System.out.println("Sum is " + sum);
	}

}
