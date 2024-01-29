package String;

import java.util.Scanner;

public class CountingTheNumberOfVowelsInAStringByUsingTheCharAT {

	void Vowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				count++;
			}
		}
		System.out.println("Number of Vowels  : " + count);
	}

	public static void main(String[] args) {
		// String str = "Javatpoint is a great site for learning java";

		CountingTheNumberOfVowelsInAStringByUsingTheCharAT cc = new CountingTheNumberOfVowelsInAStringByUsingTheCharAT();

		Scanner sc = new Scanner(System.in);
		System.out.println("Input  : ");
		String str = sc.next();

		cc.Vowels(str);
	}

}
