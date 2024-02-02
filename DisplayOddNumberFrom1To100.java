package BasicJavaProgram;

public class DisplayOddNumberFrom1To100 {

	public static void main(String[] args) {
		
		System.out.println("Approach 1 Using for loop ");
		int num = 100;
		System.out.println("List of Odd Number from 1 to : " + num + ":");
		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("Approach 2 using while loop ");
		int number = 100;
		int j = 1;
		System.out.println("List of Odd Number Frpm 1 to " + number + ":");
		while(j<=number) {
			System.out.print(j + " ");
			j=j+2;
		}
		
	}
}
