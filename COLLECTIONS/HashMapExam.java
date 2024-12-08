package COLLECTIONS;

import java.util.HashMap;

public class HashMapExam {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		map.put("john", 40);

		// size
		System.out.println("size of map is : " + map.size());

		// print
		System.out.println("map : " + map);

		// Access elements in the HashMap
		System.out.println("get method : " + map.get("sachin"));
		
		// Remove an element from the HashMap
		map.remove("john");
		System.out.println("remove :" +map);
		
		// Check if an element is present in the HashMap
		System.out.println("contains :" + map.containsKey("vaibhav"));

		// Checking if a key is present and if
		// present, print value by passing
		// random element
		if (map.containsKey("vishal")) {
			Integer a = map.get("vishal");
			System.out.println("Value of key " + " \"vishal\" is : " + a);
		}

	}
}
