package Array;

public class TraversingThroughTheArray {
	
	void multiArray() {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("muti array traverse :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	
	void demoArray() {
		
		int []ages = new int[3];
		
		ages[0]=34;
		ages[1]=23;
		ages[2]=26;
		//ages[4]=45;
		
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
		
		//using for Loop
		System.out.println("For Loop :");
		for(int i=0;i<3;i++) {
			System.out.println(ages[i]);
		}
		
		//USING FOR each loop
		System.out.println("For each loop :");
		for(int age : ages) {
			System.out.println(age);
		}
		
		//Using while loop
		System.out.println("using While Loop : ");
		int i=0;
		while (i<3) {
			
			System.out.println(ages[i]);
			i++;
		}
	}
	public static void main(String[] args) {
		TraversingThroughTheArray obj = new TraversingThroughTheArray();
		obj.multiArray();
		obj.demoArray();
	}

}
