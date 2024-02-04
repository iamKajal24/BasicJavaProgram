package DataStructureProgram;

public class SwapingTwoNumberWithoutTempVarible {
	static void Swap(int a, int b) {
		System.out.println("Original Values before swapping :");
		System.out.println("a : " + a + " " + "b :" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Original Values After swapping :");
		System.out.println("a : " + a + " " + "b :" + b);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int a = 10;
		int b = 3;
		Swap(a, b);
	}
}
