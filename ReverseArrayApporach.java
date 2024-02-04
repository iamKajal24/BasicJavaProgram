package BasicJavaProgram;

public class ReverseArrayApporach {
	static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	static void reverse(int arr[]) {
		int i=0,j=arr.length-1;
		while(i<j) {
			swapInArray(arr,i,j);
			i++;
			j--;
		}
	}
	 static void swapInArray(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	public static void main(String []args0) {
		int arr[] = {23,43,56,76,87,98};
		reverse(arr);
		printArray(arr);
		
		
	}

}
