package model;
public class Engine {
	private String transmission;
	private int power;
	private int numberOfCylinders;

	public Engine(String transmission, int power, int numberOfCylinders) {
		this.transmission = transmission;
		this.power = power;
		this.numberOfCylinders = numberOfCylinders;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}
}
