package DataStructureProgram;

import java.util.*;

public class CountTheNumberofTripletsWhoseSumIsEqualToTheGiven {
	static int TripleSum(int arr[], int target) {
		int ans = 0;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						ans++;
					}
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 6, 3 };
		int target = 12;

		System.out.println("Triple Sum : " + TripleSum(arr, target));

	}
}
