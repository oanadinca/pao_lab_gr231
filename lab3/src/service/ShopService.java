package service;
import model.*;

public class ShopService {


	public void addProduct(Shop shop, Product product) {
		int nextAvailableIndex = getNumberOfProducts(shop);
		shop.getProducts()[nextAvailableIndex] = product;

		System.out.println( "Product " + product.getName() + " was added to the shop");
	}

	public void printProductsDetails(Shop shop) {
		for(Product p : shop.getProducts()) {
			if(p != null) {
				System.out.println(p);
			}
		}
	}

	private int getNumberOfProducts(Shop shop) {
		int numberOfProducts = 0;
		for(Product p : shop.getProducts()) {
			if(p != null) {
				numberOfProducts++;
			}
		}
		return numberOfProducts;
	}
}
