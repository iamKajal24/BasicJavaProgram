package BasicProgram;

import java.util.Scanner;

public class AllPrimeNumber1toN {
	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min value : ");
		int min = sc.nextInt();
		System.out.println("Enter max value  : ");
		int max = sc.nextInt();
		System.out.println("All prime Number : ");

		for (int num = min; num <= max; num++) {
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.print(num + " ");
			}
			flag = 0;
		}
	}
}
