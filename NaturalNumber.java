package BasicJavaProgram;

public class NaturalNumber {

	public static void main(String[] args) {
		System.out.println("Approach 1 using for loop : ");
		int i, num = 10, sum = 0;
		for (i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of Natural Number is = " + sum);

		System.out.println("approach 2 Using while loop : ");
		int j=1,num1=20,sum1=0;
		while(j<=num1) {
			sum1 = sum1+j;
			j++;
		}
		System.out.println("sum of Natural number is = " + sum1);
	}
}
