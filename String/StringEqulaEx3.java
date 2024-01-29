package String;

import java.util.ArrayList;

public class StringEqulaEx3 {

	public static void main(String[] args) {
		String str1 = "mukesh";
		ArrayList<String> list = new ArrayList<>();
		list.add("ravi");
		list.add("Mukesh");
		list.add("Ramesh");
		list.add("Ajay");

		for (String Str : list) {
			if (Str.equals(str1)) {
				System.out.println("Mukesh  is present");
			}

		}
	}
}
