package COLLECTIONS;

import java.util.Collection;
import java.util.LinkedList;

public class Collection_Demo {
	public static void main(String[] args) {
		Collection<String> List = new LinkedList<>();

		// use add
		List.add("Geeks");
		List.add("For");
		List.add("Geeks");
		List.add("Ji");

		// output The present list
		System.out.println("The list is : " + List);

		// Adding new elements to the end
		List.add("Last");
		List.add("element");

		// printing the new list
		System.out.println("The new List is : " + List);

		// Creating an empty ArrayList
		Collection<String> list = new LinkedList<String>();

		// Appending the collection to the list
		list.add("kajal");
		list.addAll(List);

		// displaying the modified ArrayList
		System.out.println("The new ArrayList is : " + list);

		// Removing Element

		list.remove("Geeks");
		System.out.println(list);

//        All remove element;
		list.removeAll(List);
		System.out.println("Array List : " + list);

	}
}
