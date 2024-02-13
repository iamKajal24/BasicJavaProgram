package collections13022024;

import java.util.*;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// iterating the list element using for each loop

		for (String fruit : list) {
			System.out.println(fruit);
		}
	}
}
