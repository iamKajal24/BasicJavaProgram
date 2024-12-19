package BasicProgram;

public class ConstantOrVowels_Check {
	public static void character(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("It is a vowels..");
		} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("It is a vowels ");
		} else {
			System.out.println("It is a constant..");
		}
	}

	public static void main(String[] args) {
		char c = 'A';
		character(c);
	}
}
