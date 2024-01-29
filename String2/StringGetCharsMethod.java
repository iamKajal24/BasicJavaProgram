package String2;

public class StringGetCharsMethod {

	public static void main(String[] args) {
		String str = new String("Hello Javatpoint How are you");
		char[] ch = new char[10];
		try {
			str.getChars(6, 16, ch, 0);
			System.out.println(ch);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
