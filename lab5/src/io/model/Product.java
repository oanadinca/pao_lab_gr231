package io.model;

public class Product {
	private long id;
	private String name;
	private double price;
	private int stock;

	public Product() {
	}

	public Product(long id) {
		this.id = id;
	}

	public Product(long id, String name, double price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override //annotation
	public String toString() {
		return name + " / " + price + " / " + stock;
	}
}
