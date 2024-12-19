package BasicProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindLargestNumberExam {

	public static void main(String[] args) {
		int x = 7, y = 20, z = 56;

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(x);
		list.add(y);
		list.add(z);

		// print -> 1 st method
		System.out.println(Collections.max(list) + " is the largest number");

		// print 2 nd method

		// Initialize a variable to store the largest number
		final int[] largest = { Integer.MIN_VALUE };

		// use for each method
		list.forEach(number -> {
			if (number > largest[0]) {
				largest[0] = number;
			}
		});

		// print
		System.out.println(largest[0]);
	}
}
