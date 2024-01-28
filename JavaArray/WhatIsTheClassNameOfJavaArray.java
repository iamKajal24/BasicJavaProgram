package JavaArray;

public class WhatIsTheClassNameOfJavaArray {

	public static void main(String[] args) {
		int arr[]= {4,4,5};
		Class c = arr.getClass();
		String Name = c.getName();
		
		System.out.println(Name);

	}

}
