package collections13022024;

import java.util.*;

public class HowToConvertArrayToList {

	public static void main(String[] args) {
		String[] array = { "java", "python", "Data Structure", "C++", "C#" };
		System.out.println("Priniting array : " + Arrays.toString(array));

		// converting Array to list

		List<String> list = new ArrayList<String>();
		for (String Book : array) {
			list.add(Book);
		}
		System.out.println("printing List : " + list);
	}
}
