package Collection12022024;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRetainAll {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Sanjay");
		list.add("Mahesh");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ravi");
		list.add("Hanumat");

		list.retainAll(list2);
		System.out.println("Iterating the element after retaining the element of list2");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.hasNext());
		}
	}
}
