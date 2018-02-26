package euler;

public class Problem14 {

	static int counter;
	static long startingNumber;

	static boolean isEven(long number) {
		if (number % 2 == 0) {
			return true;
		} else
			return false;
	}

	static long nextNum(long number) {
		if (isEven(number)) {
			return number / 2;
		} else
			return (3 * number + 1);
	}

	public static void main(String[] args) {
		
		long longestChainNumber = 0;
		int chainLength = 0;
		startingNumber = 1;

		while (startingNumber < 1000000) {
			counter = 1;
			long number = startingNumber;
			System.out.println(startingNumber);
			while (number != 1) {
				number = nextNum(number);
				counter++;
			}
			if (counter > chainLength) {
				chainLength = counter;
				longestChainNumber = startingNumber;
			}
			startingNumber++;
		}
		System.out.println(longestChainNumber + " has the longest chain of " + chainLength);
	}

}
