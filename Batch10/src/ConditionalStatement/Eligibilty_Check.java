package ConditionalStatement;

public class Eligibilty_Check extends GetSalary {
	public String eligibility() {
		String eligibilty;		
		if (sal >= 50000) {
			if (age >= 21 && age <= 40) {
			 	eligibilty = "eligible for loan";
			} else {
				eligibilty = "not eligible for loan since your age criteria is not satisfied";
			}
		} else {
			 eligibilty = "not eligible for loan since your salary criteria is not satisfied";
		}
		return eligibilty;
}
}
