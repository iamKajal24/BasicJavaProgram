package String;

public class String_Occurrence {
	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		int count =0;
		for(int i =0;i<str.length();i++) {
			//counting  e in string
			if(str.charAt(i) =='e')
				count++;
		}
		
		//printing occurence
		
		System.out.println("Count  the occurence of e : " + count);
	}
}
