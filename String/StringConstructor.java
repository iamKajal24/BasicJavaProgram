package String;

import java.nio.charset.Charset;

public class StringConstructor {
	
	//variable method
	static byte[] b_arr = {71,101,101,107,115};
	static Charset csCharset =Charset.defaultCharset();
	static char[] char_arr = {'G','e','e','k','s'};
	static int[] uni_Code = {71,101,101,107,115};
	static StringBuffer s_Buffer = new StringBuffer("Geeks");
	static StringBuilder s_Builder = new StringBuilder("Geeks");
	
	public static void main(String[] args) {
		
		// Method 1
        String s1 = new String(b_arr);
        System.out.println("Method 1: " + s1);
        System.out.println();

        // Method 2
        String s2 = new String(b_arr, csCharset);
        System.out.println("Method 2: " + s2);
        System.out.println();

        // This is alternative way for Method 2
        String s3 = new String(b_arr, Charset.forName("US-ASCII"));
        System.out.println("Method 2 Alternative: " + s3);
        System.out.println();

        // Method 3
        String s4 = new String(b_arr, 1, 3);
        System.out.println("Method 3: " + s4);
        System.out.println();

        // Method 4
        String s5 = new String(b_arr, 1, 3, csCharset);
        System.out.println("Method 4: " + s5);
        System.out.println();

        // This is alternative way for Method 4
        String s6 = new String(b_arr, 1, 4, Charset.forName("US-ASCII"));
        System.out.println("Method 4 Alternative: " + s6);
        System.out.println();

        // Method 5
        String s7 = new String(char_arr);
        System.out.println("Method 5: " + s7);
        System.out.println();

        // Method 6
        String s8 = new String(char_arr, 1, 3);
        System.out.println("Method 6: " + s8);
        System.out.println();

        // Method 7
        String s9 = new String(uni_Code, 1, 3);
        System.out.println("Method 7: " + s9);
        System.out.println();

        // Method 8
        String s10 = new String(s_Buffer);
        System.out.println("Method 8: " + s10);
        System.out.println();

        // Method 9
        String s11 = s_Builder.toString();
        System.out.println("Method 9: " + s11);
        System.out.println();
		
		
	}
}
