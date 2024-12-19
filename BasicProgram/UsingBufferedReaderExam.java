package BasicProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsingBufferedReaderExam {
	public static void main(String[] args) {
		// Create a BufferedReader to read input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("name : ");
			String name = reader.readLine();
			System.out.println("srname :");
			String srname = reader.readLine();
			System.out.println("full name : " + name + " " + srname);
			
			// 
			System.out.println("enter 1st number : ");
			int a= Integer.parseInt(reader.readLine());
			System.out.println("enetr 2nd number : ");
			int b=Integer.parseInt(reader.readLine());
			int c= a*b;
			System.out.println("result is : " + c);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
