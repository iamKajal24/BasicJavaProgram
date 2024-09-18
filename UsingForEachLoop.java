package Array;

import java.util.ArrayList;
import java.util.List;

public class UsingForEachLoop {

	public static void main(String[] args) {
		List<String> arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("sql");
		arr.add("Spring");
		arr.add("SpringBoot");
		//String arr[]= {"java","sql","Spring","SpringBoot"};
		for(String str:arr) {
			System.out.println(str);
		}
	}
}
