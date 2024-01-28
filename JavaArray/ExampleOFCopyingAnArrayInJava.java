package JavaArray;

public class ExampleOFCopyingAnArrayInJava {

	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

		char[] CopyTo = new char[7];

		// copying array using System.arraycopy() method

		System.arraycopy(copyFrom, 2, CopyTo, 0, 7);
		System.out.println(String.valueOf(CopyTo));
	}
}
