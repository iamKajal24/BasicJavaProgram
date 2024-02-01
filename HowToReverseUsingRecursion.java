package BasicJavaProgram;

import java.util.Scanner;

public class HowToReverseUsingRecursion {
    int rev = 0;

    int reverse(int num) {
        if (num == 0) {
            return rev;
        } else {
            rev = ((rev * 10) + (num % 10));
            return reverse(num / 10);
        }
    }

    public static void main(String[] args) {
        HowToReverseUsingRecursion obj = new HowToReverseUsingRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number : ");
        int num = sc.nextInt();
        int result = obj.reverse(num);
        System.out.println("Result is   : " + result);
    }
}
