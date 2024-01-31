package String4;

public class StringBuilderCapacity {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());

		sb.append("hello");
		System.out.println(sb.capacity());

		sb.append("java is my favourite language");
		System.out.println(sb.capacity());
	}
}
