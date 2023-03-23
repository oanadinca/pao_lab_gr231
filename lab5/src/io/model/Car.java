package io.model;
/*
    Builder design pattern
    Steps to implement:
        1. constructor of the Car class should be private
        2. a Builder class is created as an inner class of Car
        3. the Builder class contains as attribute an instance of the Car class; it's the instance the Builder is responsible to build
        4. the Builder class has a public method for each Car attribute.
            - the method returns the Builder instance
            - the method receives as parameter a value for that attribute
            - inside the method, the value of the parameter is assigned to the attribute of the Car attribute
        5. the Builder class has one public method named build()
            - the method has no parameters
            - the method returns the Car instance which has been built
 */
public class Car extends Vehicle { //Car is-A Vehicle
	private String color;
	private Engine engine; //Car has-A Engine

	private Car() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + color + " / " + engine.getTransmission() + " / " +
				engine.getPower() + " / " + engine.getNumberOfCylinders();
	}

	public static class Builder {
		private Car car = new Car();

		public Builder withId(long id) {
			car.setId(id);
			return this;
		}

		public Builder withName(String name) {
			car.setName(name);
			return this;
		}

		public Builder withPrice(double price) {
			car.setPrice(price);
			return this;
		}

		public Builder withStock(int stock) {
			car.setStock(stock);
			return this;
		}

		public Builder withModel(String model) {
			car.setModel(model);
			return this;
		}

		public Builder withLimitedEdition(boolean limitedEdition) {
			car.setLimitedEdition(limitedEdition);
			return this;
		}

		public Builder withColor(String color) {
			car.setColor(color);
			return this;
		}

		public Builder withEngine(Engine engine) {
			car.setEngine(engine);
			return this;
		}

		public Car build() {
			return this.car;
		}
	}
}

