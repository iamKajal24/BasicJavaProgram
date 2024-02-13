package collections13022024;

import java.util.*;

public class HowToConvertListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		list.add("Strawberry");

		// Converting ArrayList to Array

		String[] array = list.toArray(new String[list.size()]);
		System.out.println("printing array : " + Arrays.toString(array));
		System.out.println("printing list : " + list);
	}
}
