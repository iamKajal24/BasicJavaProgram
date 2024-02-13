package collections13022024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSetFromAnotherCollection {

	public static void main(String[] args) {
		ArrayList<String> AL = new ArrayList<String>();
		AL.add("Ravi");
		AL.add("Vijay");
		AL.add("Ajay");

		HashSet<String> set = new HashSet<String>(AL);
		set.add("Gaurav");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
