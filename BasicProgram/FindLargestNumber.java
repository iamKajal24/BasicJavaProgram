package BasicProgram;

public class FindLargestNumber {
	// if-else
	static int largestNumber(int x, int y, int z) {
		if (x >= y && x >= z) {
			return x;
		} else if (y >= x && y >= z) {
			return y;
		} else {
			return z;
		}
	}

	// ternary operator

//	largest  = 3>(5>10 ? 5:10) ? 3: ((5>10) ? 5:10);
//	largest  = 3>10 ? 3 : 10
//	largest  = 10

	static int largestNumber1(int x, int y, int z) {

		int ans = z > (x > y ? x : y) ? z : ((x > y) ? x : y);

		return ans;
	}

	
	public static void main(String[] args) {
		int x = 7, y = 20, z = 56;
		System.out.println("largest Number");
		int largest = largestNumber(x, y, z);
		System.out.println(largest);

		System.out.println(largestNumber1(x, y, z));

	}
}
