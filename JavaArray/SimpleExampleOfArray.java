package JavaArray;

public class SimpleExampleOfArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 10; // initialization
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// travarsing Array

		for (int i = 0; i <= arr.length; i++) {  //length is the property of array
			System.out.println("array is : " + arr[i]);
		}
	}
}
