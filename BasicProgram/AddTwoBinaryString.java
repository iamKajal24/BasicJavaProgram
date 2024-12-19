package BasicProgram;

public class AddTwoBinaryString {
	static String addBinary(String x, String y) {

		int num1 = Integer.parseInt(x, 2);
		int num2 = Integer.parseInt(y, 2);

		int sum = num1 + num2;
		String result = Integer.toBinaryString(sum);

		return result;
	}

	static String addBinary1(String x1, String y1) {

		int num1 = Integer.parseInt(x1, 2);
		int num2 = Integer.parseInt(y1, 2);
		int sum1 = num1 + num2;
		String result = Integer.toBinaryString(sum1);
		return result;
	}

	public static void main(String[] args) {
		String x = "10", y = "01";
		String x1 = "110", y1 = "011";
		System.out.println(addBinary(x, y));
		System.out.println(addBinary1(x1, y1));
	}
}



//The Art of letting go 
//vo afsana jise anjaam tak laana na ho mumkin , use ek khoobsurat mod de kar chodna acha hai 