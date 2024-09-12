package Conditionals;

import java.util.Scanner;

public class program6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Kajal");
		System.out.println("Enter Subjects ");
		System.out.println("English : ");
		int English = sc.nextInt();
		System.out.println("Maths :");
		int Maths = sc.nextInt();
		System.out.println("Java :");
		int java=sc.nextInt();
		System.out.println("DSA :");
		int DSA=sc.nextInt();
		System.out.println("OS : ");
		int OS=sc.nextInt();
		
		int marks = English+Maths+java+DSA+OS;
		System.out.println("Total Marks : " + marks);
		int percentage = (marks*100)/500;
		System.out.println("Percentage : " + percentage);
		
		if(percentage>=90) {
			System.out.println("Excellent");
		}
		else if(percentage>=80) {
			System.out.println("Very Good");
		}
		else if (percentage>=70) {
			System.out.println("Good");
		}
		else if (percentage>=60) {
			System.out.println("Can do better");
		}
		else if (percentage>=50) {
			System.out.println("Average");
		}
		else if (percentage>=40) {
			System.out.println("Below Average");
		}
		else {
			System.out.println("Fail");
		}
	}

}
