package main;
import model.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Main {

	public static void main(String[] args) {
		List<Ticket> tickets = new TravelAgency().getTickets();

		System.out.println("Number of tickets for Barcelona: " +
				getNumberOfTicketsForDestination(tickets, "Barcelona"));

//		printTicketsForEmail(tickets, "apopescu@gmail.com");
//
//		System.out.println("There is at least 1 ticket for this email apopescu@gmail.com: " +
//				existsTicketForEmail(tickets, "apopescu@gmail.com"));
//
//		System.out.println("Tickets average value: " + getTicketsAverageValue(tickets));
//		System.out.println("Number of tickets for client from Bucuresti " +
//				getNumberOfTicketsForClientCity(tickets, "Bucuresti"));
//
//		System.out.println("All ticket clients have address defined: " +
//				allTicketClientsHaveAddress(tickets));
	}
}
