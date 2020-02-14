package ConditionalStatement;

public class If_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pgm to calculate grade
		int mark = 89;
		if(mark <= 40) {
			System.out.println("Fail");
		} else if (mark >= 41 && mark <=65) {
			System.out.println("B Grade");
		} else if (mark >= 66 && mark <= 75) {
			System.out.println("A grade");
		} else {
			System.out.println("A+");
		}
		}
}
