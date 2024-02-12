package Collection12022024;

import java.util.ArrayList;

public class ArrayListAddElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Initial list of element : " + list);
		// Adding elements to the end of the list
		list.add("Ravi");
		list.add("Ajay");
		list.add("Vijay");

		System.out.println("After Invoking Add(E e) method : " + list);
		// Adding an element at the specific position

		list.add(1, "Gaurav");
		System.out.println("After Invoking ADD(int index, E element) method : " + list);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("soono");
		list2.add("Hanumat");

		// adding second list elements to the first elelemnt

		list2.addAll(list2);
		System.out.println("\"After Invoking ADD(int index, E element) method : " + list2);
	}
}
