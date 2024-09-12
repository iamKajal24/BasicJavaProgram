package Array;

public class RightRotate {
	static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void rotate(int arr[], int d, int n) {
		d = d % n;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int d = 2; // Number of rotations
		rotate(arr, d, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
