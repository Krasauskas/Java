package classwork;

/**Created by V Krasauskas
/**
/**Created on Mar 5, 2018**/

public class Person {
	
	String name, address, phone, email;
	
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return "Person " + name;
	}

}
