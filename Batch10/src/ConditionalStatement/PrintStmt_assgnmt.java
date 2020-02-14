package ConditionalStatement;

public class PrintStmt_assgnmt {

	public static void main(String[] args) {
		// Pgm to print 10 numbers in a row
		int count = 0;
		for (int i =1;i<=100;i++) {
			System.out.print( i + " "  );
			//System.out.print(" ");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}

	}

}
