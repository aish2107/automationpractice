package Oops_concept;

public class abstractionClass_asgnmt1 extends abstraction_asgnmt1{
	
	public static void main(String[] args) {
		
		abstraction_asgnmt1 obj = new abstraction_asgnmt1();
		String  a = obj.customer_Name();
		long c = obj.customer_Number();
		int d = obj.customerID();
		long e = obj.creditCard();
		long f = obj.debitCard();
		
		System.out.println("Customer details:");
		System.out.println("Name: "+a+" "+ "Number: "+c +" "+ "customer ID: "+d + " "+"Credit Card Number: " +e +" "+ "Debit Card Number: " +f);
	}	
}
