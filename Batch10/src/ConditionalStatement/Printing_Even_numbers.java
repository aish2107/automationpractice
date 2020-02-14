package ConditionalStatement;

public class Printing_Even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pgm to print all even nos. between 1 & 100
		System.out.println("Printing even numbers between 1 and 100");
		for (int i =1;i<=100;i++) {
			if (i%2 == 0) {
				System.out.print( i );
				System.out.print(" ");
			}
		
		}
	}

}
