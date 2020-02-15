package hashmap;

import java.util.HashMap;



public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		
		names.put(1, "John");
		names.put(2, "Dave");
		names.put(3, "Helen");
		
		System.out.println(names);
		
		names.replace(2, "Bob");
		
		System.out.println(names);
		System.out.println(names.keySet());
		
		names.remove(1);
		System.out.println(names);

	}

}
