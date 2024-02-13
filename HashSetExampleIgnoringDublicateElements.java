package collections13022024;

import java.util.*;

public class HashSetExampleIgnoringDublicateElements {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Riya");
		set.add("Kamini");
		set.add("Ravi");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
