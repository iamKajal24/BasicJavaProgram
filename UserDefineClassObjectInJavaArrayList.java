package Collection12022024;

import java.util.ArrayList;
import java.util.Iterator;

class student32 {
	int rollno;
	String name;
	int age;

	public student32(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class UserDefineClassObjectInJavaArrayList {

	public static void main(String[] args) {
		// creating user-defined class object

		student32 s1 = new student32(101, "kajal", 24);
		student32 s2 = new student32(102, "Riya", 25);
		student32 s3 = new student32(103, "khushi", 19);
		student32 s4 = new student32(104, "Priya", 21);

		// creating ArrayList
		ArrayList<student32> al = new ArrayList<student32>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		// getting Iterator
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			student32 st = (student32) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
