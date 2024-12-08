package String;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello World ");
		// append
		System.out.println("String : " + str);
		
		// append
//		str.appendCodePoint(67);
		System.out.println("String code Point : " + str);
		
		//charAT
		char ch = str.charAt(2);
		System.out.println("Character : " + ch);
		
		

	}
}
