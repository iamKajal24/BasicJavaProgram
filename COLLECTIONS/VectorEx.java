package COLLECTIONS;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// Create a new vector
		Vector<Integer> v = new Vector<Integer>();
		// Add elements to the vector
		v.add(23);
		v.add(43);
		v.add(63);
		v.add(44);
		v.add(100);

		// print
		System.out.println("the Vector is ");
		v.forEach((element) -> System.out.print(element + " "));

		// Create a new vector
		Vector<Integer> v1 = new Vector<Integer>();
		// Add elements to the vector
		v1.add(34);
		v1.add(76);

		// print
		System.out.println("\nthe Vector is String ");
		v1.forEach((str) -> System.out.print(str + " "));

		// Insert an element at index 1
		v.insertElementAt(43, 3);

		// addAll ()
		v.addAll(v1);
		System.out.println("\nAddAll method : " + v);

		// add(index,element)
		v.add(2, 101);
		System.out.println("After adding element at index 2: " + v);

		// addElement() Method
		v.addElement(56);
		System.out.println("After adding element: " + v);

		// capacity()
		System.out.println("Capacity method : " + v.capacity());

		// contains() Method
		System.out.println("contains method : " + v.contains(23));

		// containsAll() Method
		System.out.println("Contains All method : " + v.containsAll(v1));

		// elementAt() Method
		System.out.println("elementAt method : " + v.elementAt(0));

		// firstelements() Method
		System.out.println("element first methods : " + v.firstElement());

		// lastelements() Method
		System.out.println("element Last methods : " + v.lastElement());

		// ensureCapacity() method

		// equals() Method

		if (v == v1) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}

		// get() Method
		System.out.println("get method : " + v.get(3));

		// hash code()
		System.out.println("hash code : " + v.hashCode());

		// indexOf() Method
		System.out.println("IndexOf method : " + v.indexOf(23));

		// isEmpty() Method

		boolean ans = v.isEmpty();
		if (ans) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
