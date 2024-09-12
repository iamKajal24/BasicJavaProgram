package Conditionals;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
	    int num=sc.nextInt();
	    
//	    if(num%5==0) {
//	    	System.out.println("Number is divisible by 5 ");
//	    }
//	    else if (num%3==0) {
//			System.out.println("Number is divisible by 3");
//		}
//	    else {
//	    	System.out.println("Not divisible");
//	    }
	    
	    if(num%5==0) {
	    	System.out.println("Number is divisible by 5 ");
	    }
	    else {
			System.out.println("Number is not divisible by 3");
		}
//	    else {
//	    	System.out.println("Not divisible");
//	    }
	}

}
