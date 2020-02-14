package ConditionalStatement;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[3];
		array[0]=92;
		array[1]=95;
		array[2]=100;
		
		int sum = 0;
		for (int i=0;i<array.length;i++) {
			sum=sum+array[i];
			System.out.println("a["+i+ "]:" +array[i]);
		}
		System.out.println("sum of given numbers:" + sum);
	}

}
