package Conditionals;

import java.util.Scanner;
public class program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length :");
		int length=sc.nextInt();
		System.out.println("enter breath");
		int breath=sc.nextInt();
		int area= length*breath;
		System.out.println("Area is : " +area);
		int perimeter=2*(length+breath);
		System.out.println("Perimeter is : " + perimeter);
		if(area>perimeter) {
			System.out.println("Area is greather than perimeter");
		}
		else if (perimeter>area) {
			System.out.println("Perimeter is greater than Area");
		}	
		else if(area==perimeter) {
			System.out.println("Area and Perimeter are equal");
		}
	}
}
