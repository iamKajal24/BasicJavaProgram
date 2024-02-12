package Collection12022024;

import java.util.ArrayList;

public class IteratingArrayListUsingForEachLoop {

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

		// traversing list through for eachloop
		for (String fruit : List) {
			System.out.println(fruit);
		}
	}
}
