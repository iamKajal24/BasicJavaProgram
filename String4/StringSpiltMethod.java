package String4;

public class StringSpiltMethod {

	public static void main(String[] args) {
		String s1 = "java String Split Method By Javatpoint";
		String words[] = s1.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
	}

}
