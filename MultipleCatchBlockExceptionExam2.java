package ExceptionHandling;

public class MultipleCatchBlockExceptionExam2 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Of bounds Exception Occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception Occurs");
		}
		System.out.println("Rest of the code ");
	}
}
