package BasicJavaProgram;

import java.util.*;

public class DisplayEvenNumberFrom1To100 {

	public static void main(String[] args) {

		System.out.println("Approach 1 : using For Loop");
		int num = 100;
		System.out.println("List of even Number from 1 to : " + num + ":");
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("Approach 2 : using while loop \n");
		int number = 100, i;
		i = 2;
		System.out.println("List of ven Number : ");
		while (i <= number) {
			System.out.print(i + " ");
			i = i + 2;
		}
	}
}
