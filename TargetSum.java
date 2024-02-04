package DataStructureProgram;

//Find the total number of pairs in the Array Whose sum is equal to the Given Value x;
public class TargetSum {
	static int pairSum(int arr[], int target) {
		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					ans++;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 6, 3, 5, 8, 2,1 };
		int target = 7;

		System.out.println("Pair Sum : " + pairSum(arr, target));

	}
}
