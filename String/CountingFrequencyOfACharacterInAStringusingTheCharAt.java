package String;

public class CountingFrequencyOfACharacterInAStringusingTheCharAt {

	public static void main(String[] args) {
		String str = "Welcome to javatpoint Portal";
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'j') {
				count++;
			}
		}
		System.out.println("Frequency of t is : " + count);
	}
}
