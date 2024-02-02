package BasicJavaProgram;

import java.util.*;
// all positive number are natural number 1,2,3,4......n

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int i, num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Sum from : ");
		i = sc.nextInt();

		System.out.print("Sum upto :");
		num = sc.nextInt();

		while (i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.print("Sum of Natural num : " + sum);

	}

}
