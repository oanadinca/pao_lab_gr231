package model;
/*import lombok.*;

//Follow https://www.baeldung.com/lombok-ide

@Builder //generates a builder class using the Builder design pattern
@Getter //generates getters for all attributes
@Setter //generates setters for all attributes
@ToString //generates toString()
@EqualsAndHashCode //generates equals() and hashCode()
*/

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
