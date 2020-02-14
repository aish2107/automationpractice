package Oops_concept;

import java.util.Scanner;

public class Interface_asgnmt1 implements Interface_cardDetails_asgnmt {
	Scanner sc = new Scanner(System.in);
	public String cust_name() {
		System.out.println("Enter customer name:");
		String cust_name = sc.nextLine();
		return cust_name;
	}
	public int custNum() {
		System.out.println("Enter customer number:");
		int cust_num = sc.nextInt();
		return cust_num;
	}
	public long creditCard() {
		System.out.println("Enter credit card detail:");
		long cc = sc.nextLong();
		return cc;
	}
	public long debitCard() {
		System.out.println("Enter debit card detail:");
		long dc = sc.nextLong();
		return dc;
	}

}
