package BasicJavaProgram;

public class FibonacciSeriesWithRecursion {
	public static void PrintFibonacci(int n) {
		int first = 0, next = 1;
		for (int i = 2; i <= n - 2; i++) {
			int sum = first + next;
			System.out.println(sum);
			first = next;
			next = sum;
		}
	}

	public static int fib(int n) {
		if (n <= 1) {
			return n;

		}
		return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {
			System.out.println(fib(i));
		}
	}
}
