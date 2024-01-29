package String;

public class StringConcatExamp3 {

	public static void main(String[] args) {
		String s11 = "hello";
		String s22 = "JavatPoint";
		String s33 = "Reader";
		String s44 = s11.concat(" ").concat(s22).concat(" ").concat(s33);
		System.out.println(s44);

		String s55 = s11.concat("!!!");
		System.out.println(s55);

		String s66 = s11.concat("@").concat(s22);
		System.out.println(s66);
	}
}
