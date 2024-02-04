package DataStructureProgram;

public class FindFirstRepeatingNumber {
	static int firstRepeat(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//int arr[] = { 3, 4, 5,4, 6, 7, 5, 8 };
		int arr[]= {2,3,4,5,6,7,8};
		
		System.out.println("First Repeating Number : " + firstRepeat(arr));
	}
}
