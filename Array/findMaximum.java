package Array;

public class findMaximum {
	public static int findmax(int n[]) {
		int maximum = n[0]; // current element

		// initialize
		for (int n1 : n) {
			if (n1 > maximum) {
				maximum = n1;
			}
		}

		return maximum;
	}

	public static int findmin(int[] num) {
		int minimum = num[0];

		for (int num1 : num) {
			if (num1 < minimum) {
				minimum = num1;
			}
		}
		return minimum;
	}

	public static void main(String[] args) {
		int[] marks = { 125, 132, 95, 116, 110 };
		int max = findmax(marks);
		System.out.println(" maximum number : " + max);

		int min = findmin(marks);
		System.out.println(" minimum number : " + min);
	}
}
