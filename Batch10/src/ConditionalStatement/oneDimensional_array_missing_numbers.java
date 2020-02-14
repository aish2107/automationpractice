package ConditionalStatement;

public class oneDimensional_array_missing_numbers {

	public static void main(String[] args) {
		int[] a = {1,3,4,2,6};
		int sum = 0;
		int sum_n =0;
		//Finding sum of given numbers in the array
		for (int i=0;i<a.length;i++) {
			sum = sum + a[i];			
		}
		System.out.println("sum of given numbers: "+sum);
		
		// finding last digit in the array assuming that last number is the greatest number
		int last = a[a.length-1];
		
		//Finding sum of n natural numbers taking 'n' as the last digit what we calculated
		for (int i=1;i<=last;i++) {
			sum_n = sum_n+i;
		}
		System.out.println("Sum of n natural numbers: "+sum_n);
	
	//Finding Missing number
	int missing_number = 0;
	missing_number = sum_n-sum;
	System.out.println("Missing number in the given array is: "+missing_number);
	
	}
}
	


