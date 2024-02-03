package DataStructureProgram;

public class SearchTheGivenElementXInArrayIfPresentThenReturnTheIndexElseReturn {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8 };
		int x = 6;
		int ans = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				ans = i;
			}
		}
		System.out.println("Search an " + x + " index is " + ans);
	}

}
