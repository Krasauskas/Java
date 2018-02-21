package euler;

public class Problem7 {
	
	static boolean isPrime(long num) {
		for (long i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int counter = 0;
		int number = 1;
		while (counter < 10001) {
			number++;
			if (isPrime(number)) {
				counter++;
			}
		}
		System.out.println("10 001st prime is " + number);
	}

}
