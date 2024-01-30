package String3;

public class LengthExample4 {

	public static void main(String[] args) {
		String str = "welcome to javatpoint";
		int sizeWithWhiteSpace = str.length();
		System.out.println("In the String " + "'" + str + "'");

		str = str.replace(" ", "");
		int sizeWithoutWhiteSpace = str.length();

		// calculating the White Space

		int noOfWhiteSpace = sizeWithWhiteSpace - sizeWithoutWhiteSpace;
		System.out.println("Total number of WhiteSpace Present Are : " + noOfWhiteSpace);
	}
}
