package JavaArray;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int arr[] = { 50, 89, 87, 32 };
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
