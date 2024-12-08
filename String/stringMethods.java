package String;

import java.util.Arrays;

public class stringMethods {
	public static void main(String[] args) {
		// length
		String s1 = "Kajal";
		System.out.println(s1.length());

		String s2 = "";
		System.out.println(s2.length());

		// charAt() Method
		String str = "Java String charAt() Example";
		char ch = str.charAt(8);
		System.out.println("character : " + ch);

		// substring()
		String str1 = new String("   Welcome to geeksforgeeks   ");
		String s = str1.substring(6);
		System.out.println("substring : " + s);

		// String substring(begIndex, endIndex)
//		beginIndex :  the begin index, inclusive.
//		endIndex :  the end index, exclusive.
		String st = str1.substring(6, 10);
		System.out.println("Substring 2 : " + st);

		// String concat() Method

		String concate = s1.concat(" Pandit ");
		System.out.println("concat : " + concate);

		// String indexOf() Method
		int indexString = str1.indexOf('g');
		System.out.println("found g first at position : " + indexString);

		// indexOf(char ch, int strt)
		int indexSt1 = str1.indexOf('g', 13);
		System.out.println("found g after 13th index at position : " + indexSt1);

		// indexOf(String str)
		String str2 = "geeks";
		System.out.println("Found geeks starting at positions : " + str1.indexOf(str2));

		// indexOf(String str, int strt)
		System.out.println("Found geeks starting at position : " + str1.indexOf(str2, 14));
		
		// lastIndexOf() Method 
		System.out.println("Last IndexOf Method : " + str1.lastIndexOf('s'));
		
		//equals() method
		System.out.println("equals method: " + s1.equals(str2));
		
		//String equalsIgnoreCase()
		
		System.out.println("equalsIgnore Case : " + s1.equals(str2));
		
		//String CompareTo method
		System.out.println("Compare to  : " + str1.compareTo(str2));
		
		//String toLowerCase()
		System.out.println("Lower Case : " + str1.toLowerCase());
		
		//String toUpper Case()
		System.out.println("Upper Case : " + str1.toUpperCase());
		
		System.out.println("Original string : " + str1);
		System.out.println("Triming string : " + str1.trim());
		
		// replace String 
		
		System.out.println("replace String : " + s1.replace('l', 'd'));
		System.out.println("replace String : " + s1.replace(" ", "_"));
		
		//String Contains() method
		System.out.println("Contains Method :" + str1.contains("geeks"));
		
		//String toCharArray()
		String s3 = "miss kajal";
	    char [] ca= s3.toCharArray();
	    System.out.println("char array :" + new String(ca));
		System.out.println("Char array (using Arrays.toString): "+ Arrays.toString(ca));
		
		
		

	}
}
