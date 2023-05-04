package main;

import java.util.List;
import java.util.function.Predicate;

import model.Ticket;
import model.TravelAgency;

public class Main {

	public static void main(String[] args) {
		List<Ticket> tickets = new TravelAgency().getTickets();

		System.out.println("Number of tickets for Barcelona: " +
				getNumberOfTicketsForDestination(tickets, "bArcelona"));

		printTicketsForEmail(tickets, "apopescu@gmail.com");

		System.out.println("There is at least 1 ticket for this email apopescu@gmail.com: " +
						existsTicketForEmail(tickets, "apopescu@gmail.com"));

				System.out.println("Tickets average value: " + getTicketsAverageValue(tickets));
				System.out.println("Number of tickets for client from Bucuresti " +
						getNumberOfTicketsForClientCity(tickets, "Bucuresti"));

				System.out.println("All ticket clients have address defined: " +
						allTicketClientsHaveAddress(tickets));
	}

	private static boolean existsTicketForEmail(List<Ticket> tickets, String mail) {
		return //tickets.stream().filter(ticket -> mail.equalsIgnoreCase(ticket.getClient().getEmail())).count() != 0;
				tickets.stream().anyMatch(ticket -> mail.equalsIgnoreCase(ticket.getClient().getEmail()));
//		tickets.stream().anyMatch(ticket -> getTicketByEmail(mail).test(ticket));
	}

	private static long getNumberOfTicketsForDestination(List<Ticket> tickets, String destination) {
		return tickets.stream().filter(ticket ->
						//ticket.getDestination().toLowerCase().equals(destination.toLowerCase())
						//ticket.getDestination() != null &&
						//		ticket.getDestination().equalsIgnoreCase(destination)
						destination.equalsIgnoreCase(ticket.getDestination())
				)
				.count();
	}

	private static void printTicketsForEmail(List<Ticket> tickets, String email) {
		tickets.stream()
				.filter(ticket -> getTicketByEmail(email).test(ticket))
				.forEach(System.out::println);
	}

	private static Predicate<Ticket> getTicketByEmail(String email) {
		return ticket -> email.equalsIgnoreCase(ticket.getClient().getEmail());
	}

	private static double getTicketsAverageValue(List<Ticket> tickets) {
		return tickets.stream().mapToDouble(Ticket::getPrice).average().getAsDouble();
//			Double sum = tickets.stream().map(ticket -> ticket.getPrice()).reduce(0.0, (price1, price2) -> price1 + price2);
//			return sum / tickets.size();
	}

	private static long getNumberOfTicketsForClientCity(List<Ticket> tickets, String clientCity) {
		return tickets.stream()
				.filter(ticket -> getTicketByClientCity(clientCity).test(ticket))
				.count();
	}

	private static Predicate<Ticket> getTicketByClientCity(String clientCity){
		return ticket -> ticket.getClient().getAddress() != null &&
				ticket.getClient().getAddress().toLowerCase().contains(clientCity.toLowerCase());
	}

	private  static  boolean allTicketClientsHaveAddress(List<Ticket> tickets){
		return tickets.stream()
				.allMatch(ticket -> ticket.getClient().getAddress() != null && !ticket.getClient().getAddress().isEmpty());
	}
}
