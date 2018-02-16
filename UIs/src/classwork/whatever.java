package classwork;

import java.util.Scanner;

public class whatever {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Gimme a numba");
		int n = in.nextInt();
		int a = 0;
		while (n > 0) {
			int temp = n % 10;
			a = a * 10 + temp;
			n = n/10;
		}
		System.out.println(a);
		in.close();

	}

}
