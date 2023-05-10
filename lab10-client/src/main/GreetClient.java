package main;

import java.io.*;
import java.net.*;

public class GreetClient {

	private Socket clientSocket;
	private PrintWriter printWriter;
	private BufferedReader bufferedReader;

	public void startConnection(String ip, int port) {
		try {
			clientSocket = new Socket(ip, port);
			printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
			bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String sendMessage(String message) {
		printWriter.println(message);
		String response = null;
		try {
			response = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	public void stopConnection() {
		try {
			bufferedReader.close();
			printWriter.close();
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
