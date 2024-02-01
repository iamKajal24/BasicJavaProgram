package BasicJavaProgram;

public class ASCIIValue {

	public static void main(String[] args) {
		// 7 bits
		// 2^7=128
		// 0-127

		// All ASCII NUMBER
		System.out.println("All ASCII NUMBER : ");
		for (int i = 0; i < 127; i++) {
			System.out.println("The ASCII Value of " + (char) i + " = " + i);
		}

		// A TO Z ASCII WORDS
		System.out.println("A to Z ASCII  Value : ");
		for (int j = 65; j < 90; j++) {
			System.out.println("The ASCII Value of " + (char) j + " = " + j);
		}

		// a to z ASCII Words
		System.out.println("a to Z ASCII VALUE  : ");
		for (int k = 97; k < 122; k++) {
			System.out.println("The ASCII Value of " + (char) k + " = " + k);
		}

		char ch1 = 'd';
		char ch2 = 'g';

		// variable that store the integer value of the character

		int asciiValue1 = ch1;
		int asciiValue2 = ch2;

		System.out.println("The ASCII Value of " + ch1 + " is : " + asciiValue1);
		System.out.println("The ASCII Value of " + ch2 + " is : " + asciiValue2);
	}

}
