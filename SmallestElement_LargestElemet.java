package DataStructureProgram;

import java.util.Arrays;

public class SmallestElement_LargestElemet {
	static int[] smallestAndLargetest(int arr[]) {
		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		int ans[] = { arr[0], arr[arr.length - 1] };
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 8, 1, 3, 6, 2 };
		int min;
		int max;
		smallestAndLargetest(arr);
		int ans[] = smallestAndLargetest(arr);
		System.out.println("smallest : " + ans[0]);
		System.out.println("largest : " + ans[1]);
		

	}

}
