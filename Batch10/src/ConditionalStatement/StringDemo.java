package ConditionalStatement;

import java.util.Scanner;
// Pgm to get user input & display that many stars
public class StringDemo {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int v = a.nextInt();
		System.out.println("Entered number is:" +v);
		for(int i=1;i<=v;i++) {
			System.out.println("*");
		}
		
		//Using Scanner class try to get username & display it
		Scanner b = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = b.next();
		System.out.println("Hi "+name+ "! welcome");
	}

}
