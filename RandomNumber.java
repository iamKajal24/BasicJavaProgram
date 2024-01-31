package BasicJavaProgram;

//import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		// System.out.println(Math.random());

//		System.out.println(ThreadLocalRandom.current().nextInt());
//		System.out.println(ThreadLocalRandom.current().nextDouble());
//		System.out.println(ThreadLocalRandom.current().nextBoolean());

		int[] arrRandom = new int[10];
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int rand_number = random.nextInt(10111);
			while (rand_number % 2 != 0 || rand_number == 0) {
				rand_number = random.nextInt(101);
			}
			arrRandom[i] = rand_number;
		}
		for (int x = 0; x < arrRandom.length; x++) {
			System.out.println(arrRandom[x]+" ");
		}
	}
}
