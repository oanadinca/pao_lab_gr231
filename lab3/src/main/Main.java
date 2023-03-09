package main;
import model.*;
import service.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Shop shop = new Shop();
		ShopService shopService = new ShopService();

		Scanner scanner = new Scanner(System.in);



	}

	private static Product buildBicycle(String productDetails) {
		String[] attributes = productDetails.split("/");
		String name = attributes[0];
		double price = Double.valueOf(attributes[1]);
		int stock = Integer.valueOf(attributes[2]);
		String model = attributes[3];
		boolean limitedEdition = Boolean.valueOf(attributes[4]);
		int height = Integer.valueOf(attributes[5]);
		return new Bicycle(new Random().nextInt(100),
				name, price, stock, model, limitedEdition, height);
	}

	private static Product buildCar(String productDetails) {
		String[] attributes = productDetails.split("/");
		String name = attributes[0];
		double price = Double.valueOf(attributes[1]);
		int stock = Integer.valueOf(attributes[2]);
		String model = attributes[3];
		boolean limitedEdition = Boolean.valueOf(attributes[4]);
		String color = attributes[5];
		String transmission = attributes[6];
		int power = Integer.parseInt(attributes[7]);
		int numberOfCylinders = Integer.parseInt(attributes[8]);
		return new Car.Builder()
				.withId(new Random().nextInt(100))
				.withName(name)
				.withPrice(price)
				.withStock(stock)
				.withModel(model)
				.withLimitedEdition(limitedEdition)
				.withColor(color)
				.withEngine(new Engine(transmission, power, numberOfCylinders))
				.build();
	}

	private static Product buildEquipment(String productDetails) {
		String[] attributes = productDetails.split("/");
		String name = attributes[0];
		double price = Double.valueOf(attributes[1]);
		int stock = Integer.valueOf(attributes[2]);
		String supplierName = attributes[3];
		String supplierCountry = attributes[4];
		return new Equipment(new Random().nextInt(100),
				name, price, stock, supplierName, supplierCountry);
	}
}
