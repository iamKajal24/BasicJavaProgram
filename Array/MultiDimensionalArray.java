package Array;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		//initialize element 
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
		
		// find row and col
		  System.out.println("\nRows : " + arr.length);
		  System.out.println("Columns : " + arr[0].length);
		  
	}
}
