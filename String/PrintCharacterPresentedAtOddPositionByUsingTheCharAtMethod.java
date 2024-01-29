package String;

public class PrintCharacterPresentedAtOddPositionByUsingTheCharAtMethod {

	public static void main(String[] args) {
		String str = "welcome to Javatpoint Portal";
		for (int i = 0; i < str.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("char At " + i + " place " + str.charAt(i));
			}
		}
	}
}
