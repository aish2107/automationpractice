package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class collection_set_demo {

	public static void main(String[] args) {
		Set <String> name = new HashSet<>();
		name.add("Vijay");
		name.add("Aith");
		name.add("Rajini");
		name.add("Vijay");
		name.add(null);
		name.add("Darbar");
		name.add("Bigil");
		System.out.println(name);
		
		//System.out.println(name.getClass());
		
		//to retrieve all data 
		for (String s:name) {
			System.out.println(s);
		}

		//to retrieve particular value, it is impossible in "SET" since it is value-based,not index-based. So we are converting SET into a list
		
		ArrayList <String> list = new ArrayList();
		list.addAll(name);
		System.out.println(list);
		System.out.println(list.get(2));
		
	}

}
