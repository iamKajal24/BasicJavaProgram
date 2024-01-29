package String2;

public class JavaStringFormat {

	public static void main(String[] args) {
		String name = "Kajal";
		String s1 = String.format("name is %s ", name);
		String s2 = String.format("value is %f", 32.33445);
		String s3 = String.format("value is % 32.12f", 332.44456);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
