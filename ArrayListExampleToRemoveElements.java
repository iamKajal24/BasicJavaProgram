package Collection12022024;

import java.util.ArrayList;

public class ArrayListExampleToRemoveElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Mahesh");
		System.out.println(" An initial list of Element : " + list);
		
		list.remove("Vijay");
		System.out.println("After invoking remove(object) method : " + list);
		
		//Removing element on the basis of specific position
		
		list.remove(0);
		System.out.println("After remove (index) method : " +list);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Dinesh");
		list2.add("Karamjeet");
		
		list.addAll(list2);
		System.out.println("Updated List : " + list);
		
		list.removeAll(list2);
		System.out.println("After remove All (index) method : " + list);
		
		  list.removeIf(str -> str.contains("Ajay"));
		  System.out.println("After removeIf() method : " + list);
		
//		ArrayList<String> list3 = new ArrayList<String>();
//		list3.add("John");
//		list3.add("Rahul");
//		
//		list.addAll(list3);
//		System.out.println(list);
		
	}

}
