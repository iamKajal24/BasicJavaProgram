package Maths_Function;

public class Fuction_Maths {
	public static void main(String[] args) {
	   double a=30;
	   double b= Math.toRadians(a);
	   System.out.println("To Radians : " + b);
	   
	   a=45;
	   b=Math.sin(a);
	   System.out.println("Sin : " + b);
	   
	   a=50;
	   b=Math.cos(a);
	   System.out.println("Cos : " + b);
	   
	   a=20;
	   b=Math.tan(a);
	   System.out.println("tan :" + b);
	   
	   a=40;
	   b=Math.cbrt(a);
	   System.out.println("cbrt : "+  b);
	   
	   a=65;
	   b=Math.log(a);
	   System.out.println("log : " + b);
	   
	   a=46;
	   b=Math.min(23, 47);
	   System.out.println("min : " + b);
	   
	   b=Math.max(45, 546);
	   System.out.println("max : " + b);
	   
	   b=Math.pow(6, 2);
	   System.out.println("Pow : " + b);
	   
	   b=Math.toDegrees(23);
	   System.out.println("Degree :" + b);
	   
	   b=Math.sqrt(54);
	   System.out.println("Square : " + b);
	   
	   
	   b=Math.cbrt(2);
	   System.out.println("cube root : " + b);
	   
	   b=Math.addExact(45, 2);
	   System.out.println("add exact : " + b);
	}
}
