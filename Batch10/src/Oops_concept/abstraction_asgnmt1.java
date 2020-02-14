package Oops_concept;

import java.util.Scanner;

public class abstraction_asgnmt1 extends cardDetails_Abstraction_asgnmt1 {
		
		Scanner sc = new Scanner(System.in);
		
		public long creditCard() {
			System.out.println("Enter Credit card number:");
			long cc = sc. nextLong();
			return cc;
		}
	
		
		public long debitCard() {
			System.out.println("Enter Debit card number:");
			long dc = sc.nextLong();
			return dc;
		}
	
	
}
