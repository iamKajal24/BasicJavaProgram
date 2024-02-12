package Collection12022024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Mahesh");
		list.add("Ajay");
		System.out.println("Traversing list Through List Iterator :");

		ListIterator<String> list1 = list.listIterator(list.size()); // here element iterates in reverse order
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}

		System.out.println("Traversing List Through For loop : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through ForEach() Method : ");

		// Here, We Are Using lambda Expression
		list.forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("Traversing List Through For EachRemaining () Method : ");
		Iterator<String> itr = list.iterator();
		
		itr.forEachRemaining(a -> // here , we are using lambda Expression
		{
			System.out.println(a);
		});
	}
}
