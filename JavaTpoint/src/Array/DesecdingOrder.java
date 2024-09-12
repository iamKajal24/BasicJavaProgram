package Array;

public class DesecdingOrder {

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 3, 4, 76, 13, 45, 30 };
		System.out.println("Original Array :");
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println("\nSorted Array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
