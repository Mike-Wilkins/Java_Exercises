package array_list;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(7);
		numbers.add(8);
		numbers.add(2);
		numbers.add(12);

		System.out.println(numbers);
		System.out.println(numbers.get(1));
		System.out.println(numbers.indexOf(12));

		for (Integer n : numbers) {
			System.out.println(n);
		}
		
		
		// Removing elements in the the array is very slow since the remaining elements in the array
		// are copied and shuffled down to create a new array.
		
		numbers.remove(0);
		
		System.out.println(numbers);

	}

}
