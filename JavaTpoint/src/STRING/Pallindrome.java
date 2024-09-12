package STRING;

public class Pallindrome {

	public static void main(String[] args) {
		String str = "MADAM";
		boolean flag = true;
		str = str.toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Given string is pallindrome ");
		} else {
			System.out.println("Given String is not Pallindrome ");
		}
	}
}
