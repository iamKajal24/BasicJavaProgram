package BasicJavaProgram;

//Java Object class is the super class of all the Java classes. All Java classes implements 
//the Object class by default. The Java Object class provides the two important methods to compare two 
//objects in Java, i.e. equals() and hashCode() method. In this section, we will learn
//how equals() and hashCode() method works.

public class HowTocomapreTwoObjectsInJava {

	public static void main(String[] args) {
		// ObjectComparisonExample

		Double x = new Double(1080.8877);
		Long y = new Long(9876543);
		System.out.println("Objects are not equal, here it returns " + x.equals(y));
		System.out.println("Object are equal , here it returns " + x.equals(1080.8877));

	}
}
