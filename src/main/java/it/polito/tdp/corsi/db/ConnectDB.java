package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	public static Connection getConnection() {
		
		try {
			String url="jdbc:mysql://localhost:3306/iscritticorsi?user=root&password=rootroot";
			return DriverManager.getConnection(url);
			
		} catch (SQLException e) {
			
			System.err.println("Errore connessione!");
			e.printStackTrace();
			return null;
			
		}
	}
	
}
