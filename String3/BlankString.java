package String3;

public class BlankString {

	public static void main(String[] args) {
		String str = " ";
		int size = str.length();

		if (size == 0) {
			System.out.println("The String is Empty ");
		} else if (size > 0 && str.trim().isEmpty()) {
			System.out.println("The string is blank");
		} else {
			System.out.println("The String is not blank");
		}
		str = "welcome to javapoint";
		size = str.length();
		if (size == 0) {
			System.out.println("The String is Empty");
		} else if (size > 0 && str.trim().isEmpty()) {
			System.out.println("The String is Blank");
		} else {
			System.out.println("The string is not blank");
		}

	}

}
