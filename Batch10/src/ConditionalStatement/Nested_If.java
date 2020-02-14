package ConditionalStatement;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pgm to chk whether a person can donate blood or not
		int age = 19;
		int weight = 58;
		if (age >= 18) {
			if (weight >= 55) {
				System.out.println("Can donate blood");
			} else {
				System.out.println("Weight is not satisfied");
			}
		} else {
			System.out.println("Age is not satisfied");
		}
	}

}
