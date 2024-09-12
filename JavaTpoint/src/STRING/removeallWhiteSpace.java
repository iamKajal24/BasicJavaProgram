package STRING;

public class removeallWhiteSpace {

	public static void main(String[] args) {
		String str1 = "Remove White Spaces";
		str1 = str1.replaceAll("\\s", "");
		System.out.println("String after removing all the white Spaces : " + str1);
	}
}
