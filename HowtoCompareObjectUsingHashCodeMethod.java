package BasicJavaProgram;

class emp876 {
	private String name;
	private int regno;

	// constructor of empolyee class

	public emp876(String name, int regno) {
		this.name = name;
		this.regno = regno;
	}

	public String getname() {
		return name;
	}

	public int getregno() {
		return regno;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setregno(int regno) {
		this.regno = regno;
	}
}

public class HowtoCompareObjectUsingHashCodeMethod {

	public static void main(String[] args) {
		emp876 em1 = new emp876("kajal", 918);
		emp876 em2 = new emp876("kajal", 918);

		// invoking hashCode () method
		int a = em1.hashCode();
		int b = em2.hashCode();

		System.out.println("hashcode of em1 = " + a);
		System.out.println("hashCode of em2 = " + b);
		System.out.println("Comparing object em1 and em2 = " + em1.equals(em2));
	}
}
