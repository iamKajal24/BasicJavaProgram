package Collection12022024;

import java.util.ArrayList;

public class ArrayListEmptyMethod {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Is arrayList Empty : " + list.isEmpty());
		list.add("Ravi");
		list.add("Vijay");
		list.add("Mahesh");
		System.out.println("After Insertion ");
		System.out.println("Is ArrayList Empty :" + list.isEmpty());
		
	}

}
