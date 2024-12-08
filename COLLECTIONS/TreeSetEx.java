package COLLECTIONS;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<String> ts= new TreeSet();
		//add 
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Lichi");
		ts.add("Apple");
		
		//print
		ts.forEach((fruit)->System.out.println(fruit));
		
		//accessing
		System.out.println("first :" + ((TreeSet) ts).first());
		System.out.println("Last: " + ((TreeSet) ts).last());
		String check="Banana";
		System.out.println("Contains : " + ts.contains(check));
		
		//remove
		ts.remove("Lichi");
		System.out.println("remove : "+ts);
		
		 // Now removing the first element
        // using pollFirst() method
		
		((TreeSet) ts).pollFirst();
		 System.out.println("After removing first " + ts);
		 
		 // Removing the last element
	        // using pollLast() method
	        ((TreeSet) ts).pollLast();
	        System.out.println("After removing last " + ts);
	        
		
	}
}
