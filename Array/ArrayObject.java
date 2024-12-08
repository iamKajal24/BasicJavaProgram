package Array;

class student {
	int rollno;
	String name;
	String course;

	student(int r, String n, String c) {
		this.rollno = r;
		this.name = n;
		this.course = c;
	}
}

public class ArrayObject {
	public static void main(String[] args) {
		// declares an Array of Student
		student[] arr;
		// allocating memory for 5 objects of type Student.

		arr = new student[5];
		// initialize the elements of the array
		arr[0] = new student(101, "kajal", "JAVA");
		arr[1] = new student(102, "riya", "DSA");
		arr[2] = new student(103, "Khushi", "Accounted");
		arr[3] = new student(104, "Priya", "CA");
		arr[4] = new student(105, "Rahul", "Machine Learning");
		
		//print for each loop
		
		for (student studdetails : arr) {
            System.out.println("Roll No: " + studdetails.rollno + ", Name: " + studdetails.name + ", Course: " + studdetails.course);
        }

	}

}
