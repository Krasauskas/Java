package classwork;

/**Created by V Krasauskas
/**
/**Created on Feb 20, 2018**/

public class Rectangle {
	
	double width, height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (height + width);
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle 1:\n\tHeight: " + r1.height + "\n\tWidth: " + r1.width + "\n\tArea: " + r1.getArea() + "\n\tPerimeter: " + r1.getPerimeter());
		System.out.println("Rectangle 2:\n\tHeight: " + r2.height + "\n\tWidth: " + r2.width + "\n\tArea: " + r2.getArea() + "\n\tPerimeter: " + r2.getPerimeter());
	}

}
