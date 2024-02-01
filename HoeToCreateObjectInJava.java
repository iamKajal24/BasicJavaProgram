package BasicJavaProgram;
//object is a basic building block of an OOPs language. In Java, we cannot execute any program without creating an object. 

//There is various way to create an object in Java that we will discuss in this section, and also learn how to create an object
//in Java.
//Java provides five ways to create an object.

public class HoeToCreateObjectInJava {
	void show() {
		System.out.println("Welcome to Javatpoint ");
	}

	public static void main(String[] args) {
		// Using New Keyword

		HoeToCreateObjectInJava CO = new HoeToCreateObjectInJava();
		CO.show();
	}
}
