package String;

public class StringTrim {
	public static void main(String[] args) {
		String x = "geeks ";
		String y = "for ";
		String z = " geeks";
		System.out.println("Original String : " + x+y+z);
		System.out.println("Trimed String  : " + x.trim()+y.trim()+z.trim());
	}
}
