package model;

public class Motocycle extends Product {

	private Engine engine;
	private String type;
	private int speed;

	public Motocycle() {
	}
	public Motocycle(int id, String type, int speed) {
		super(id);
		this.type = type;
		this.speed = speed;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}
	public static class MotoBuilder {
		private Motocycle moto = new Motocycle();

		public Motocycle.MotoBuilder withId(long id) {
			moto.setId(id);
			return this;
		}

		public Motocycle.MotoBuilder withType(String type) {
			moto.setType(type);
			return this;
		}

		public Motocycle.MotoBuilder withSpeed(int speed) {
			moto.setSpeed(speed);
			return this;
		}

		public Motocycle build() {
			return moto;
		}
	}
}
