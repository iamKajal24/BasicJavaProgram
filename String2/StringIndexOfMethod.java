package String2;

public class StringIndexOfMethod {

	public static void main(String[] args) {
		String s1 = "this is index of example";
		int index1 = s1.indexOf("is");// passing substring
		int index2 = s1.indexOf("index");
		System.out.println(index1 + " " + index2);

		// passing sustring with from index

		int index3 = s1.indexOf("is", 4);
		System.out.println(index3);

		int index4 = s1.indexOf('s');
		System.out.println(index4);
	}
}
