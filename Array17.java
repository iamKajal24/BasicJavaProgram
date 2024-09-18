package Array;

public class Array17 {
	
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
     static void swap(int i, int j) {
		System.out.println("Original Value before Swap : ");
		System.out.println("a : " + i);
		System.out.println("b : " + j);

		int temp = i;
		i = j;
		j = temp;

		System.out.println("Original Value After Swap Swap : ");
		System.out.println("a : " + i);
		System.out.println("b : " + j);
	}

	static void WithoutThirdSwAP(int a, int b) {
		//System.out.println("Original Value before Swap : ");
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Without third Variable Original Value After Swap : ");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

	static int[] reverse(int arr[]) {
		int ans[] = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			ans[j++] = arr[i];
		}
		return ans;
	}

	
	static void swap2(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void inPlaceReverse(int[] arr, int i, int j) {
//		int i = 0;
//		int j = arr.length - 1;
		while (i < j) {
			swap2(arr, i, j);
			i++;
			j--;
		}
	}

	
	static int[] roatate(int arr[], int k) {
		
		int n=arr.length;
		k=k%n;
		int [] ans = new int [n];
		int j=0;
		
		for(int i = n-k;i<n;i++) {
			ans[j++] = arr[i];
		}
		
		for(int i=0;i<n-k;i++) {
			ans[j++] = arr[i];
		}
		return ans;	
	}
	
	
	static void rotateInPlace(int arr[], int k) {
		int n =arr.length;
		k =k%n;
		
		inPlaceReverse(arr, 0 ,n-k-1);
		inPlaceReverse(arr, n-k,n-1);
		inPlaceReverse(arr, 0, n-1);
		
	}
	
	
	
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		int arr[] = { 1, 2, 3, 4, 5, 9};
		
		int k=3;

		swap(a, b);

		WithoutThirdSwAP(a, b);

		int ans[] = reverse(arr);
		System.out.println("Reverse Number :");
		printArray(arr);
		
		
         System.out.println();
         
         
		inPlaceReverse(arr, b, k);;
		System.out.println("InPlace Reverse Number :");
		printArray(arr);

//*************************************************************************************
		
//		System.out.println("Original Given Array  :");
//		printArray(arr);
		
		int ans1[] = roatate(arr, k);
		System.out.println("Array after Rotation ");
		printArray(arr);
		
		rotateInPlace(arr, k);
		//printArray(arr);
		
	}
}
