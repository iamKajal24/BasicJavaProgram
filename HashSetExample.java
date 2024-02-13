package collections13022024;

import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("four");
		set.add("Five");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
