package strings;

public class StringBufferVSStringBuilder {
//TODO concat test
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		long startTime = System.currentTimeMillis();
		for (int i = 0 ; i < 10000; i++) {
			sb.append("Tpoint");
		}

		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime + "ms"));


		StringBuilder sbuilder = new StringBuilder("Java");
		long startTime2 = System.currentTimeMillis();
		for (int i = 0 ; i < 10000; i++) {
			sbuilder.append("Tpoint");
		}

		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime2 + "ms"));
	}
}