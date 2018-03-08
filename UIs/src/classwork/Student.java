package classwork;

/**Created by V Krasauskas
/**
/**Created on Mar 5, 2018**/

public class Student extends Person {
	
	String name;

	public Student(String name, String address, String phone, String email, String studentStatus) {
		super(name, address, phone, email);
		final String status = studentStatus;
		this.name = name;
	}
	
	public String toString() {
		return "Student " + name;
	}

}
