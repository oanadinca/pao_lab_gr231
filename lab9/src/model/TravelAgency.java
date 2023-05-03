package model;

import java.util.*;

public class TravelAgency {
	public List<Ticket> getTickets() {
		List<Client> clients = getClients();
		return Arrays.asList(
				new Ticket("Bucuresti", "Madrid", clients.get(0), 500),
				new Ticket("Bucuresti", "Paris", clients.get(1), 350),
				new Ticket("Bucuresti", "Barcelona", clients.get(2), 270),
				new Ticket("Bucuresti", "Londra", clients.get(3), 410),
				new Ticket("Bucuresti", "Dublin", clients.get(4), 480),
				new Ticket("Bucuresti", "Oslo", clients.get(5), 390),
				new Ticket("Bucuresti", "Moscova", clients.get(6), 370),
				new Ticket("Bucuresti", "Berlin", clients.get(7), 280),
				new Ticket("Bucuresti", "Paris", clients.get(3), 360),
				new Ticket("Bucuresti", "Barcelona", clients.get(5), 430)
		);
	}

	public List<Client> getClients() {
		return Arrays.asList(
				new Client("Adrian Popescu", "Blv.Dacia Nr.30 Bucuresti",
						"apopescu@gmail.com"),
				new Client("Maria Ionescu", "Blv.Unirii Nr.5 Timisoara",
						"mionescu@gmail.com"),
				new Client("Ion Georgescu", "Str.Florilor Nr.14 Brasov",
						"igeorgescu@yahoo.com"),
				new Client("Razvan Teodorescu", "Blv.Grigorescu Nr.235 Bucuresti",
						"rteodorescu@gmail.com"),
				new Client("Elena Vasilescu", "Blv.Aerogarii Nr.67 Brasov",
						"vasilescuelena@gmail.com"),
				new Client("Alexandra Ionescu", "Blv.Eroilor Nr.76 Bucuresti",
						""),
				new Client("Stefan Radulescu", "Blv.Pacii Nr.45 Iasi",
						"radulescust@gmail.com"),
				new Client("Alexandru Grigorescu", "Str.Neamtului Nr.89 Iasi",
						"alexgrigorescu@gmail.com"));
	}
}
