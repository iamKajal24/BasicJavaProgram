package BasicJavaProgram;

public class FactorialWithRecursion {
	public static int factorial(int n) {
		if (n==0)
			return 1;
		else 
			return (n*factorial(n-1));
		
	}
	
	public static void main(String[] args) {
		int i,fact=1,num=5;
		fact=factorial(num);
		System.out.println("factorial of " + num + " is " + fact);
	}

}
