package br.com.fecaf.json;

import java.util.ArrayList;

import org.json.JSONObject;

public class Clientes {

	public static void main(String[] args) {
		// Formato de dados JSON (JavaScript Object Notation)
		
		JSONObject cliente = new JSONObject();

		cliente.put("nome", "Jose da Silva");
		cliente.put("email", "josedasilva@fecaf.com.br");
		cliente.put("telefone", "1198765432");
		
		System.out.println(cliente);
		
		
		JSONObject cliente2 = new JSONObject();

		cliente2.put("nome", "Maria da Silva");
		cliente2.put("email", "mariadasilva@fecaf.com.br");
		cliente2.put("telefone", "1198765543");
		
		System.out.println(cliente2);
		
		ArrayList<Object> arrayClientes = new ArrayList<Object>();
		
		arrayClientes.add(cliente);
		arrayClientes.add(cliente2);
		
		System.out.println(arrayClientes);


	}

}
