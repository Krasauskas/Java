package assignment1part1;

public class max extends AbstractArrayProcessor {

	public max(String name, String description) {
		super(name, description);
	}

	@Override
	public double[] execute(double[] array) {
		double[] largest = {array[0]};
		for (int i = 1; i < array.length; i++) {
			// If there are two or more numbers that are the same and they are the largest of the array, this will fail to identify later numbers
			if (array[i] > largest[0]) {
				largest[0] = array[i];
			}
		}
		return largest;
	
	}
	
	public static void main (String[] args) {
		max test = new max("name", "desc");
		System.out.println(test.example().toString());
	}

}
