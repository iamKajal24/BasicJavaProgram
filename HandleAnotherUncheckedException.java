package ExceptionHandling;

public class HandleAnotherUncheckedException {

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2, 5, 6 };
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the Code");
	}
}
