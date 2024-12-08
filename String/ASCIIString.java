package String;

public class ASCIIString {

    public static void main(String[] args) {
        byte[] ascii = {71, 70, 71}; // Array of ASCII values

        // Correctly create a String from the ASCII byte array
        String firstString = new String(ascii);
        System.out.println(firstString);

        // Creating a String with a subset of the byte array
        // Use the constructor: new String(byte[] data, int offset, int length)
        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);
    }
}
