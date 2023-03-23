package io.service;
import io.exception.TooManyProductsException;
import io.model.Notification;
import io.model.OfficeManager;
import io.model.Product;
import io.model.Shop;

public class ShopService {

	private NotificationService notificationService;

	public ShopService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void addProduct(Shop shop, Product product) {
		int nextAvailableIndex = getNumberOfProducts(shop);
		if ( nextAvailableIndex < shop.getProducts().length) {
			shop.getProducts()[nextAvailableIndex] = product;

			String message = "Product " + product.getName() + " was added to the shop";
			OfficeManager officeManager = new OfficeManager("John", "john@gmail.com");
			notificationService.sendNotification(new Notification(message, "office@shop.com", officeManager));
		} else {
			throw new TooManyProductsException("Toooooo many products, the shop cannot take it anymore!");
		}
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
}
