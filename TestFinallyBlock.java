package ExceptionHandling;

public class TestFinallyBlock {

	public static void main(String[] args) {
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		// executed regardless of exception occurred or not

		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("Rest of the code");
	}
}
