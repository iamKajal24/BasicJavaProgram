package STRING;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String  s1="Brag";
		String s2="Grab";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("Both are the String Not Anagram");
		}
		else {
			char[] string1=s1.toCharArray();
			char[] string2=s2.toCharArray();
			
			 Arrays.sort(string1);  
	         Arrays.sort(string2); 
	         
	         if(Arrays.equals(string1, string2)==true) {
	        	 System.out.println("Both the String are Anagram");
	         }
	         else {
	        	 System.out.println("Both the String are not anagram");
	         }	
		}
	}
}
