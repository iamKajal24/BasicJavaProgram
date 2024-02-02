package BasicJavaProgram;

import java.util.*;

public class PositiveAndNegativeFind {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("Positive number ");
		} else if (num < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("Neither positive or Nor Negative Number ");
		}
	}
}
