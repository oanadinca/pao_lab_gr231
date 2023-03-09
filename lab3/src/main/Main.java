package main;
import model.*;
import service.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Shop shop = new Shop();
		ShopService shopService = new ShopService();

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("Please type one of the following commands: add, view or exit");
			String line = scanner.nextLine();
			switch(line) {
				case "add" :
					System.out.println("Please choose a product type: ");
					String productType = scanner.nextLine();
					switch(productType) {
						case "bicycle" : {
							System.out.println("Please specify the bicycle details: name/price/stock/model/limitedEdition/height");
							shopService.addProduct(shop, buildBicycle(scanner.nextLine()));
							break;
						}
						case "car" : {
							System.out.println("Please specify the car details: " +
									"name/price/stock/model/limitedEdition/color/transmission/power/numberOfCylinders");
							shopService.addProduct(shop, buildCar(scanner.nextLine()));
							break;
						}
						case "equipment" : {
							System.out.println("Please specify the equipment details: name/price/stock/supplierName/supplierCountry");
							shopService.addProduct(shop, buildEquipment(scanner.nextLine()));
							break;
						}
						default : System.out.println("This product type doesn't exist.");
					}
					break;
				case "view" :
					shopService.printProductsDetails(shop);
					break;
				case "exit" :
					System.out.println("Bye bye!");
					System.exit(0);
					break;
				default : System.out.println("This command doesn't exist.");
			}

		}

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
