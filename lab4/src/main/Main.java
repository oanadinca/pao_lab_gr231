package main;
import model.*;
import service.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Shop shop = new Shop();
		ShopService shopService = new ShopService(new NotificationService());
		ProductService productService = new ProductService();

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
							shopService.addProduct(shop, productService.buildBicycle(scanner.nextLine()));
							break;
						}
						case "car" : {
							System.out.println("Please specify the car details: " +
									"name/price/stock/model/limitedEdition/color/transmission/power/numberOfCylinders");
							shopService.addProduct(shop, productService.buildCar(scanner.nextLine()));
							break;
						}
						case "equipment" : {
							System.out.println("Please specify the equipment details: name/price/stock/supplierName/supplierCountry");
							shopService.addProduct(shop, productService.buildEquipment(scanner.nextLine()));
							break;
						}
						case "moto": {
							System.out.println("Add moto");
							String speed = scanner.nextLine();
							String type = scanner.nextLine();
							shopService.addMoto(shop, speed, type, 400);
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
}
