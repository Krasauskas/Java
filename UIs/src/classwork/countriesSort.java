package classwork;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class countriesSort {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<String> cities = new LinkedList<String>();
		System.out.print("Enter the first city name: ");
		cities.add(in.nextLine());
		System.out.print("\nEnter the second city name: ");
		cities.add(in.nextLine());
		Collections.sort(cities);
		in.close();
		System.out.println("Alphabetically sorted cities:");
		for(String city:cities) {
			System.out.println(city);
		}

	}

}
