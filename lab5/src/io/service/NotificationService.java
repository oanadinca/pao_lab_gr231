package io.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;

import io.model.*;
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


	public void sendNotification(Notification notification) {
		//TODO
		// verify if directory exists otherwise throw exception
		// verify if file exists otherwise throw exception
		// open file
		// append to file
		// close file

		//TODO
		// catch-ing IOException
	}

	public void createFolder(String folderName) throws IOException {
//		try {
			Path path = Paths.get(folderName);
			Files.createDirectories(path);
//		} catch (IOException e) {
//		//	throw new CREATEMYEXCEPTION(e.getMessage());
//		}
	}

	public void createFile(String filename) throws IOException {
		Path path = Paths.get(filename);
		Files.createFile(path);
	}

	public void deleteFile(String filename) throws IOException {
		Path path = Paths.get(filename);
		Files.delete(path);
	}

	public void listFolder(String folderName) throws IOException, SQLException {
		Path path = Paths.get(folderName);
		Files.list(path).forEach(p -> System.out.println(p));
	}
}
