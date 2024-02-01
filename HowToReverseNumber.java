package BasicJavaProgram;

public class HowToReverseNumber {

	public static void main(String[] args) {
		// num=1234
		// remainder = 1234%10=4
		// reverse = 0*10+4 = 0+4=4
		// number=1234/10=123

		System.out.println("Apporach 1  : Using While Loop");
		int number = 234;
		int rem, rev = 0;
		while (number != 0) {
			rem = number % 10;
			number = number / 10;
			rev = rev * 10 + rem;
		}
		System.out.println("The reverse of the given number is  : " + rev);

		System.out.println("................................................");
		System.out.println("Apporach 2 : using for Loop");

		int number1 = 1234567;
		int rev1 = 0;
		for (; number1 != 0; number1 = number1 / 10) {
			rem = number1 % 10;
			rev1 = rev1 * 10 + rem;
		}
		System.out.println("The reverse of the given number is : " + rev1);
	}
}
