package String4;

public class StringBufferInsert {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.insert(1, "java");
		System.out.println(sb);
	}
}
