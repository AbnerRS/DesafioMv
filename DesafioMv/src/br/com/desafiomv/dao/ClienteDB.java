package br.com.desafiomv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.desafiomv.model.Cliente;

public class ClienteDB {
	
	private PreparedStatement pst = null;
	private final String SQL_INSERE_CLIENTE = "INSERT INTO CLIENTE (NOME, TELEFONE, ENDERECO, TIPO, DATA_INCLUSAO) VALUES (?, ?, ?, ?, SYSDATE)";

	public boolean cadastrarCliente(Cliente cliente) {

		boolean ret = false;
		Connection conn = DataSource.getConnection();

		try {
			pst = conn.prepareStatement(SQL_INSERE_CLIENTE);
			pst.setString(1, cliente.getNome());
			pst.setString(2, cliente.getTelefone());
			pst.setString(3, cliente.getEndereco());
			pst.setString(4, cliente.getTipo());
			
		
			ret = pst.execute();
			pst.close();
			DataSource.closeDataSource();

		} catch (SQLException e) {
			System.out.println("Erro ao Executar o Statment " + e.toString());
		}
		
		return ret;

	}
}
