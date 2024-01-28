package JavaArray;

public class AnonymousArrayInJava {
	static void PrintArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		PrintArray(new int[] { 10, 22, 44, 66 });// passing anonymous array to method

	}
}
