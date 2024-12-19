package BasicProgram;

class ComplexNumber {
	int real, image;

	public ComplexNumber(int real, int image) {
		this.real = real;
		this.image = image;
	}

	public void show() {
		System.out.println(this.real + " +i" + this.image);
	}

	// function for addition
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {

		ComplexNumber res = new ComplexNumber(0, 0);

		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;

		return res;
	}
}

public class AddTwoComplexNumber {
	public static void main(String[] args) {
		
		ComplexNumber cNumber = new ComplexNumber(4, 5);
		ComplexNumber cNumber2 = new ComplexNumber(4, 8);
		cNumber.show();
		cNumber2.show();
		
		// calling add() to perform addition
		
		ComplexNumber res = ComplexNumber.add(cNumber,cNumber2);
		//displaying addition
		System.out.println("\nAddition is : ");
		res.show();
		

	}

	private static ComplexNumber add(ComplexNumber cNumber, ComplexNumber cNumber2) {
		// TODO Auto-generated method stub
		return null;
	}
}
