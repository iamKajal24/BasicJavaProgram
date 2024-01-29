package String;

public class JavaStringCompareToCaseSensitive {

	public static void main(String[] args) {
		String s1 = new String("INDIA IS MY COUNTRY");
		String s2 = new String("India is my Country");
		System.out.println(s1.compareTo(s2));
	}
}
