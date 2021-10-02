package br.com.desafiomv.teste;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.desafiomv.dao.DataSource;



public class Main {

	public static void main(String[] args) {
		
		DataSource d = new DataSource();
		
		d.getConnection();
	}
	}
