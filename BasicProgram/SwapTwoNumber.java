package BasicProgram;

public class SwapTwoNumber {
	// with third Variable
	static void swap1(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;

		System.out.println("value of a is " + a + " and value of b is " + b);
	}

	// without third variable
	static void swap2(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("value of a is " + a + " and value of b is " + b);
	}

	// swapping the alues using Operattor
	static void swap3(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("value of a is " + a + " and value of b is " + b);
	}

	// Using arithmetic operators

	static void swap4(int a, int b) {

		a = (a + b) - (b = a);

		System.out.println("value of a is " + a + " and value of b is " + b);
	}

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		System.out.println("With third variable using :");
		swap1(a, b);

		System.out.println("Without third Variable using swap :");
		swap2(a, b);

		System.out.println("swapping the values using Operattor");
		swap3(a, b);

		System.out.println("Using arithmetic operators");
		swap4(a, b);
	}
}
