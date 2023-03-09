package main;

public class Example2 {
	public static void main(String[] args) {
		String name1 = "John"; //String pool
		String name2 = new String("Anne"); //heap
		String name3 = "John";
		String name4 = new String("John");

		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3));

		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));

		String hello = "hello";
		System.out.println(hello.charAt(0));
		System.out.println(hello.toCharArray());
		System.out.println(hello.substring(2));
		System.out.println(hello.substring(2, 3));

		String upperCaseHello = hello.toUpperCase(); //String is immutable
		System.out.println(upperCaseHello);

		String helloWorld = hello.concat(" world");
		System.out.println(helloWorld);

		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append(" world");
		System.out.println(sb1);
	}
}
