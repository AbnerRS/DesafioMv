package br.com.desafiomv.dao;

import java.sql.Connection;

import br.com.desafiomv.model.Cliente;

public class ClienteDB {

	public void cadastrarCliente(Cliente cliente) {

		try {
			Connection connection = DataSource.getConnection();

			String sql = "INSERT INTO CLIENTE ( ID, NOME, TELEFONE, ENDERECO, TIPO, DATA) VALUES (?, ?, ?, ?, ?, SYSDATE) ";

			connection.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
