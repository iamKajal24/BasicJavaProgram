package collections13022024;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");  
        ll.add("Ajay"); 
        
        // traversing he list of element in reverse order
        
        Iterator i = ll.descendingIterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }  
	}
}
