package Array;

public class SUMandPRODUCT {

	public static void sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum is :  " +sum);
	}

	public static void product(int arr[]) {
		int product =1;
		for(int i=0;i<arr.length;i++) {
			product *= arr[i];
		}
		System.out.println("Product is  : " + product);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 5, 4 };

		// passing array to method m1
		sum(arr);
		product(arr);
		
	}
}
