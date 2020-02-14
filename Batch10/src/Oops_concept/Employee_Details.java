package Oops_concept;

import java.util.Scanner;

public class Employee_Details {
	public int emp_Id;
	private int age;
	public int salary;
	public String emp_Name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public  Employee_Details() {
		System.out.println("Default constructor is running");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id: ");
		emp_Id = sc.nextInt();
		System.out.println("Enter salary :");
		salary = sc.nextInt();
		
		//System.out.println("Enter age :");
		//age = sc.nextInt();
		System.out.println("Enter employee name :");
		emp_Name = sc.next();
		
		System.out.println("Emp_name: "+emp_Name+"emp_Id: "+emp_Id+"salary"+salary);
	}
	
	public Employee_Details(int emp_Id,int salary,int age,String emp_Name) {
		
		System.out.println("Parameterized constructor is running");
		this.emp_Id = emp_Id;
		this.age=age;
		this.salary = salary;
		this.emp_Name = emp_Name;
		
		System.out.println("Emp_name:"+emp_Name+"emp_Id:"+emp_Id+"Age:"+age+"salary"+salary);
		
	}
	
	static {
		System.out.println("Static is running");
	}

}
