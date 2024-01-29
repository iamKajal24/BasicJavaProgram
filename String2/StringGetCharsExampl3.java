package String2;

public class StringGetCharsExampl3 {

	public static void main(String[] args) {
		String str = new String("Welcome to javatpoint ");
		char[] ch = new char[20];
		try {
			str.getChars(1, 26, ch, 0);
			System.out.println(ch);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
