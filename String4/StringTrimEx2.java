package String4;

public class StringTrimEx2 {

	public static void main(String[] args) {
		String str = "abc";
		if ((str.trim()).length() > 0) {
			System.out.println("The String contains character other than white space \n");
		} else {
			System.out.println("The String contains only white space \n");
		}

		str = " ";
		if ((str.trim()).length() > 0) {
			System.out.println("The string contains character other than white space \n");
		} else {
			System.out.println("The string contains only white spaces\n");
		}

	}

}
