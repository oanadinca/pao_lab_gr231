package model;

import java.util.*;

public class Bicycle extends Vehicle {
	private int height;

	public Bicycle(int id, String name, double price, int stock, String model,
			boolean limitedEdition, int height) {
		super(id, name, price, stock, model, limitedEdition);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + height;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bicycle bicycle = (Bicycle) o;
		return model.equals(bicycle.getModel());
	}

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}
}