package Array;

public class PrintTheElementOfAnArrayPresentOnEvenPosition {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		for (int val : arr) {
			System.out.print(val+" ");
		}
		System.out.println("even position :");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i]+" ");
		}

	}

}
