package BasicJavaProgram;


public class ArmstrongNumber {
	public static void main(String[]args) {
		int num = 1675,rem;int sum=0;
		int temp=num;
		
	    while(num>0) {
	    	rem=num%10;
	    	num=num/10;
	    	sum=sum+(rem*rem*rem);
	    }
	    if(temp==sum) {
	    	System.out.println("its an armstrong number!");
	    }
	    else {
	    	System.out.println("Its an not armstrong number");
	    }
		
	}
}
	