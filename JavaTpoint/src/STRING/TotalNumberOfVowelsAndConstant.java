package STRING;

public class TotalNumberOfVowelsAndConstant {

	public static void main(String[] args) {
		String s = "This is a really simple sentence";
		int Vcount = 0;
		int Concount = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				Vcount++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				Concount++;
			}
		}
		System.out.println("Number of Vowels :" + Vcount);
	    System.out.println("Number of Constant : " + Concount);
	
	}
}
