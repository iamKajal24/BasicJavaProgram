package COLLECTIONS;

import java.util.ArrayList;

public class CustomArrayListExample {
	public static void main(String[] args) {

		// Creating an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Adding Element in ArrayList
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(10);
		list.add(9);

		// Iterating

		System.out.println("Original List:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// Adding Elements at the specific index

		list.add(1, 36);
		System.out.println("\nAfter adding element at index 1: " + list);

		// 2. Deletion of Element

		// Removing Element using index
		list.remove(1);
		System.out.println("Element removed from index 1: " + list);

		// Removing Element using the value
		list.remove(Integer.valueOf(56));
		System.out.println("Element 56 removed   : " + list);

		// 3. Updating Values
		// Updating value at index 0
		list.set(1, 15);
		System.out.println("List after Updating : " + list);

		// Creating an ArrayList
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		// Adding Element in ArrayList
		list1.add(42);
		list1.add(54);
		list1.add(26);
		list1.add(10);

		// print all element
		System.out.println("print List1 :");
		for (Integer number : list1) {
			System.out.print(number + " ");
		}

		// inserting all elements, list2 will get printed
		// after list1

		list.addAll(list1);
		System.out.println("\nprinting all element :");
		for (int element : list) {
			System.out.print(element + " ");
		}

		 // use contains() to check if the element
        // 2 exits or not
		
		boolean ans = list.contains(10);
		if(ans) {
			System.out.println("\nThe list contains 10");
		}
		else {
			System.out.println("The list does not contains 10");
		}
		
		 // forEach method of ArrayList and 
        // print numbers 
		
		list.forEach((element) -> System.out.println("element print using for each loop :" + element));
	}
}
