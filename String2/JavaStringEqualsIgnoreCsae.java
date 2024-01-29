package String2;

public class JavaStringEqualsIgnoreCsae {

	public static void main(String[] args) {
		String str = "javatPoint";
		String str1 = "Javatpoint";
		String str2 = "JAVATPOINT";
		String str3 = "Python";

		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equalsIgnoreCase(str3));
	}
}
