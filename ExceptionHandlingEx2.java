package ExceptionHandling;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
		try {
			int data = 100 / 0; // may thrown exception
		} catch (Exception e) {
			// displaying the custom message
			System.out.println("Can't divided by zero");
		}
	}
}
