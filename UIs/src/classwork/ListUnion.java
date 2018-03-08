package classwork;

import java.util.ArrayList;
import java.util.Scanner;

/**Created by V Krasauskas
/**
/**Created on Mar 8, 2018**/

public class ListUnion {
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}
		return list1;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		System.out.print("Enter the numbers of the first list: ");
		String input = in.nextLine();
		String[] str = input.trim().split(" ");
		for (String a:str) { //this should really be in a try catch block
			list1.add(Integer.valueOf(a));
		}
		
		System.out.print("Enter the numbers of the second list: ");
		input = in.nextLine();
		str = input.trim().split(" ");
		for (String a:str) {
			list2.add(Integer.valueOf(a));
		}
		
		in.close();
		
		System.out.println("The union of the 2 lists is " + union(list1, list2));
	}

}
