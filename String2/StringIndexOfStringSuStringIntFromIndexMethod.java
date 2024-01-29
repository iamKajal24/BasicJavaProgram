package String2;

public class StringIndexOfStringSuStringIntFromIndexMethod {

	public static void main(String[] args) {
		String s1 = "This is indexOf method";

		int index = s1.indexOf("method", 10);
		System.out.println("index of SuBstring : " + index);

		index = s1.indexOf("method", 20);
		System.out.println("index of Substring " + index);

	}

}
