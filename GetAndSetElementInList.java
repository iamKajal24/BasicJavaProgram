package collections13022024;

import java.util.*;

public class GetAndSetElementInList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println("Returning Element : " + list.get(2));
		list.set(2, "Dates");
		for (String fruit : list) {
			System.out.println(fruit);
		}
	}
}
