package String3;

public class StringInternMethod {

	public static void main(String[] args) {
		String str = "Javatpoint";
		String str1 = str.intern();
		String str2 = new String("JavatPoint");
		String str4 = str2.intern();

		System.out.println(str);
		System.out.println(str == str1);
		System.out.println(str1 == str2);
		System.out.println(str2 == str4);

	}

}
