package String4;

public class StringBufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//default 16
		
		sb.append("hello");
		System.out.println(sb.capacity());
		
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());
	}

}
