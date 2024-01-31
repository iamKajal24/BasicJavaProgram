package String4;

public class SplitMethodWithRegexAndLengthExmple2 {

	public static void main(String[] args) {
		String s1 = "Javatpointtt";
		System.out.println("Returning Words ");
		String[] arr = s1.split("t");
		for (String w : arr) {
			System.out.println(w);
		}
		System.out.println("split array length : " + arr.length);
	}
}
