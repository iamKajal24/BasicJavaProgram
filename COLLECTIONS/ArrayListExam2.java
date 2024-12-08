package COLLECTIONS;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExam2 {
	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Adding Element in ArrayList
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(10);
		list.add(9);

		// for each
		System.out.println("Printing element:");
		list.forEach((element) -> System.out.print(element + " "));
		
		//get index
		System.out.println("\nusing get method : " + list.get(4));
		
		//indexOf() method
		System.out.println("indexOf method () : " + list.indexOf(56));
		
		//isEmpty() method
		boolean b = list.isEmpty();
		if(b==true) {
			System.out.println("The arraylist is empty");
		}
		else {
			System.out.println("The arrayList is not empty");
		}
		
		//lastindexOf() method
		System.out.println("lastIndexOf() method : " + list.lastIndexOf(9));
		
		//listIterator()
		ListIterator<Integer> iterator=list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Value is : " + iterator.next());
		}
		
		//set() method
		System.out.println("Set method : " + list.set(4, 15) );
		
		//size()
		System.out.println("size method : " + list.size());
		
		//subList()
		System.out.println("subList method : " + list.subList(2, 4));
		
		//ArrayList to Array Conversion in Java : toArray() Methods
		Object [] arr = list.toArray();
		System.out.println("toArray method () : ");
		for(Object obj: arr) {
			System.out.print(obj + " ");
		}
		
		//trimToSize()
		list.trimToSize();
		System.out.println("\ntrimToSize method : ");
		list.forEach((number)-> System.out.print(number +" "));
		
		//remove(int index)
		System.out.println("\nremove index method :" + list.remove(3));
	
		//remove(Object o)
		System.out.println("remove object  :" + list.remove(Integer.valueOf(56)));
		
		//removeIf() method
		System.out.println("removeIf() method");
		list.removeIf(num->(num%3==0));
		for(int i:list) {
			System.out.println(i);
		}
		//removeAll() method
		System.out.println("removeALL method : " + list.removeAll(list));
		
		//add list
		list.add(45);
		list.add(26);
		System.out.println(list);
		
		//clear method
		list.clear();
		System.out.println("List cleared. Current size: " + list.size());

		// retainAll() method 
		System.out.println("retain all method : " + list.retainAll(list));
		System.out.println(list);
	}
}
