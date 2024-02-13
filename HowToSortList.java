package collections13022024;

import java.util.*;

public class HowToSortList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// sorting the list

		Collections.sort(list);

		for (String fruit : list) {
			System.out.println(fruit);
		}

		System.out.println("Sorting Number :");

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(43);
		list2.add(32);
		list2.add(1);
		list2.add(55);

		Collections.sort(list2);
		for (Integer num : list2) {
			System.out.println(num);
		}
	}
}
