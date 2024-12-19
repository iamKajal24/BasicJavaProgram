package BasicProgram;

public class Fibbonacci {
    public static int fibSumEvenIndexes(int num) {
        if (num <= 0) {
            return 0;
        }

        // Array to store Fibonacci numbers up to num
        int fib[] = new int[num + 1];
        fib[0] = 0;
        fib[1] = 1;

        int sum = 0;

        // Generate Fibonacci numbers and sum even indexes
        for (int i = 2; i <= num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (i % 2 == 0) {
                sum += fib[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 11;
        System.out.println("The sum of Fibonacci numbers at even indexes up to " + num + " is: " + fibSumEvenIndexes(num));
    }
}
