package Array;

public class JaggedArray {
    public static void main(String[] args) {
        int r = 5; // Number of rows
        int[][] arr = new int[r][];

        // Creating a jagged array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1]; // Each row has an increasing number of columns
        }

        // Initializing the jagged array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++; // Assigning sequential values
            }
        }

        // Displaying the values of the 2D jagged array
        System.out.println("Contents of 2D Jagged Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // New line after each row for better readability
        }
    }
}
