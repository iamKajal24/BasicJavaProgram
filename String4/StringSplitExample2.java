package String4;

public class StringSplitExample2 {

	public static void main(String[] args) {
		String s1 = "Welcome to Split Word";
		System.out.println("Returning Words :");
		String[] words1 = s1.split("\\s");
		for (String w1 : words1) {
			System.out.println(w1);
		}

		System.out.println("Returning words : ");
		System.out.println(s1);

		System.out.println("Returning Words : ");
		for (String w : s1.split("\\s", 2)) {
			System.out.println(w);
		}
	}
}
