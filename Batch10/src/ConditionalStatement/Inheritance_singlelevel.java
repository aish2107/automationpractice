package ConditionalStatement;

public class Inheritance_singlelevel {

	public static void main(String[] args) {
		// pgm to demonstrate single level inheritance
		
		// create object for class B which is subclass (child class)
		B obj = new B();
		obj.a=10;		
		obj.b=5;
		System.out.println("Adding given 2 numbers "+obj.a+ " and " +obj.b+ ": " +obj.add());
		System.out.println("Subtracting given 2 numbers" +obj.a+ " and " +obj.b+ ": " +obj.sub());
	}

}
