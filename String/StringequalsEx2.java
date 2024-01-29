package String;

public class StringequalsEx2 {

	public static void main(String[] args) {
		String s1 = "JavatPoint";
		String s2 = "JavatPoint";
		String s3 = "Geeks for Geeks";
		System.out.println(s1.equals(s2));
		if (s1.equals(s3)) {
			System.out.println("Both string are equal");
		} else {
			System.out.println("both string are unequla");
		}
	}
}
