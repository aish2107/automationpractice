package Oops_concept;

import java.util.Scanner;

public abstract class cardDetails_Abstraction_asgnmt1 {
	
	Scanner sc = new Scanner(System.in);
	public int customerID() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id: ");
		int cust_Id = sc.nextInt();
		//System.out.println("Customer ID:"+cust_Id );
		return cust_Id;
	}
	
	public String customer_Name() {
		System.out.println("Enter Customer Name: ");
		String cust_Name = sc.next();
		//System.out.println("Customer Name:"+cust_Name);
		return cust_Name;
	}
	
	public long customer_Number( ) {
		System.out.println("Enter customer Number: ");
		long cust_Number = sc.nextLong();
		//System.out.println("Customer Number:"+cust_Number);
		return cust_Number;
	}
	public abstract long creditCard();
	public abstract long debitCard();
}
