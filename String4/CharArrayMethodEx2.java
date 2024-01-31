package String4;

public class CharArrayMethodEx2 {

	public static void main(String[] args) {
		String str = "Welcome to Javatpoint";
		char[] ch = str.toCharArray();
		int len = ch.length;
		System.out.println("Char Array Length : " + len);
		System.out.println("Char Array Element");

		for (int i = 0; i < len; i++) {
			System.out.println(ch[i]);
		}

	}
}
