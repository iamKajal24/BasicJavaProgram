package collections13022024;

import java.util.*;

public class ListIteratorInterface {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1, "Sachin");

		ListIterator<String> Str = al.listIterator();
		System.out.println("Traversing Elements in forwording direction : ");
		while (Str.hasNext()) {
			System.out.println("index : " + Str.nextIndex() + " value : " + Str.next());
		}
		System.out.println("Traversing elements in backward dirrection : ");
		while (Str.hasPrevious()) {
			System.out.println("index : " + Str.previousIndex() + " value : " + Str.previous());
		}
	}
}
