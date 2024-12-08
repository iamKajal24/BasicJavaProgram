package COLLECTIONS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Traversal_HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// add element
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// foreach loop

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println("Key : " + e.getKey() + "value : " + e.getValue());
		}

	}
}
