package String4;

public class SubstringExample {

	public static void main(String[] args) {
		String[] str = { "Praveen Kumar", "Yuvraj Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli",
				"Rohit Sharma", "Sandeep Singh", "Milkha Singh" };

		String SurName = "Singh";
		int surNameSize = SurName.length();
		int size = str.length;

		for (int i = 0; i < size; i++) {
			int length = str[i].length();
			// System.out.println(length);
			String subStr = str[i].substring(length - surNameSize);
			// System.out.println(subStr);

			if (subStr.equals(SurName)) {
				System.out.println(str[i]);
			}
		}
	}

}
