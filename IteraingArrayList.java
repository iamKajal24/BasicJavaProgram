package Collection12022024;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraingArrayList {

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

		// traverse list through iterator
		Iterator itr = List.iterator();// getting the Iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
