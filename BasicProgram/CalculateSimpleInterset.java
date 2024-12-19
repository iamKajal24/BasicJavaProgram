package BasicProgram;

import java.util.Scanner;

public class CalculateSimpleInterset {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
	    System.out.println("enter Principal amount :" );
	    int p= scanner.nextInt();
	    System.out.println("Enter time : ");
	    int t=scanner.nextInt();
	    System.out.println("enter rate : ");
	    int r = scanner.nextInt();
	    
	    int si = (p*t*r)/100;
	    System.out.println("Result is : " + si);
	
	}
}
