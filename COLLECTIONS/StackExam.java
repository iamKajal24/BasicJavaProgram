package COLLECTIONS;

import java.util.Stack;

//Stack class that models and implements a Stack data structure
//class is based on the basic principle of LIFO(last-in-first-out)
//additional functionality specifically for stack operations, such as push, 
//pop, peek, empty, and search.



//push->Adds an element to the top of the stack.
//pop->Removes and returns the top element from the stack
//peek->Returns the top element of the stack without removing it

public class StackExam {
	public static void main(String[] args) {
		Stack<String> liStack= new Stack<String>();
		 // Push elements onto the stack-> add element
		liStack.push("kajal");
		liStack.push("riya");
		liStack.push("naksha");
		liStack.push("dev");
		
		System.out.println("stack list : ");
		liStack.forEach((element)-> System.out.print(element+ " "));
        
        // Peek top element
        System.out.println("\nTop element (peek): " + liStack.peek());
        
        // Search element
        System.out.println("Position of riya: " + liStack.search("riya"));
        
        // Pop elements
        System.out.println("Popped element: " + liStack.pop());
        System.out.println("list : "+liStack);
        
        // Check if empty
        System.out.println("Is stack empty? " + liStack.empty());
		
	}
}
