package model;
public class Ticket {
	private String origin;
	private String destination;
	private Client client;
	private double price;

	public Ticket(String origin, String destination, Client client, double price) {
		this.origin = origin;
		this.destination = destination;
		this.client = client;
		this.price = price;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return origin + " / " + destination + " / " + client + " / " + price;
	}
}
