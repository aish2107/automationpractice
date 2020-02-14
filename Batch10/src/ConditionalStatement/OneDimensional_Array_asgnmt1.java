package ConditionalStatement;

public class OneDimensional_Array_asgnmt1 {

	public static void main(String[] args) {
		// 0,5,10,20,25......2000
		
		int arr[] = new int[401];		
		
		for(int i=0;i<arr.length;i++) {
			//arr[0] = 0;
			arr[i]= i*5;
			System.out.println("arr[" +i+ "]:" + arr[i]);			
		}
		
		//another method:
		System.out.println();
		for (int i=1;i<arr.length;i++) {
			arr[0]=0;
			arr[i]=arr[i-1]+5;
		}
		//System.out.println("myself idea try");
		for(int i=0;i<arr.length;i++) {
			//System.out.println("arr["+i+"]:" +arr[i]);
		}
		
	}

}
