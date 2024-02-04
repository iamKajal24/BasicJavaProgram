package BasicJavaProgram;

public class HowToReverseNumber {
	 
	static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	static int[] reverse(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		int j = 0;
		// traverse original array in reverse direction

		for (int i = n - 1; i >= 0; i--) {
			ans[j++] = arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 6, 7, 9 };
		int ans[] =reverse(arr);
		System.out.print("Before Reverse :");
		printArray(arr);
		System.out.print("After Reverse :");
		printArray(ans);
//		for(int i=0;i<ans.length;i++) {
//			System.out.println(ans[i]+" ");
//		}
		reverse(arr);

		// num=1234
		// remainder = 1234%10=4
		// reverse = 0*10+4 = 0+4=4
		// number=1234/10=123

//		System.out.println("Apporach 1  : Using While Loop");
//		int number = 234;
//		int rem, rev = 0;
//		while (number != 0) {
//			rem = number % 10;
//			number = number / 10;
//			rev = rev * 10 + rem;
//		}
//		System.out.println("The reverse of the given number is  : " + rev);
//
//		System.out.println("................................................");
//		System.out.println("Apporach 2 : using for Loop");
//
//		int number1 = 1234567;
//		int rev1 = 0;
//		for (; number1 != 0; number1 = number1 / 10) {
//			rem = number1 % 10;
//			rev1 = rev1 * 10 + rem;
//		}
//		System.out.println("The reverse of the given number is : " + rev1);
	}
}
