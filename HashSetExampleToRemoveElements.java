package collections13022024;

import java.util.*;

public class HashSetExampleToRemoveElements {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");

		System.out.println("An initial list of elements : " + set);

		// Remove Elements
		set.remove("Ravi");
		System.out.println("After remove Method : " + set);

		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Updated list : " + set);

		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("After removeIf method : " + set);

		set.clear();
		System.out.println("After clear method : " + set);
	}
}
