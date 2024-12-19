package BasicProgram;

import java.util.Scanner;

public class CheckifaGivenIntegerisOddorEven {
	// Brute Force Technic
	static void EvenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("even Number.. ");
		} else {
			System.out.println("Odd Number..");
		}
	}

	static String testOddEvenByCheckingLSB(int num) {
		if (num != 0) {
			if (Integer.toBinaryString(num).endsWith("0")) {
				return "even";

			} else {
				return "Odd";
			}
		} else {
			return "zero";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number  :");
		int num = scanner.nextInt();
		EvenOrOdd(num);

		// 2nd method
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " : " + testOddEvenByCheckingLSB(i));
		}

	}
}
