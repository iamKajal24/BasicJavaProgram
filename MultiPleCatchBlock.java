package ExceptionHandling;

public class MultiPleCatchBlock {

	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurs");
		} catch (Exception e) {
			System.out.println("Exception Occurs");
		}
		System.out.println("Rest of the COde");
	}
}
