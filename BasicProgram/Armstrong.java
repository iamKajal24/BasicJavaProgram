package BasicProgram;

import java.util.function.BiConsumer;

// Armstrong Number
/*
 * 153 -> 1 5 3
 *        1*1*1 + 5*5*5 + 3*3*3
 *        1+125+27
 *        153
 */

public class Armstrong {
	public static void arm(int num) {
		int temp = num; // Store original number
		int digit = 0; // Variable to store the remainder (digit)
		int sum = 0; // Sum of cubes of digits

		// Calculate the sum of the cubes of digits
		while (num > 0) {
			digit = num % 10; // Extract the last digit
			sum += digit * digit * digit; // Add the cube of the digit to the sum
			num /= 10; // Remove the last digit
		}

		// Check if the number is an Armstrong number
		if (temp == sum) {
			System.out.println(temp + " is an Armstrong Number!");
		} else {
			System.out.println(temp + " is NOT an Armstrong Number!");
		}
	}

	public static void main(String[] args) {
		int n = 153;
		arm(n); // Test case: 153 (Armstrong Number)

		int n2 = 123;
		arm(n2); // Test case: 123 (Not an Armstrong Number)
	}
}