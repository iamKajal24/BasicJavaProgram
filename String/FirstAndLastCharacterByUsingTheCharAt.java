package String;

public class FirstAndLastCharacterByUsingTheCharAt {

	public static void main(String[] args) {
		String Str = "Welcom to javatPoint portal";
		
		int strLength = Str.length();
		System.out.println("Character at 0 index is : " + Str.charAt(0));
		System.out.println("Character at Last index is : " + Str.charAt(Str.length()-1));
		
	}

}
