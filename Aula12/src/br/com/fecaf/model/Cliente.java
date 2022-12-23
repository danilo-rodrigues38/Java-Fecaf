package br.com.fecaf.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fecaf.repository.ConexaoMysql;

public class Cliente {
	//Atributos
	private int id;
	private String nome;
	private String telefone;
	private String celular;
	private String email;
	
	//Construtor
	public Cliente () {
		
	}

	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Metodos
	//Insere um novo Cliente no Banco de Dados
	public boolean setNovoCliente (Cliente novoCliente) throws ClassNotFoundException, SQLException {
		boolean status;
		
		try {
			//instancia da classe de conexao com o MySQL
			ConexaoMysql conexaoMysql = new ConexaoMysql();
			//Recebe a conexao que foi estabelecida com o BD
			Connection conexao = conexaoMysql.getConnection();
			
			//Prepara o script SQL para ser enviado ao BD
			PreparedStatement stmt = conexao.prepareStatement("insert into tbl_cliente "
					+ "(nome, telefone, celular, email) values (?, ?, ?, ?)");
			
			//Validação dos valores antes de ser enviado para o BD
			stmt.setString(1, novoCliente.getNome());
			stmt.setString(2, novoCliente.getTelefone());
			stmt.setString(3, novoCliente.getCelular());
			stmt.setString(4, novoCliente.getEmail());
			
			//Executa o script SQL no BD
			stmt.execute();
			stmt.close();
			status = true;
			
		} catch (Exception e) {
			status = false;
		}

		//insert
		return status;
	}
	
	//Retorna os clientes do Banco de Dados
	public void getListClientes () throws ClassNotFoundException, SQLException {
		//instancia da classe de conexao com o MySQL
		ConexaoMysql conexaoMysql = new ConexaoMysql();
		//Recebe a conexao que foi estabelecida com o BD
		Connection conexao = conexaoMysql.getConnection();
		
		String sql = "select * from tbl_cliente order by id desc";
		//Prepara o script SQL para ser enviado ao BD
		Statement stmt = conexao.prepareStatement(sql);
		
		ResultSet rsClientes = stmt.executeQuery(sql);
		
		while(rsClientes.next()) {
			System.out.println("########################################################");
			System.out.println("ID:" + rsClientes.getInt("id"));
			System.out.println("Nome do Cliente:" + rsClientes.getString("nome"));
			System.out.println("Telefone do Cliente:" + rsClientes.getString("telefone"));
			System.out.println("Celular do Cliente:" + rsClientes.getString("celular"));
			System.out.println("Email do Cliente:" + rsClientes.getString("email"));
			System.out.println("########################################################");
			
		}
		
		stmt.close();
		
		
		
		
	}
}







