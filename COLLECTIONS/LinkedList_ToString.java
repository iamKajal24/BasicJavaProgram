package COLLECTIONS;

class Frnd {
	String name;
	int age;
	String college;
	String course;

	Frnd(String n, int a, String c, String co) {
		this.name = n;
		this.age = a;
		this.college = c;
		this.course = co;
	}

	// override toString method
	public String toString() {
		return "Frnd{name='" + name + "', age=" + age + "," + " college='" + college + "', course='" + course + "'}";
	}
}

public class LinkedList_ToString {
	public static void main(String[] args) {
		Frnd frnd = new Frnd("Kajal", 25, "UU", "MCA");
		System.out.println(frnd);
		// System.out.println(frnd.toString());

	}
}
