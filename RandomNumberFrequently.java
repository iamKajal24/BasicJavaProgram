package BasicJavaProgram;

import java.util.Random;

public class RandomNumberFrequently {

	private static Object RandomStringUtils;

	public static void main(String[] args) {

		// Aporrach 1

		Random rand = new Random();
        
		System.out.println("Approach 1: ");
		int Rand_num = rand.nextInt(200);// range 0 and less than 100
		System.out.println(Rand_num);

		
		System.out.println("Apporoach 2 :");
		double rand_num1 = rand.nextDouble();
		System.out.println(rand_num1); // range 0.0 and less than 1.0

		// Approach2 - Math
		System.out.println("Approach 3 :");
         	System.out.println(Math.random());

		// Approach3 - Apache Common lang API
	}

}
