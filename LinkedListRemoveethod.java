package collections13022024;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveethod {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");

		Iterator<String> itr = ll.iterator();
		System.out.println("initial list of elements : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Removing specific element from arraylist

		ll.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + ll);

		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Hanumat");

		ll.addAll(ll2);
		System.out.println("Updated List : " + ll);

		// Removing all the new elements from arraylist

		ll.removeAll(ll2);
		System.out.println("After invoking removeAll() method: " + ll);

		// Removing first element from the list

		ll.removeFirst();
		System.out.println("After invoking removeFirst() method: " + ll);

		// Removing Last element from the list
		ll.removeLast();
		System.out.println("After invoking removeLast() method: " + ll);

		// Removing first occurrence of element from the list
		ll.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking firstOccurenceremove() method:" + ll);

		// Removing Last occurrence of element from the list
		ll.removeLastOccurrence("Harsh");
		System.out.println("After invoking LastOccurenceremove() method:" + ll);

		// Removing all the elements available in the list
		ll.clear();
		System.out.println("After clearMethod : " + ll);

	}
}
