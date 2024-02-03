package DataStructureProgram;

public class CalculateTheMaximumValueOutOfAllTheElementInTheArray {

	public static void main(String[] args) {

		int arr[] = { 76, 98, 42, 108 }; // ans=108
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ans) {
				ans = arr[i];
			}
		}
		System.out.println("Maximum Element in the Array  :" + ans);
	}
}
