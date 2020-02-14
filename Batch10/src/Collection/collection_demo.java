package Collection;

import java.util.ArrayList;
import java.util.List;

public class collection_demo {

	public static void main(String[] args) {
		List<Integer> value = new ArrayList<>();
		//adding values
		value.add(12);
		value.add(15);
		value.add(98);
		value.add(100);
		System.out.println("value----->>>>"+value);
		value.add(1,200);
		value.add(100);
		System.out.println(value);
		value.set(3,500);
		System.out.println("set(3,500)==>>>>>"+value);
		System.out.println(value.get(2));
		System.out.println("Printing all values using for loop");
		for (int i:value) {
			System.out.println(i);
		}
		System.out.println("to know the size"+value.size());
		
		//copying 
		List<Integer> v = new ArrayList<>();
		v.add(1256);
		v.addAll(value);
		System.out.println("printing after copying ");
		System.out.println(v);
		for (Integer x:v) {
			//System.out.println(x);
		}
		System.out.println("removing================>>>>>");
		//v.removeAll(value);
		//System.out.println("Removeall====>>"+(v.removeAll(value)));
		//System.out.println(v);
		for (Integer x:v) {
		//	System.out.println(x);
		}
		
		v.add(102);
		v.add(105);
		System.out.println("---------");
		System.out.println(v);
		
		//retainall
		System.out.println("RETAIN ALL");
		v.retainAll(value);
		System.out.println(v);
		
		//removeall
		//System.out.println("removeall");
		//v.removeAll(value);
		//System.out.println(v);
		//System.out.println("size of"+v.size());
		//System.out.println("contains"+v.contains(5000));
	}
	

}
