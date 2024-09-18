package Array;

public class Array16 {
	static int pairSum(int arr[], int target) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					ans++;
				}
			}
		}

		return ans;
	}

	static int triplets(int arr[], int target) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						ans++;
					}
				}
			}
		}
		return ans;
	}

	static int findUnique(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
	}

	static int FirstRepeatNum(int arr[]) {

		for (int i = 0; i < arr.length; i++) {// 1st num
			for (int j = i + 1; j < arr.length; j++) {// 2nd num
				if (arr[j] == arr[i]) {// found ans
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Array16 obj = new Array16();
//	int arr[]= {3,4,6,7,2,5};
		int arr[] = { 1, 2, 3, 4, 2, 3, 1 };
		// int arr[] = {1,2,3,2};
		int target = 10;
//		obj.pairSum(arr, target);
		System.out.println("Pair Sum " + obj.pairSum(arr, target));

		System.out.println("triplet :" + obj.triplets(arr, target));

		System.out.println("Find Unique element :" + obj.findUnique(arr));

		System.out.println("First Repeating Number : " + obj.FirstRepeatNum(arr));
	}
}
