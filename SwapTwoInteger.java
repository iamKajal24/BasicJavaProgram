package DataStructureProgram;

import java.util.*;

public class SwapTwoInteger {
	static void Swap(int a, int b) {
		int temp;
		System.out.println("Original Values before swapping :");
		System.out.println("a : " + a + " " + "b :" + b);
		temp = a;
		a = b;
		b = temp;

		System.out.println("Original Values after swapping :");
		System.out.println("a : " + a + " " + "b :" + b);
	}

	public static void main(String[] args) {
		int a = 9;
		int b = 3;
		int arr[] = { 1, 2, 3, 4, 5 };
		Swap(a, b);

	}
}
