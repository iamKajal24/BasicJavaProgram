package Collection12022024;

import java.util.ArrayList;

public class GetAndSetArrayList {

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
		// accessing the element
		System.out.println("Returning Element : " + List.get(1));
		List.set(1, "Dates");// changing the element

		// traversing list

		for (String fruit : List) {
			System.out.println(fruit);
		}
	}
}
