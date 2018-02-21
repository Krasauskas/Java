package euler;

public class Problem6 {
	
	static int sumOfSquares() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		return sum;
	}
	
	static int squareOfSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum * sum;
	}

	public static void main(String[] args) {
		
		int sum = sumOfSquares();
		int square = squareOfSum();
		System.out.println("The sum of squares is " + sum);
		System.out.println("The square of the sum is " + square);
		System.out.println("The difference between the two is " + (square - sum));
		
	}

}
