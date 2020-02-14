// Grade calculation assignment 
package ConditionalStatement;

public class GradeCalculation_asgnmt {
	public static void main(String[] args) {
		int sum, avg, tam, eng, mat, sci, soc;
		eng = 91;
		tam = 92;
		mat = 95;
		sci = 85;
		soc = 57;
		
		//Calculate sum of the marks
		sum = tam + eng + mat + sci + soc;
		System.out.print("Sum is:");
		System.out.println(sum);
		
		//Calculate average 
		avg = sum / 5;;
		System.out.print("Average is:");
		System.out.println(avg);
		
		// Calculate grade 
		System.out.print("Grade obtained: ");
		if(avg <= 40) {
			System.out.println("Fail");
		}  else if (avg >= 41 && avg <= 60) {
			System.out.println("B");
		} else if (avg >= 61 && avg <= 80){
			System.out.println("A");
		} else {
			System.out.println("A+");
		}
	}
}
