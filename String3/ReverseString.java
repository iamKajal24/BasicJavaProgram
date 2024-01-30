package String3;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Welcome to Javatpoint";
		int size= str.length();
		System.out.println("Reverse of the String : " + "'"+ str +"'"+ "" + " is ");
		for(int i=0;i<size;i++) {
			System.out.print(str.charAt(str.length()-i-1));//Priniting in reverse order
		}
	}
}
