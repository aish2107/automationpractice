package Oops_concept;

public class Asgnmt1 {

	public static void main(String[] args) {
		System.out.println("Details of employee ");
		Employee_Details Suji = new Employee_Details();
		Suji.setAge(25);		
		System.out.println("Age:"+Suji.getAge());
		
		Employee_Details Aish = new Employee_Details(51483662,280000,29,"Aish");
	}

}
