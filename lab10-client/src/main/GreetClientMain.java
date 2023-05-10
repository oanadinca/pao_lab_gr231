package main;

import java.util.*;

public class GreetClientMain {

	public static void main(String[] args) {
		GreetClient client = new GreetClient();
		client.startConnection("127.0.0.1", 8081);

		Scanner scanner = new Scanner(System.in);
		String message;
		while((message = scanner.nextLine()) != null) {
			String responseFromServer = client.sendMessage(message);
			System.out.println("server: " + responseFromServer);
		}
	}
}
