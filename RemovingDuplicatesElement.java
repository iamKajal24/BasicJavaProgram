package collections13022024;

import java.util.*;

public class RemovingDuplicatesElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Banana");

		System.out.println(list.toString());

		Set<String> s = new HashSet<String>(list);
		System.out.println(s);
	}
}
