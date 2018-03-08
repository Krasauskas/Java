package classwork;

/**Created by V Krasauskas
/**
/**Created on Mar 7, 2018**/

public class Staff extends Employee {

	String title;
	String name;
	
	public Staff(String name, String address, String phone, String email, String office, int salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
		this.name = name;
	}
	
	public String toString() {
		return "Staff " + name;
	}

}
