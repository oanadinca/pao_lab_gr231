package io.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;

import io.model.*;
import logging.MyFileLogger;
/*
      IO streams
      java.io
      IN
        low level
            InputStream
            FileInputStream
            ByteArrayInputStream
        high level              --> Decorator design pattern
            InputStreamReader
            BufferedReader
            ObjectInputStream
            DataInputStream
      OUT
        low level
            OutputStream
            FileOutputStream
            ByteArrayOutputStream
        high level              --> Decorator design pattern
            PrintStream
            PrintWriter
            BufferedWriter
            ObjectOutputStream
            DataOutputStream
      File
     java.nio
        Files
        Path
        Paths
    */


public class NotificationService {
	private static final String DIRECTORY_PATH = "resources/notifications";
	private static final String FILE_PATH = DIRECTORY_PATH + "/notifications.txt";

	MyFileLogger myFileLogger;

	public NotificationService() {
		this.myFileLogger = new MyFileLogger();
	}

	public void sendNotification(Notification notification) {
		if(!Files.exists(Paths.get(DIRECTORY_PATH))) {
			try {
				Files.createDirectories(Paths.get(DIRECTORY_PATH));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		if(!Files.exists(Paths.get(FILE_PATH))) {
			try {
				Files.createFile(Paths.get(FILE_PATH));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH),
					StandardOpenOption.APPEND);
			writer.write("Notification <" + notification.getMessage() +
					"> successfully sent to " + notification.getOfficeManager().getEmail() + "\n");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void viewNotifications(String filename) {
		try {
//			FileInputStream inputStream = new FileInputStream(filename);
//			String fileValue = new String(inputStream.readAllBytes());
//			inputStream.close();

			BufferedReader reader = Files.newBufferedReader(Paths.get(filename));
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (NoSuchFileException e) {
			System.out.println("The file with the name " + filename + " doesn't exist.");
		} catch (IOException e) {
//			myFileLogger.logError(e.getClass() + " " + e.getMessage());
			System.out.println(e.getClass() + " " + e.getMessage());
		}
	}

	public void createFolder(String folderName) throws IOException {
		Path path = Paths.get(folderName);
		Files.createDirectories(path);
	}

	public void createFile(String fileName) throws IOException {
		Path path = Paths.get(fileName);
		Files.createFile(path);
	}

	public void deleteFile(String fileName) throws IOException {
		Path path = Paths.get(fileName);
		Files.deleteIfExists(path);
	}

	public void listFolder(String folderName) throws IOException {
		Path path = Paths.get(folderName);
		Files.list(path).forEach(p -> System.out.println(p));
	}
}
