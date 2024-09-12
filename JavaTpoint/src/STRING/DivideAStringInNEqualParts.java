package STRING;

public class DivideAStringInNEqualParts {

	public static void main(String[] args) {
		String s = "aaaabbbbcccc";
		// String s="kajal";
		int len = s.length();
		int n = 3;
		int temp = 0, chars = len / n;
		String[] str = new String[n];
		if (len % n != 0) {
			System.out.println("Sorry this String Cannot be divided " + n + " equal parts");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				String part = s.substring(i, i + chars);
				str[temp] = part;
				temp++;
			}
			System.out.println(n + "equal part of given String are ");
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
