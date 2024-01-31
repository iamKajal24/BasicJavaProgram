package String4;

public class StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello java");
		sb.delete(0, 5);
		System.out.println(sb);
	}
}
