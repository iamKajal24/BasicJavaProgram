package String2;

public class GetBytesMethodExamp2 {

	public static void main(String[] args) {
		String str = "ABCDEFGH";

		byte[] barr = str.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}

		// getting String back

		String s2 = new String(barr);
		System.out.println(s2);

	}

}
