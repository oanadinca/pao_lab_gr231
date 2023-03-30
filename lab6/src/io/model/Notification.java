package io.model;

public class Notification {
	private final String message;
	private final String from;
	private final OfficeManager officeManager;

	public Notification(String message, String from, OfficeManager officeManager) {
		this.message = message;
		this.from = from;
		//this.officeManager = officeManager;
		OfficeManager officeManagerClone = new OfficeManager(officeManager.getName(), officeManager.getEmail());
		this.officeManager = officeManagerClone;
	}

	public String getMessage() {
		return message;
	}

	public String getFrom() {
		return from;
	}

	public OfficeManager getOfficeManager() {
		return officeManager;
	}

}
