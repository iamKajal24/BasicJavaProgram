package Array;

public class DuplicateElement {
//	static int duplicate(int arr[]) {
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[j]!=arr[i]) {
//				arr[j++]=arr[i];
//			}
//		}
//		return j+1;
//	}
	
	static void removeduplicate(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean isduplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isduplicate=true;
					break;
				}
			}
			if(!isduplicate) {
				System.out.print(arr[i]);
				if(i!=arr.length-1) {
					System.out.print(" ");
				}
			}
		}
	}

	
	public static void main(String[] args) {
		int arr[]= {2,2,3,4,5,6,5,5,4};
		System.out.print("Remove Duplicate Elements: ");
        removeduplicate(arr);
	}
}

