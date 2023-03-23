package strings;

public class StringVSStringBuffer {
	//TODO concat test

	public static String concatWithString(String t) {
		for (int i = 0; i < 10000; i++) {
			t = t + "Tpoint";
//			t.concat("Tpoint");
		}
		return t;
	}

	public static String concatWithString(StringBuffer t) {
		for (int i = 0; i < 10000; i++) {
			t.append("Tpoint");
		}
		return t.toString();
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String st = "Java";
		StringBuffer sb = new StringBuffer("Java");
		st = concatWithString(st);
		System.out.println("Time taken by concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		st = "Java";
		st = concatWithString(sb);
		System.out.println("Time taken by concating with StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

	}



}
