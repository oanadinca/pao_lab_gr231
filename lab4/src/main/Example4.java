package main;

import java.util.Arrays;

import model.*;

public class Example4 {
	public static void main(String[] args) {
		String message = "Product Mountain Bike was added to the shop";
		OfficeManager officeManager = new OfficeManager("John", "john@gmail.com");
		Notification notification = new Notification(message, "office@shop.com", officeManager);

		System.out.println(notification.getOfficeManager());
		officeManager.setEmail("test");
		System.out.println(notification.getOfficeManager());


		OfficeManager[] managers = new OfficeManager[3];
		//officeManager.setAge(40);
		managers[0] = officeManager;
		//officeManager.setAge(40);
		managers[0].setAge(40);
		managers[1] = new OfficeManager("Alex", 50,"alex@gmail.com");
		managers[2] = new OfficeManager("Cosmin", 30, "cosmin@hotmail.com");

		System.out.println("Managers unsorted:");

		for(OfficeManager m : managers) {
			System.out.println(m);
		}

		System.out.println("Managers sorted by age:");
		Arrays.sort(managers, (m1, m2) -> {
			if(m1.getAge() > m2.getAge()) {
				return 1;
			} else if(m1.getAge() < m2.getAge()) {
				return -1;
			} else {
				return 0;
			}
		});

		for(OfficeManager m : managers) {
			System.out.println(m);
		}

		System.out.println("Persons sorted by name:");
		Arrays.sort(managers, (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		});
		for(OfficeManager p : managers) {
			System.out.println(p);
		}
	}
}