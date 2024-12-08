package COLLECTIONS;

import java.util.Iterator;
import java.util.LinkedList; // Import LinkedList class from java.util package
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		// Add element
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("Four");
		list.add("Five");

		// add (index,element)
		list.add(3, "THREE-three");

		// for each
		System.out.println("list : ");
		list.forEach((element) -> System.out.print(element + " "));
		System.out.println();

		// addAll

		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Kajal");
		list1.add("Riya");

		list1.addAll(list);
		System.out.println("list 2: " + list1);
		
		//addFirst
		list.addFirst("Zero");
		System.out.println("List 3 : "+list);
		
		//addLast
		list.addLast("Infinite");
		System.out.println("list 4 : " + list);
		
		//contains
		String b = "one";
		if(list.contains(b)) {
			System.out.println("yes, it is contains element ");
		}
		else {
			System.out.println("No , it is not contains element");
		}
		
		//descendingIterator() 
		Iterator<String> x = list.descendingIterator();
		while(x.hasNext()) {
			System.out.println("value is :" + x.next());
		}
		
		//element
		String value = list.element();
		System.out.println("Head of list : "+ value);
		
		//get Index
		System.out.println("Get : " + list.get(5));
		
		//set Index
		System.out.println("Set : " + list.set(2, "Love"));
		System.out.println("list 5 : "  + list);
		
		//getFirst
		System.out.println("GetFirst : " + list.getFirst());
		
		//getLast
		System.out.println("GetLast :" + list.getLast());
		
		//indexOf()
		System.out.println("index of : "+ list.indexOf("three"));
		
		//lastIndexOf()
		System.out.println("Last Index of : " + list.lastIndexOf("Infinite"));
		
        // listIterator()
		ListIterator<String> list_Iterator = list.listIterator();
		System.out.println("List Iterator:");
		while(list_Iterator.hasNext()) {
			System.out.print(list_Iterator.next() + " ");
		}
		
		//size
		System.out.println("\nSize : " + list.size());
		
//		toArray()
		Object obj[] = list.toArray();
		System.out.println("After converted LinkedList to Array  :");
		for(Object element:obj) {
			System.out.print(element + " ");
		}
		
		//removelastOccurence
		System.out.println("\nremove last : " + list.removeLastOccurrence("Infinite"));
		
		//remove last
		System.out.println("Remove last : " + list.removeLast());
		
		//remove firstt Occurence
		System.out.println("Remove first Occurence :" + list.removeFirstOccurrence("Zero"));
		
		//remove first
		System.out.println("Remove first :" + list.removeFirst());
		
		System.out.println("list 6: " + list);
		
		//remove object
		System.out.println("remove obj  : " + list.remove("Love"));
		
		//remove index
		System.out.println("Remove Index : " + list.remove(0));
		System.out.println("list 7 :" + list);
		
		//remove
		System.out.println("remove :" + list.remove());
		
		System.out.println(list);
		
		//clear
		list.clear();
		System.out.println("clear : " +  list);
		
        // offer(), offerFirst(), offerLast()
		
		

	}
}
