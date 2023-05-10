package main;

import java.io.*;
import java.net.*;
import java.util.*;

public class GreetServer {

	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter printWriter;
	private BufferedReader bufferedReader;

	public void startServer(int port) {
		try {
			serverSocket = new ServerSocket(port);
			clientSocket = serverSocket.accept();
			printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
			bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

			Scanner scanner = new Scanner(System.in);
			String messageFromClient;
			while ((messageFromClient = bufferedReader.readLine()) != null) {
				System.out.println("client: " + messageFromClient);
				if ("bye".equals(messageFromClient)) {
					printWriter.println("good bye");
					break;
				}
				printWriter.println(scanner.nextLine());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void stopServer() {
		try {
			printWriter.close();
			bufferedReader.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
