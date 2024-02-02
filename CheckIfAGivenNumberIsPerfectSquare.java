package BasicJavaProgram;

import java.util.*;

import OOPS.staticBlock;

//examples of perfect square are:
//49=7*7
//100=10*10
//625=25*25

public class CheckIfAGivenNumberIsPerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		double number = sc.nextDouble();

//		int number = 144;

		if (checkPerfectSquare(number))
			System.out.println("Yes, the given number is perfect square.");
		else
			System.out.print("No, the given number is not perfect square.");
	}

	static boolean checkPerfectSquare(double number) {
		for (int i = 1; i * i <= number; i++) {
			// if (i * i = number)

			if ((number % i == 0) && (number / i == i)) {
				// returns true if both conditions are true
				return true;
			}
		}
		// returns false if any one condition is false
		return false;
	}
}
