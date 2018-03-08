package classwork;

/**Created by V Krasauskas
/**
/**Created on Mar 7, 2018**/

public class Ex2testClass {

	public static void main(String[] args) {

		Person person = new Person("Person name", "Person address", "Person phone", "Person email");
		Student student = new Student("Student name", "Student address", "Student phone", "Student email", "Sophomore");
		Employee emp = new Employee("Emp name", "Emp address", "Emp phone", "Emp email", "Emp  office", 50000);
		Faculty faculty = new Faculty("Faculty name", "Faculty address", "Faculty Phone", "Faculty email", "Faculty office", 40000, 8, "Faculty rank");
		Staff staff = new Staff("Staff name", "Staff address", "Staff phone", "Staff email", "Staff office", 25000, "Staff title");
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(emp.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
