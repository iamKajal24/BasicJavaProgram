package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2_15 {
	static void printArray(int arr[] ){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		
		//Talking Input Array 
		
		Scanner sc= new Scanner(System.in) ;
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		System.out.println("Enter Array : " + n + " element");
		for(int i=0;i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original Array : ");
		printArray(arr);
		
		//int arr2[]=arr.clone();//deep copy
		//int []arr2 = Arrays.copyOf(arr, arr.length);
		int []arr2 = Arrays.copyOfRange(arr, 1,4);
		System.out.println("Copied Array : ");
		printArray(arr2);
		
		// changing Some values of arr2
		arr2[0] =0;
		arr2[2] =0;
  
		System.out.println("Original Array after changing arr2 ");
		printArray(arr);
		
		System.out.println("Copied arr2 After changing aar2 ");
		printArray(arr2);
	}
}
