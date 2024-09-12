package Array;

public class AscendingOrder {

	public static void main(String[] args) {
		int arr[] = { 5, 28, 17, 32, 12, 10, 34 };
//		System.out.println("Original Array : ");
//		for (int val : arr) {
//			System.out.print(val + " ");
//		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nSorted Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
