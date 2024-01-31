package String4;

public class StringBuilderDelete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(" HEllo java");
		sb.delete(1, 6);
		System.out.println(sb);
	}
}
