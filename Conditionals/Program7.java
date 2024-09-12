package Conditionals;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
//		if(num>99  && num<1000) {
//			System.out.println(" This is a 3 digit number ");
//		}
//		else {
//			System.out.println("No, It is not 3 Digit Number ");
//		}
		
		if(num>10  && num<100) {
			System.out.println(" This is a 2 digit number ");
		}
		else {
			System.out.println("No, It is not 2 Digit Number ");
		}
		
		
	}

}
