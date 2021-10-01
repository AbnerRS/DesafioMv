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
	
	private Connection connection;

	
	public DataSource () {
		
		try {
			
			hostname = "192.168.0.144";
			port     = 1521;
			database = "DesafioMv";
			username = "admin";
			password = "admin";
			
			String url = "jdbc:oracle://" + hostname+ ":" + port + "/" + database;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            Object conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.144:1521:xe", username, password);
		}
		catch(SQLException ex) {
			System.err.println("ERRO na Conexão " + ex.getMessage());
		}
		catch(Exception ex) {
			System.err.println("ERRO geral" + ex.getMessage());
		}
	}
	
	public Connection getConnection() {
		return this.connection;
		
	}
	
	public void closeDataSource() {
		
	}
	
}
