package assignment1part1;

public class subtract extends AbstractArrayProcessor {

	private double value;

	public subtract(String name, String description, double value) {
		super(name, description);
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}

	@Override
	public double[] execute(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] -= getValue();
		}
		return array;	
	}	
	
	public static void main (String[] args) {
		subtract test = new subtract("name", "desc", 0.5);
		System.out.println(test.example().toString());
	}

}
