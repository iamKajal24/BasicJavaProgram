package COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {
    public static void main(String[] args) {
        // Creating a List of Strings using ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements to the List
        list.add("Java");
        list.add("Python");
        list.add("DSA");
        list.add("C++");

        System.out.println("Elements of List are :");

        // Iterating through the list
        for (String element : list) {
            System.out.print(element + " ");
        }

        // Creating another list and adding an element
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        System.out.println("\nList1: " + list1);

        // Accessing elements
        System.out.println("\nElement at index 2: " + list.get(2));
        String firstString = list.get(1);
        String secondString = list.get(3);
        System.out.println("Element at index 1: " + firstString);
        System.out.println("Element at index 3: " + secondString);

        // Updating elements
        list.set(1, "JavaScript");
        System.out.println("Updated List: " + list);

        // Removing an element
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        // Checking equality of two lists
        if (list.equals(list1)) {
            System.out.println("list and list1 are equal.");
        } else {
            System.out.println("list and list1 are not equal.");
        }

        // Searching for the first occurrence of an element
        int firstOccurrence = list.indexOf("JavaScript");
        System.out.println("First occurrence of JavaScript is at index: " + firstOccurrence);

        // Searching for an element
        int lastOccurrence = list.indexOf("C++");
        System.out.println("First occurrence of C++ is at index: " + lastOccurrence);

        // Using lastIndexOf() method
        int lastIndex = list.lastIndexOf("DSA"); // This will return -1 as "DSA" is not in the list
        System.out.println("Last occurrence of DSA is at index: " + lastIndex);

        // Checking if an element is present using contains() method
        boolean isPresent = list.contains("Java");
        System.out.println("Is Java present in the list? : " + isPresent);

        boolean isPresent1 = list.contains("JavaScript");
        System.out.println("Is JavaScript present in the list? : " + isPresent1);
        
        //Hash code
        int hash=list.hashCode();
        System.out.println("Hash Code : " + hash);
        
        //Empty
        System.out.println(list.isEmpty());
    }
}
