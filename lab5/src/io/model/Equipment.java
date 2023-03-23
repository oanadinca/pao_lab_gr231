package io.model;

public class Equipment extends Product {
	private String supplierName;
	private String supplierCountry;

	public Equipment(long id, String name, double price, int stock,
			String supplierName, String supplierCountry) {
		super(id, name, price, stock);
		this.supplierName = supplierName;
		this.supplierCountry = supplierCountry;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierCountry() {
		return supplierCountry;
	}

	public void setSupplierCountry(String supplierCountry) {
		this.supplierCountry = supplierCountry;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + supplierName + " / " + supplierCountry;
	}
}
