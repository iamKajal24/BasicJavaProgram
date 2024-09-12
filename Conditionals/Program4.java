package Conditionals;

import java.security.PublicKey;
import java.util.Scanner;

/*if Of cost price and selling price of an item is input through the keyboard, write a program 
//to determine whether the seller has made profit or incurred loss. Also determine how much 
//profit he made or loss he incurred*/

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Cost Price");
		 int cp=sc.nextInt();
		 System.out.println("Enter Selling Price");
	    int sp=sc.nextInt();
	    if(sp>cp) {//profit
	    	System.out.println("you gained the profit"); // sp-cp = profit
	    	int profit= sp-cp;
	    	System.out.println(profit);
	    }
	    else if(cp>sp) {  //cp-sp = loss
	        System.out.println("You incurred a loss "); // cp-sp= loss
	        int loss= cp-sp;
	        System.out.println(loss);
	    
	    }
	}
}
