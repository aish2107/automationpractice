package Collection;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int num = sc.nextInt();
		int sum = 0;
		int a[] = new int[num];
		System.out.println("Enter the numbers:");
		for (int i=0;i<num;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements:");
		
		for(int i=0;i<num;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("sum of array elements:"+sum);
	}

}
