package ConditionalStatement;

import java.util.Scanner;

//get user salary and age details
public class GetSalary {
	int sal,age;
	Scanner sc = new Scanner(System.in);
	public int getSal() {
		System.out.println("Enter your salary: ");
		sal = sc.nextInt();
		System.out.println("Enter your age:");
		 age = sc.nextInt();
		 return sal;
	}
}