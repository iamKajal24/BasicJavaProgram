package BasicJavaProgram;
 import java.util.Scanner;
public class FindArmstrongNumber {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number :  ");
		number=sc.nextInt();
	}
	public static boolean isArmstrong(int n) {
		int digits=0;
		int sum = 0;
		int temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		System.out.println("number of digits :" + digits);
		int r = 0;
		int lastDigit=r;
		while(temp>0) {
			int lastDigit1=temp%10;
			sum=sum+(r*r*r);
		}
		System.out.println("sum is :" + sum);
		if(sum==n)
			return true;
		else {
			return false;
		}
	
	}

}
