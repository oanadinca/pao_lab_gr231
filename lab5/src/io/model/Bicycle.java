package io.model;

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
	public int hashCode() {
		return Objects.hash(model);
	}
}