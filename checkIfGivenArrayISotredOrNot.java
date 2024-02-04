package DataStructureProgram;

import java.util.*;

public class checkIfGivenArrayISotredOrNot {
	static boolean isSorted(int[] arr) {
		boolean check = true;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7 };
		System.out.println("IS SORTED : " + isSorted(arr));
	}
}
