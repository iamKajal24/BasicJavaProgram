package Array;

public class CopyArray {
	static void Display(int arr1[]) {
		int n = arr1.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " "); // Corrected the index from 'i' to 'arr1[i]'
		}
	}

	static void COPY(int arr1[]) {
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 34, 5, 12 };
		System.out.println("Original Array:");
		Display(arr1);
		System.out.println("\nCopied Array:");
		COPY(arr1); // Call the COPY method with arr1 as an argument
	}
}
