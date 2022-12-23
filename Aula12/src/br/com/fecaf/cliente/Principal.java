package br.com.fecaf.cliente;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.fecaf.model.Cliente;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner entradaDados = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Nome:");
		cliente.setNome(entradaDados.next());
		
		System.out.println("Telefone:");
		cliente.setTelefone(entradaDados.next());
		
		System.out.println("Celular:");
		cliente.setCelular(entradaDados.next());
		
		System.out.println("Email:");
		cliente.setEmail(entradaDados.next());
		
		//Metodo para inserir o novo Cliente
		if (cliente.setNovoCliente(cliente))
			System.out.println("Cliente cadastrado com sucesso!");
		else
			System.out.println("Registro não inserido no banco de dados!");
		
		
		cliente.getListClientes();
		entradaDados.close();

	}

}
