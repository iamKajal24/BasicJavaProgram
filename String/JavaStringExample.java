package String;

public class JavaStringExample {

	public static void main(String[] args) {
		String s1="java";
		char ch[]= {'s','t','r','i','n','g'};
		
		String s2 = new String(ch);//converting char array to string
		String s3 = new String("example");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
