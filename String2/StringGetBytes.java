package String2;

public class StringGetBytes {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		byte[] barr = str.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
	}
}
