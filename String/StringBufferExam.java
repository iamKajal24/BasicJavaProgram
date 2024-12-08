package String;

public class StringBufferExam {
	public static void main(String[] args) {

//		Constructors of StringBuffer Class

		// StringBuffer s = new StringBuffer();
		// StringBuffer s = new StringBuffer(20);
		// StringBuffer s=new StringBuffer("Hello Worlds");

		StringBuffer sBuffer = new StringBuffer();
		// add
		sBuffer.append("Kajal");
		String str = sBuffer.toString();
		System.out.println(str + " ");

		// insert
		sBuffer.insert(1, "Riya");
		System.out.println(sBuffer);

		// replace
		sBuffer.replace(1, 3, "Java");
		System.out.println("Replace : " + sBuffer);

		// delete
		sBuffer.delete(1, 3);
		System.out.println("Delete : " + sBuffer);

		// charAt
		System.out.println("Character : " + sBuffer.charAt(5));

		// deleteCharacter
		System.out.println("Delete Character : " + sBuffer.deleteCharAt(5));

		// length
		int s = sBuffer.length();
		System.out.println("Length : " + s);

		// reverese
		sBuffer.reverse();
		System.out.println("Reverse : " + sBuffer);

		// capacity
		System.out.println("Capacity : " + sBuffer.capacity());
		sBuffer.append("hello");
	}
}
