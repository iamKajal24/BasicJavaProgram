package BasicProgram;

public class ListCommonFactor {
    // Method to calculate LCM
    static void LCM(int a, int b) {
        // Start with the larger of the two numbers
        int ans = (a > b) ? a : b;

        // Keep incrementing until a common multiple is found
        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                // Print the result and exit the loop
                System.out.println("LCM of " + a + " and " + b + " is: " + ans);
                break;
            }
            ans++;
        }
    }
    
    static void GCD(int a,int b) {
    	
    	while(b!=0) {
    		int temp = b;
    		b=a%b;
    		a=temp;
    	}
    	System.out.println("GCD of the given number is : " + a);
    	
    }

    public static void main(String[] args) {
        int a = 15, b = 25;

        // Call the LCM method
        LCM(a, b);
        GCD(a, b);
    }
}
