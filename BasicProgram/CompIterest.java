package BasicProgram;

public class CompIterest {
	public static void main(String[] args) {
	   
	   double p =10000, t=5,rate=10.25;
	   
	   double cp= p*(Math.pow((1+rate/100), t));
	   System.out.println(cp);
	}
}
