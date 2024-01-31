package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HandleCheckedException {

	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("jhg.txt");
			pw.println("saved");
		}
		// providing the checked exception handler
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("File Saved Successfully");

	}
}
