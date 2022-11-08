package br.com.fecaf.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySql {
	
	// Método construtor.
	public ConexaoMySql() {
		
	}
	
	// Retorna a String de Conexão com o Banco de Dados MySQL
	public Connection getConnection() throws ClassNotFoundException {
		// Indica qual é o drive de conxão com o MySQL.
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/db_clientes?useTimezone=true&serverTimezone=UTC","root","Vrbo2404@");
	}

}
