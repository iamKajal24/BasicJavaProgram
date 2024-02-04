package DataStructureProgram;

public class FindTheSecondLargestNumber {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int findLarge(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int findSecondMax(int arr[]) {
		int max = findLarge(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondMax = findLarge(arr);
		return secondMax;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 6, 2 };
		FindTheSecondLargestNumber print;
		// System.out.println("First Max Value : " + SecondLarge(arr));
//		int max = findLarge(arr);
//		int secondMax = findLarge(arr);
//		return secondMax;
		System.out.println("Given an Array Element : ");
		printArray(arr);
		System.out.println("First Maximum Element : " + findLarge(arr));
		System.out.println("Second Maximum Element : " + findSecondMax(arr));
	}
}
