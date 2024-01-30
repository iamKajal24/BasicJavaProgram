package String3;

public class ReplaceAllInsertSpaceBetweenChar {

	public static void main(String[] args) {
		String str = "Javatpoint";
		System.out.println("String is : " + str);

		String regex = "";
		str = str.replaceAll(regex, " ");
		System.out.println("String is : " + str);
	}
}
