package String4;

public class StringBufferReplace {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello java");
		sb.replace(1, 2, "hii");
		System.out.println(sb);
	}
}
