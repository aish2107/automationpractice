package ConditionalStatement;

//import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {		
		
		String str = "Program";		
		System.out.println("Given string: "+str);
		
		// reversing string
		System.out.println("Reversed String:");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
