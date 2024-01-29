package String;

public class StringConcatExample2 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "javatpoint";
		String s3 = "Reader";

		String s4 = s1.concat(s2);
		System.out.println(s4);

		String s5 = s1.concat(s2).concat(s3);
		System.out.println(s5);

	}
}
