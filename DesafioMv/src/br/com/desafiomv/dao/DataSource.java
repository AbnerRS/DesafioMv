package br.com.desafiomv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSource {

	private String hostname;
	private int port;
	private String database;
	private String username;
	private String password;

	private static Connection connection;

	public  DataSource() {

		if (connection == null) {
		try {
				
			String driver = "oracle.jdbc.OracleDriver";
			hostname = "192.168.0.144";
			port = 1521;
			database = "xe";
			username = "admin";
			password = "admin";

			String url = "jdbc:oracle:thin:@" + hostname + ":" + port + ":" + database;

			Class.forName(driver);
			System.out.println("Driver carregado");

			connection = DriverManager.getConnection(url, username, password);

			System.out.println("Conectado");

			} catch (ClassNotFoundException ex) {
			System.err.println("ERRO ao carregar driver" + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Erro ao se conectar");
		}
	
		
	}
	}

	public static Connection getConnection() {
		return connection;
	}

	
	public static void closeDataSource() {
		try {
			connection.close();
			connection = null;

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
