package main;

import model.*;
public class Example1 {
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle(1, "BMX", 12, 7, "BMX-500", false, 100);
		Bicycle b2 = new Bicycle(2, "BMX", 15, 5, "BMX-500", false, 100);

		if(b1 == b2) { //references are compared
			System.out.println("reference b1 is equal to reference b2");
		} else {
			System.out.println("reference b1 is not equal to reference b2");
		}

		if(b1.equals(b2)) { //instances are compared
			System.out.println("b1 is equal to b2");
		} else {
			System.out.println("b1 is not equal to b2");
		}

		System.out.println(b1.getClass());
	}
}
