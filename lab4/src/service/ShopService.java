package service;

import model.Motocycle;
import model.Notification;
import model.OfficeManager;
import model.Product;
import model.Shop;

public class ShopService {

	private NotificationService notificationService;

	public ShopService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void addProduct(Shop shop, Product product) {
		int nextAvailableIndex = getNumberOfProducts(shop);
		shop.getProducts()[nextAvailableIndex] = product;

		String message = "Product " + product.getName() + " was added to the shop";
		OfficeManager officeManager = new OfficeManager("John", "john@gmail.com");
		notificationService.sendNotification(new Notification(message, "office@shop.com", officeManager));
	}

	public void printProductsDetails(Shop shop) {
		for (Product p : shop.getProducts()) {
			if (p != null) {
				System.out.println(p);
			}
		}
	}

	private int getNumberOfProducts(Shop shop) {
		int numberOfProducts = 0;
		for (Product p : shop.getProducts()) {
			if (p != null) {
				numberOfProducts++;
			}
		}
		return numberOfProducts;
	}

	public void addMoto(Shop shop, String speed, String type, int id) {
		//TODO Add moto
		// 34
		// banana
		Product moto = new Motocycle(id, type, Integer.parseInt(speed));

		Product moto2 = new Motocycle.MotoBuilder()
				.withId(id)
				.withType(type)
				.withSpeed(Integer.valueOf(speed))
				.build();
		int nextAvailableIndex = getNumberOfProducts(shop);
		shop.getProducts()[nextAvailableIndex] = moto; //or moto2
	}
}
