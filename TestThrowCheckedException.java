package ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrowCheckedException {

	public static void method() throws FileNotFoundException {
		FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);

		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
	}
}
