package String3;

public class ReplaceRemoveWhiteSpace {

	public static void main(String[] args) {
		String s1 = "My name is Kajal . My name Pandit. My name is Riya";
		String replaceString = s1.replaceAll("\\s", "");
		System.out.println(replaceString);
	}
}
