package BasicProgram;

public class NeonNumber {
    public static void neon_Num(int n) {
        int square = n * n;  // Square of the number
        int sum = 0;         // To store the sum of digits
        
        // Sum the digits of the square
        while (square > 0) {
            int digit = square % 10; // Extract the last digit
            sum += digit;            // Add the digit to the sum
            square /= 10;            // Remove the last digit
        }
        
        // Check if the number is a neon number
        if (sum == n) {
            System.out.println(n + " is a Neon Number");
        } else {
            System.out.println(n + " is NOT a Neon Number");
        }
    }
    
    public static void main(String[] args) {
        int num = 9;
        neon_Num(num); // Test case: 9 (Neon Number)
        
        int num2 = 12;
        neon_Num(num2); // Test case: 12 (Not a Neon Number)
    }
}
