package Array;

public class PrintTheElementOfAnArrayPresentOnOddPosition {

	public static void main(String[] args) {
		int arr[]=new int[] {1, 2, 3, 4, 5};
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}

}
