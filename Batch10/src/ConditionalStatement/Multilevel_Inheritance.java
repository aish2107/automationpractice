package ConditionalStatement;
//Pgm to demonstrate multi level inheritance
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		// create object for class B
		C obj = new C();
		obj.a = 12;
		obj.b = 5;
		
		System.out.println("Adding given 2 numbers "+obj.a+ " and " +obj.b+ ": " +obj.add());
		System.out.println("Subtracting given 2 numbers " +obj.a+ " and " +obj.b+ ": " +obj.sub());
		System.out.println("Multiplying given 2 numbers " +obj.a+ " and " +obj.b+ ": " +obj.mul());		
				
	}

}
