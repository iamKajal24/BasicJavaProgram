package ExceptionHandling;

class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		super(str);
	}
}

public class ThrowingUserDefinedException {

	public static void main(String[] args) {
		try {

		} catch (UserDefinedException ude) {
			System.out.println("caught the exception");
		}
		System.out.println(ude.getMessage());
	}

}
