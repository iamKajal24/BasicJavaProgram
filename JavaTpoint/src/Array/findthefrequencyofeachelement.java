package Array;

public class findthefrequencyofeachelement {
//	static void Display(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}

	static void frequencyofechelement(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int count = 0;

			if (x == -1)
				continue;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == x) {
					count++;
					arr[j] = -1;
				}
			}
			System.out.println("Frequency of " + x + " is " + count);
		}

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		//System.out.println("Original Array : ");
		//Display(arr);
		System.out.println("\nfrequency of each of element :");
		frequencyofechelement(arr);
	}

}
