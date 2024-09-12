package Conditionals;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		//System.out.println(n*n);
		if(n%2==0) {
			System.out.println("The number you entered is even ");
		}
		else if(n%2!=0) {
			System.out.println("The number you entered is Odd");
		}	
	}
}
