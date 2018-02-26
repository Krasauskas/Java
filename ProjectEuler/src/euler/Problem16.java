package euler;

import java.math.BigDecimal;

/**Created by V Krasauskas
/**
/**Created on Feb 24, 2018**/

public class Problem16 {
	static String raiseToPower(int a, int i) {
		double product = 1;
		for (int j = 1; j <= i; j++) {
			product *= a;
		}
		BigDecimal bd = new BigDecimal(product);
		return bd.toString();
	}

	public static void main(String[] args) {

		String num = raiseToPower(2, 1000);
		int sum = 0;
		int length = num.length();
		for (int i = 0; i < length; i++) {
			sum += Integer.parseInt(num.substring(i, i + 1));
		}
		System.out.println(sum);
	}

}
