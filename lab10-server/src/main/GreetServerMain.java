package main;

public class GreetServerMain {

	public static void main(String[] args) {
		GreetServer server = new GreetServer();
		server.startServer(8081);
	}
}
