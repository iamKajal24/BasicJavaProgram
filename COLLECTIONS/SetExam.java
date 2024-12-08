package COLLECTIONS;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		// HashSet duplicate elements ko remove kar deta hai apne aap
		// create a set using HashSet
		Set<String> s = new HashSet<>();

		// Displaying the set
		System.out.println("Set elements : " + s);

		// add element
		s.add("Geeks");
		s.add("For");
		s.add("Geeks");
		s.add("Example");
		s.add("Set");

		// print
		System.out.println("HashSet List : ");
		s.forEach((element) -> System.out.print(element + " "));
		
		
		//accessing element -> contains
		String check="For";
		System.out.println("\ncontains : " + check + " " + s.contains(check));
	
		//Remove element
		s.remove("Set");
		System.out.println("Remove : " + s);
		
		// Iterating through the Set
        // via for-each loop 
		System.out.println("list 2 : ");
		for(String value : s) {
			System.out.print(value +",");
		}
		
		
	}
}
