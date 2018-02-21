package euler;

/**
 * Created by V Krasauskas /** /**Created on Feb 20, 2018
 **/

public class Problem5 {

	public static void main(String[] args) {

		boolean divisible = false;
		int number = 1;
		int numOfFactors;
		while (divisible == false) { //iterate through number while it's not divisible 
			numOfFactors = 0;
			number++;
			for (int factor = 20; factor > 0; factor--) { //check if number is divisible
				if (number % factor == 0) {
					numOfFactors++;
				} else {
					break; //quit checking on first fail
				}
			}
			if (numOfFactors == 20) { //breaks the while loop if number divisible by everything up to 20
				divisible = true;
			}
		}
		System.out.println("Smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + number);
	}

}
