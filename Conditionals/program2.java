package Conditionals;

import java.util.Scanner;

// +ve integer inpput and tell if it is divisible by 5 or not
public class program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		
		if(n%5==0) {
			System.out.println("Yes, it is divisible ");
			System.out.println("Hello Good Morning");
		}
		else {
			System.out.println("No, it is not divisible ");
		}
	}
}
