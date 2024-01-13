package BasicJavaProgram;

public class factorial {

	public static void main(String[] args) {
		int fact = 1;
		int i, num = 5;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);

	}

}
