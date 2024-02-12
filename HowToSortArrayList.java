package Collection12022024;

import java.util.ArrayList;
import java.util.Collections;

public class HowToSortArrayList {

	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<String>();
		List.add("Mango");
		List.add("Banana");
		List.add("Grapes");
		List.add("Chikku");
		List.add("WaterMelon");
		List.add("Apple");
		List.add("Orange");
		List.add("Pinepple");

		// sorting the list
		Collections.sort(List);

		// Traversing list Through the for each loop
		for (String fruit : List) {
			System.out.println(fruit);
		}

		System.out.println("Sorting Number : ");
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		List2.add(21);
		List2.add(56);
		List2.add(9);
		List2.add(11);
		List2.add(18);

		Collections.sort(List2);// sorting the list
		for (Integer number : List2) {
			System.out.println(number);
		}
	}
}
