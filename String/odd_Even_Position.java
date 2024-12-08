package String;

public class odd_Even_Position {
	public static void main(String[] args) {
		String str = "GeeksforGeeks";

		// odd Positions
		System.out.println("Odd Position ");
		for (int i = 0; i < str.length(); i += 2) {
			System.out.print(str.charAt(i) + " ");
		}

		// even position
		System.out.println("\nEven Position ");
		for (int i = 1; i < str.length(); i += 2) {
			System.out.print(str.charAt(i) + " ");
		}
	}
}
