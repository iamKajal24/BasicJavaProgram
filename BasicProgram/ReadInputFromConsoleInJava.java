package BasicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromConsoleInJava {
    public static void main(String[] args) {
        // Create a BufferedReader to read input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter your name: ");
            // Read a line of input
            String nameString = reader.readLine();
            // Print the input
            System.out.println("You entered: " + nameString);
        } catch (IOException e) {
            // Handle exceptions
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
