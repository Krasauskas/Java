package classwork;

/**
 * Created by V Krasauskas /** /**Created on Mar 7, 2018
 **/

public class Employee extends Person {

	String office;
	int salary;
	MyDate hired;
	String name;

	public Employee(String name, String address, String phone, String email, String office, int salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.hired = new MyDate();
		this.name = name;

	}
	
	public String toString() {
		return "Employee " + name;
	}

}
