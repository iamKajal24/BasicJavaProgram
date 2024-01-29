package String2;

import java.util.ArrayList;

public class JavaStringEqualsIgnoreExamp2 {

	public static void main(String[] args) {
		String str1 = "Kajal Pandit";
		ArrayList<String> list = new ArrayList<>();
		list.add("Riya");
		list.add("Riyu");
		list.add("Kaju");
		list.add("Kajal Pandit");
		list.add("Khushi");

		for (String str : list) {
			if (str.equalsIgnoreCase(str1)) {
				System.out.println("Kajal Pandit is Present");
			} 
		}
	}
}
