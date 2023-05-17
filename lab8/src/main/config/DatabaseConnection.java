package main.config;

import java.sql.*;

//TODO https://stackoverflow.com/questions/30651830/use-jdbc-mysql-connector-in-intellij-idea
public class DatabaseConnection {
	private static Connection connection;

	private DatabaseConnection () {

	}

	public static Connection getInstance() throws SQLException {
		if(connection == null) {
			String url = "jdbc:mysql://localhost:3306/mybank";
			String username = "root";
			String password = "";
			connection = DriverManager.getConnection(url, username, password);
		}
		return connection;
	}
}
