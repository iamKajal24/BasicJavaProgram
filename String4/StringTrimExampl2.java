package String4;

public class StringTrimExampl2 {

	public static void main(String[] args) {
		String str = "  hello java String  ";
		System.out.println(str.length());// without trim
		System.out.println(str);

		String tr = str.trim();
		System.out.println(tr.length());
		System.out.println(tr);// with trim()

	}
}
