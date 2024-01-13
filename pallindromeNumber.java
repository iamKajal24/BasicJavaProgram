package BasicJavaProgram;

public class pallindromeNumber {

	public static void main(String[] args) {
		int rem, sum = 0, temp = 0;
		int n = 456;
		while (n > 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("It is not pallindrome");
		}

	}

}
