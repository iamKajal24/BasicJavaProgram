package Conditionals;

import java.util.Scanner;

//Print the absolute Value of That integer
public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		
		if(n<0) { //number less than 0
			n=n*(-1); //-30 = -30*(-1)
			System.out.println();
		}
		System.out.println("The absolute value is : " + n);
		
	}

}
