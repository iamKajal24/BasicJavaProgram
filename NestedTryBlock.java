package ExceptionHandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		try {
			// inner try block 1
			try {
				System.out.println("going to divide  by 0");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			// inner try block 2
			try {
				int a[] = new int[5];

				// assignment the value out of array bounds
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Other Statement");
		} catch (Exception e) {
			System.out.println("Handle the exception Occurs");
		}
		System.out.println("Normal Flow");

	}
}
