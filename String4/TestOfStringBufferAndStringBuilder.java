package String4;

public class TestOfStringBufferAndStringBuilder {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time Taken by StringBuffer : " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb1.append("Tpoint");
		}
		System.out.println("Time Taken by StringBuilder : " + (System.currentTimeMillis() - startTime) + "ms");

	}
}
