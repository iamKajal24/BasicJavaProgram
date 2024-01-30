package String3;

public class StringJoinExample2 {

	public static void main(String[] args) {
		String date = String.join("/", "24", "06", "1999");
		System.out.println(date);
		String time = String.join(":", "12", "10", "10");
		System.out.println(time);
	}
}
