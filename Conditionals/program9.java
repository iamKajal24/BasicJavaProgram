package Conditionals;

import java.util.Scanner;

public class program9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a=sc.nextInt();
		System.out.println("enter 2nd number : ");
		int b=sc.nextInt();
		System.out.println("enter 3rd number : ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a + " is  largest");
		}
		else if (b>a && b>c) {
			System.out.println(b + " is largest");
		}
		else if (c>a && c>b ) {
			System.out.println(c + " is largest");
		}
	}
}
