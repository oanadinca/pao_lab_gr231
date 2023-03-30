package io.model;

public abstract class Vehicle extends Product {
	protected String model;
	private boolean limitedEdition;

	public Vehicle() {
		super(1);
	}

	public Vehicle(long id, String name, double price, int stock, String model, boolean limitedEdition) {
		super(id, name, price, stock);
		this.model = model;
		this.limitedEdition = limitedEdition;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isLimitedEdition() {
		return limitedEdition;
	}

	public void setLimitedEdition(boolean limitedEdition) {
		this.limitedEdition = limitedEdition;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + model + " / " + limitedEdition;
	}
}
