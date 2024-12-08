package COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

public class List_Interface2 {
	public static void main(String[] args) {
		// Creating a List of Strings using ArrayList
		List<String> list = new ArrayList<>();

		// Adding elements in List
		list.add("Java");
		list.add("Python");
		list.add("DSA");
		list.add("C++");
		
		// Using  for loop for iteration
		
		for(int i=0;i<list.size();i++) {
			// Using get() method to
            // access particular element
			System.out.print(list.get(i)+" ");
		}
		
		 // Using for-each loop for iteration
		System.out.println();
		for(String s : list) {
			System.out.print(s +" ");
		}
		
		// Clearing the List
		list.clear();
		System.out.println("\nAfter Operation: " + list);
	}
}
