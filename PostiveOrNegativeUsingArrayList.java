package BasicJavaProgram;

import java.util.*;

public class PostiveOrNegativeUsingArrayList {
	void MyArray() {

//		int num[] = new int [3];
//		num[0]=10;
//		num[1]=0;
//		num[2]=-10;

		int num[] = { 1, -1, 2, 3, -7, 6 };

		for (int i = 0; i < 6; i++) {
			if (num[i] >= 0) {
				System.out.println(num[i] + " Positive Number");
			} else if (num[i] <= 0) {
				System.out.println(num[i] + " Negative Number");
			} else {
				System.out.println(num[i] + "Neither Positive or Nor Negative Number");
			}
		}
	}

	public static void main(String[] args) {
		PostiveOrNegativeUsingArrayList PAL = new PostiveOrNegativeUsingArrayList();
		PAL.MyArray();

	}
}
