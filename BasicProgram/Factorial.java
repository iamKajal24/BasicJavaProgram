package BasicProgram;

import java.util.Scanner;

public class Factorial {
	public static int fact(int num) {
		int res = 1; // Initialize to 1 for multiplication

		// Calculate factorial using a loop
		for (int i = 1; i <= num; i++) {
			res *= i;
		}

		return res; // Return the calculated factorial
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		System.out.println("Factorial of " + n + " is: " + fact(n));
	}
}
