package model;
public class Client {
	private String name;
	private String address;
	private String email;

	public Client(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return name + " / " + address + " / " + email;
	}
}
