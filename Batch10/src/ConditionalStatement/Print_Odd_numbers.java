package ConditionalStatement;

public class Print_Odd_numbers {

	public static void main(String[] args) {
		// Pgm to print odd numbers between 1 and 100
		System.out.println("Program to print odd numbers between 1 & 100");
		for (int i = 1; i<=100;i++) {
			if(i%2 != 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}

	}

}
