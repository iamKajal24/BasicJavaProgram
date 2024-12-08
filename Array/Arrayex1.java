package Array;

public class Arrayex1 {
	public static void main(String[] args) {
		// declare an array of int
		int[] arr;
		// allocating memory for 5 integers.
		arr = new int[5];
		// initialize the elements of the array
        // first to last(fifth) element
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		// initialize the elements of the array
        // first to last(fifth) element
		System.out.println("Element at index : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("index " + i + ": "+ arr[i]);
		}
	}
}
