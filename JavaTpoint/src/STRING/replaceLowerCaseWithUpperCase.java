package STRING;

public class replaceLowerCaseWithUpperCase {

	public static void main(String[] args) {
		String str = "Great Power";
		StringBuffer str1 = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str1.charAt(i))) {
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + str1);
	}
}
