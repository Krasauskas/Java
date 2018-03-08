package classwork;

/**Created by V Krasauskas
/**
/**Created on Mar 7, 2018**/

public class Faculty extends Employee {
	
	int officeHours;
	String rank;
	String name;

	public Faculty(String name, String address, String phone, String email, String office, int salary, int officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
		this.name = name;
	}
	
	public String toString() {
		return "Faculty " + name;
	}

}
