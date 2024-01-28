package JavaArray;

public class CloningANArrayInJava {

	public static void main(String[] args) {
		int arr[] = { 33, 3, 4, 5 };
		System.out.println("Printing Original Array :");
		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println("Printing Cloning of the Array : ");
		int carr[] = arr.clone();
		for (int i : carr) {
			System.out.println(i);
		}

		System.out.println("Are both equal ? ");
		System.out.println((carr == arr));

	}

}
