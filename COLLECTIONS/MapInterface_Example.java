package COLLECTIONS;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.HashMap;
import java.util.Map;

public class MapInterface_Example {
	public static void main(String[] args) {
		// Create a map using HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Displaying the map
		System.out.println("Map elements : " + map);

		// Inserting pairs in above map
		map.put("a", new Integer(100));
		map.put("b", new Integer(200));
		map.put("c", new Integer(300));
		map.put("d", new Integer(400));

		// Traversing through map using for each loop
		// Traversing through the map using for-each loop
		for (Map.Entry<String, Integer> me : map.entrySet()) {
			System.out.println(me.getKey() + ": " + me.getValue());
		}

		// update
		map.put("c", new Integer(500));
		System.out.println("Updated Map : " + map);
		
		//Remove
		map.remove("d");
		System.out.println("Remove : "+map);
		
       // Iterating through the Map
		for (Map.Entry<String, Integer> me : map.entrySet()) {
			System.out.println(me.getKey() + ": " + me.getValue());
		}

	}
}
