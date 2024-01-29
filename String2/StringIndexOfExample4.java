package String2;

public class StringIndexOfExample4 {

	public static void main(String[] args) {
		String str = "welcome to javatpoint";
		int count = 0;
		int startForm = 0;
		for (;;) {
			int index = str.indexOf('o', startForm);
			if (index >= 0) {
				count = count + 1;
				startForm = index + 1;
			} else {
				break;
			}
		}
		System.out.println("In the String " + str + " :");
		System.out.println("The character has come " + count + " times");
	}

}
